
module Print.ObjectAlgebras where

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


cbs2algebra_signatures :: FilePath -> FilePath -> Component FunconModule (IO ())
cbs2algebra_signatures cbsfile srcdir = component (\cbsfile -> return $ do
  createDirectoryIfMissing True file_dir 
  writeFile file (render' (gDoc cbsfile file_name))
  putStrLn ("Generated " ++ file))
 where  file_dir = srcdir </> foldr (</>) "" file_dir_as_list 
        file     = file_dir </> file_name FP.<.> "java"
        file_dir_as_list = ["funcons", "algebras"] 
        modNameAsList = hsmodNameFromPath "Core" cbsfile
        file_name = last modNameAsList ++ "Alg"
        render' filedoc = render (text "// GeNeRaTeD fOr:" <+> text cbsfile $+$ filedoc)

gDoc :: FunconModule -> String -> Doc
gDoc fm modname = 
  text "package funcons.algebras;\n" $+$ 
  text "public" <+> text "interface" <+> text modname <> gAngle [text "E"] <+> lbrace $+$
    nest 2 (
      vsep (concatMap (gFuncon (aliases fm)) (funcons fm))
    ) $+$
  rbrace

gFuncon :: AliasMap -> FunconSpec -> [Doc]
gFuncon amap (F.FunconSpec name sig _ _ _) = concatMap (for_name sig) (my_aliases name amap)
  where for_name sig name = case sig of 
          FPartiallyLazy ss Nothing  -> [fixed (length ss), variadic]
          _                          -> [variadic]
          where variadic = text "E" <+> text (var2id name) <> parens (text "E" <> brackets empty <+> text "args") <> semi
                fixed n =  text "E" <+> text (var2id name) <> gTuple (zipWith (\t n -> t <+> text ("arg" ++ show n)) (repeat (text "E")) [1..n]) <> semi

