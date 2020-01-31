
module Print.RascalData where

import Types.ConcreteSyntax (showConcreteTerm)
import Types.SourceAbstractSyntax hiding (CBSFile(..),CBSSpec(..),FunconSpec(..),FSig,FStep,FPremiseStep,FValueSorts(..),Name,FValueSort(..),EntitySpec(..),FSideCondition(..),DataTypeSpec(..),FTerm(..),DataTypeAlt(..),FValSorts(..),FPattern(..), CommentPart(..))
import Types.CoreAbstractSyntax hiding (Lazy, Strict, CBSFile(..),CBSSPec(..),FunconSpec(..),FRewriteRule(..),FPremiseStep(..),FStep(..),FStepRule(..), DataTypeSpec(..), DataTypeAlt(..))
import Types.FunconModule as F
import Print.Util

import CCO.Component

import Prelude hiding ((<$>),(<>))

import Text.PrettyPrint.HughesPJ 
import Data.List (intersperse)

import System.FilePath hiding ((<.>)) 
import qualified System.FilePath as FP
import System.Directory (createDirectoryIfMissing)


cbs2rascal_data :: FilePath -> FilePath -> Component FunconModule (Maybe (IO ()))
cbs2rascal_data cbsfile srcdir = component (\cbsfile -> return $ return $ do
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
  text "data" <+> text "FunCon" $+$ 
  nest 2 (
    equals <+> vcat (intersperse (text "|") (concatMap (gFuncon (aliases fm)) (funcons fm)) ++ [semi])
    )
  where  main_contents = "module lang::funcon::" ++ modname ++ "\n"

gFuncon :: AliasMap -> FunconSpec -> [Doc]
gFuncon amap (F.FunconSpec name sig _ _ _) = concatMap (for_name sig) (my_aliases name amap)
  where for_name sig name = case sig of 
          FPartiallyLazy ss Nothing  -> [fixed (length ss), variadic]
          _                          -> [variadic]
          where variadic = text name <> parens (text "list" <> gList [text "FunCon"] <+> text "args")
                fixed n =  text name <> gTuple (zipWith (\t n -> t <+> text ("arg" ++ show n)) (repeat (text "Funcon")) [1..n])

