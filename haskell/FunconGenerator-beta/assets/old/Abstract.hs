
module Types.Abstract where

type ID         = String
type Name       = String
type SemName    = Name
type VarStem    = String
-- | For now some parts are taken literally from the description files
-- For example:
--  * Default values for Read and ReadWrite entities
--  * Monoid operators for Write entities
--  * Boolean operations (premises)
-- Basically all operations
type Code = String

data Spec   = Funcon Name Bool {-auxiliary?-} Params Constraint

type Params = [Param]
data Param  = Param Var (Maybe Constraint)
            | TypeParam Var TypeConstraint

data Constraint = Constraint Type (Maybe Term)
data TypeConstraint = TypeEQ Type
                    | SuperType Type
                    | SubType Type

data Var = VarStem VarStem String {- TODO maybe merge VarStem and String -} PostFix
         | Wild String

data Term   = Quoted Term
            | Atom
            | Int
            | Float
            | String
            | TermVar Var
            | Dots
            | Name Name
            | NameApp Name Term
            | VarApp Var Term  
--            | SemApp SemName [Syntax] (Maybe Term)
            | Typed Type Type
            | Computes (Maybe Type) Type
            | PostFix Type PostFix
            | Group (Maybe Type)
            | Union [Type]
            | Sequence Type Type
            | List (Maybe Term)
            | Set (Maybe Term)
            | Map [Maybe (Term, Type)] -- key, value or "..."

data Type   = TTermVar Var
            | TDots
            | TName Name
            | TVarApp Var Term  
            | TTyped Type Type
            | TComputes (Maybe Type) Type
            | TPostFix Type PostFix
            | TGroup (Maybe Type)
            | TUnion [Type]
            | TSequence Type Type
            | TMap [Maybe (Term, Type)] -- key, value or "..."

data PostFix    = Optional
                | Star
                | Plus





data Signature  = Abs Signature
                | Depends Signature Signature
                | SigVar ID
                | USig  ID  {- funcon name -} Signature
                | BSig  ID  Signature Signature
                | TSig  ID Signature Signature Signature

data ValueSort = ValueSort  { value_id      :: ID    
                            , value_sig     :: Maybe Signature 
                            , operations    :: [Code]
                            }

data ValueRef   = Val
                | Sort  ID

data EntityType = Read          Code 
                | Write         Code {- default -} Code {- mappend -}
                | ReadWrite     Code 

defaultCode (Read c) = c
defaultCode (Write c _) = c
defaultCode (ReadWrite c) = c

type Entities = [Entity]
data Entity = Entity { entity_id :: ID, entity_type :: EntityType, entity_val :: ValueRef }

type EntityRef = (ID, ID) -- (entity_id, funcons_id)
type EntityRefs = [EntityRef]

type Conclusion = EvalRule
data EvalRule = EvalRule { ctx :: EntityRefs     -- before the turnstile (all read)
                         , lhs :: SyntaxTuple    -- before the arrow
                         , lab :: Label          -- on the arrow
                         , rhs :: SyntaxTuple    -- after the arrow
                         }
type SyntaxTuple = (FunconPattern, Entities) -- ReadWrite entities
type Label = Entities -- Write entities

data FunconPattern  = Unary FunconPattern
                    | Binary FunconPattern FunconPattern
                    | Ternary FunconPattern FunconPattern FunconPattern
                    | FunconVar ID 

type Rules = [IMSOS]
data IMSOS = IMSOS   { conclusion :: EvalRule, premises   :: Premises }
                    
type Premises = [Premise]
data Premise    = BoolOp    Code
                | Binding   ID          Code
                | Rule      EvalRule 
                | IsVal     ID

data Funcons = Funcons { funcons_id :: ID, funcons_sig :: Signature, rules :: Rules }

data Interpreter = Interpreter  { int_values    :: [ValueSort]
                                , int_entities  :: Entities
                                , int_funcons   :: [Funcons]
                                }
