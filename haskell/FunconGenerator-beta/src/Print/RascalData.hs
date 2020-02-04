
module Print.RascalData where

import Funcons.EDSL(DataTypeMembers(..))

import Types.ConcreteSyntax (showConcreteTerm)
import Types.SourceAbstractSyntax hiding (CBSFile(..),CBSSpec(..),FunconSpec(..),FSig,FStep,FPremiseStep,FValueSorts(..),Name,FValueSort(..),EntitySpec(..),FSideCondition(..),DataTypeSpec(..),FTerm(..),DataTypeAlt(..),FValSorts(..),FPattern(..), CommentPart(..))
import Types.CoreAbstractSyntax hiding (Lazy, Strict, CBSFile(..),CBSSPec(..),FunconSpec(..),FRewriteRule(..),FPremiseStep(..),FStep(..),FStepRule(..), DataTypeSpec(..), DataTypeAlt(..))
import Types.FunconModule as F
import Print.Util

import CCO.Component

import Prelude hiding ((<$>),(<>))

import Text.PrettyPrint.HughesPJ 
import Data.List (intersperse)
import Data.Text (unpack)

import System.FilePath hiding ((<.>)) 
import qualified System.FilePath as FP
import System.Directory (createDirectoryIfMissing)


cbs2rascal_data :: FilePath -> FilePath -> Component FunconModule (IO ())
cbs2rascal_data cbsfile srcdir = component (\cbsfile -> return $ do
  createDirectoryIfMissing True file_dir 
  writeFile file (render' (gDoc cbsfile file_name))
  putStrLn ("Generated " ++ file))
 where  file_dir = srcdir </> foldr (</>) "" file_dir_as_list 
        file     = file_dir </> file_name FP.<.> "rsc"
        file_dir_as_list = ["lang", "funcon"] 
        modNameAsList = hsmodNameFromPath "Core" cbsfile
        file_name = last modNameAsList
        render' filedoc = render (text "// GeNeRaTeD fOr:" <+> text cbsfile $+$ filedoc)

gDoc :: FunconModule -> String -> Doc
gDoc fm modname = 
  text main_contents $+$ 
  if (null (funcons fm)) then empty else 
    text "data" <+> text "FunCon" $+$ 
    nest 2 (vcat $
      (equals <+> head cons_docs <> text ""):
      map (\d -> text "|" <+> d <> text "") (tail cons_docs) ++ 
      [semi]
    ) $+$
    vcat (concatMap (maybe [] (:[]) . snd) (conss ++ ty_conss))
  where conss = concatMap (gFuncon (aliases fm)) (funcons fm)
        ty_conss = concatMap (gData (aliases fm)) (datatypes fm)
        cons_docs = map fst conss ++ map fst ty_conss
        main_contents = "module lang::funcon::" ++ modname ++ "\n"

gFuncon :: AliasMap -> FunconSpec -> [(Doc, Maybe Doc)]
gFuncon amap (F.FunconSpec name sig _ _ _) = map (for_name sig) (my_aliases name amap)
  where for_name sig name = case sig of 
          FPartiallyLazy ss Nothing  -> (fixed (length ss), Nothing)
          FNullary                   -> (nullary name, Nothing)
          _                          -> (variadic name, Just (variadic_smart name))
          where fixed n =  text (var2id name ++ "_") <> gTuple (zipWith (\t n -> t <+> text ("arg" ++ show n)) (repeat (text "FunCon")) [1..n])

gData :: AliasMap -> DataTypeMembers -> [(Doc, Maybe Doc)]
gData amap (DataTypeMemberss name tyargs _) = map for_name (my_aliases (unpack name) amap)
  where for_name name | null tyargs = (nullary name, Nothing)
                      | otherwise   = (variadic name, Just (variadic_smart name))

variadic name = 
  text (var2id name ++ "__") <> parens (text "list" <> gList [text "FunCon"] <+> text "args")
variadic_smart name = 
  text "FunCon" <+> text (var2id name ++ "_") <> parens (text "FunCon" <+> text "args...") <=> 
    text (var2id name ++ "__") <> parens (text "args") <> semi

nullary name = text (var2id name ++ "_") <> parens empty
                
