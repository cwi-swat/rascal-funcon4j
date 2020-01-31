
module Types.Abstract where

newtype CBSSpec = CBSSpec {funconSpecs :: [FSpec]}

-- v1
data FSpec = FAbbrv FSig FTerm
           | FRules FSig [FRule] (Maybe FOtherwiseRule) -- v2


data FSig = FSig Name [(Maybe MetaVar, FSort)] FCompType MDoc

type Name = String

data FSort = FSingletonSort FCompType
           | FSequenceSort FCompType FSeqSortOp

data FCompType = FValueType FType
               | FComputesType FType
               | FComputesFromType FType FType

data FSeqSortOp = FStarOp | FPlusOp | FQuestionMarkOp

type MetaVars = [MetaVar]
type MetaVar = String

-- v2
type FOtherwiseRule = FRule

data FRule = FRuleRewrite Name [FPattern] FTerm [FRuleSideCondition]

data FRuleSideCondition = EqualitySideCondition FTerm FTerm
                        | InequalitySideCondition FTerm FTerm
                        | EvaluationSideCondition FTerm FPattern
                        | SortCheckSideCondition FTerm FSort

data FTerm = MetaVar MetaVar
           | FLiteral FLiteral
           | FName Name
           | FApp Name FTerm
           | TupleNotation [FTerm]
           | ListNotation [FTerm]
           | SetNotation [FTerm]
           | MapNotation [FTerm]
           -- etc...

data FType = TypeMetaVar MetaVar
           | TypeTupleNotationFixedSeq [FType]
           | TypeTupleNotationVariableSeq FType FSeqSortOp
           | TypeName Name
           | TypeApp Name FType

data FPattern = FPatternAny
              | FPatternList [FPattern]
--              | FPatternTuple [FPattern]
              | FPatternAnnotated FPattern FSort --v3
              | FPatternADT ADTConstructor (Maybe [FPattern])
--              | FPatternLit FLiteral
              | FPatternVar MetaVar
--              | FPatternSeqVar MetaVar FSeqSortOp -- Note that in this case, the MetaVar should also contain the operator suffix, to facilitate name lookup in the target of the rule.
data FLiteral = FLiteralNat String
              | FLiteralChar Char  -- or should this be String?  To check...
              | FLiteralString String

type ADTConstructor = String -- Text?

--------------------------------------------------------------------------------------


-- Examples

{-
Funcon
  effect(_:values) : =>()
    := ()
-}
effectSpec :: FSpec
effectSpec =
  FAbbrv
    (FSig "effect"
          [(Nothing, FSingletonSort (FValueType (TypeName "values")))]
          (FComputesType (TypeTupleNotationFixedSeq []))
    )
    (TupleNotation [])

{-
Funcon
  set-map(F:S=>T,S:sets(S)) : =>sets(T)
    := list-to-set(list-map(F,set-to-list(S)))
-}
setMapSpec :: FSpec
setMapSpec =
  FAbbrv
    (FSig "set-map"
          [ (Just "F", FSingletonSort (FComputesFromType (TypeMetaVar "S") (TypeMetaVar "T")))
          , (Just "S", FSingletonSort (FValueType (TypeApp "sets" (TypeMetaVar "S"))))
          ]
          (FComputesType (TypeApp "sets" (TypeMetaVar "T")))
    )
    (FApp "list-to-set" (FApp "list-map" (TupleNotation [MetaVar "F", FApp "set-to-list" (MetaVar "S")])))

{-
Funcon
  sequential(Xs:(=>values)*) : =>(values*)
    := discard-empty-tuples(left-to-right(Xs))
-}
sequentialSpec :: FSpec
sequentialSpec =
  FAbbrv
    (FSig "sequential"
          [(Just "Xs", FSequenceSort (FComputesType (TypeName "values")) FStarOp)]
          (FComputesType (TypeTupleNotationVariableSeq (TypeName "values") FStarOp))
    )
    (FApp "discard-empty-tuples" (FApp "left-to-right" (MetaVar "Xs")))

{-
Funcon
  if-then-else(_:booleans, _:=>T, _:=>T) : =>T
Rule
  if-then-else(true, X, _) = X
Rule
  if-then-else(false, _, Y) = Y
-}
ifThenElseSpec :: FSpec
ifThenElseSpec =
  FRules
    (FSig "if-then-else"
          [ (Nothing, FSingletonSort (FValueType (TypeName "booleans")))
          , (Nothing, FSingletonSort (FComputesType (TypeMetaVar "T")))
          , (Nothing, FSingletonSort (FComputesType (TypeMetaVar "T")))
          ]
          (FComputesType (TypeMetaVar "T"))
    )
    [ FRuleRewrite "if-then-else" [FPatternADT "true" Nothing, FPatternVar "X", FPatternAny] (MetaVar "X") []
    , FRuleRewrite "if-then-else" [FPatternADT "false" Nothing, FPatternAny, FPatternVar "Y"] (MetaVar "Y") []
    ]
    Nothing


--------------------------------------------------------------------------------------
