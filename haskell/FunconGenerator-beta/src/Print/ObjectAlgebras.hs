
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
  writeFile file (render' (gInterface cbsfile file_name))
  putStrLn ("Generated " ++ file))
 where  file_dir = srcdir </> foldr (</>) "" file_dir_as_list 
        file     = file_dir </> file_name FP.<.> "java"
        file_dir_as_list = ["funcons", "algebras"] 
        modNameAsList = hsmodNameFromPath "Core" cbsfile
        file_name = last modNameAsList ++ "Alg"
        render' filedoc = render (text "// GeNeRaTeD fOr:" <+> text cbsfile $+$ filedoc)

gInterface :: FunconModule -> String -> Doc
gInterface fm modname = 
  text "package funcons.algebras;\n" $+$ 
  text "public" <+> text "interface" <+> text modname <> gAngle [text "E"] <+> lbrace $+$
    nest 2 (
      vsep (concatMap (gSignature (aliases fm)) (funcons fm))
    ) $+$
  rbrace

gSignature :: AliasMap -> FunconSpec -> [Doc]
gSignature amap (F.FunconSpec name sig _ _ _) = concatMap (for_name sig) (my_aliases name amap)
  where for_name sig name = case sig of 
          FPartiallyLazy ss Nothing  -> [fixed (length ss), variadic]
          FNullary                   -> [nullary]
          _                          -> [variadic]
          where variadic = text "E" <+> text (var2id name ++ "_") <> parens (text "E" <> brackets empty <+> text "args") <> semi
                nullary = text "E" <+> text (var2id name ++ "_") <> parens empty <> semi
                fixed n =  text "E" <+> text (var2id name ++ "_") <> gTuple (zipWith (\t n -> t <+> text ("arg" ++ show n)) (repeat (text "E")) [1..n]) <> semi


cbs2algebra_printers :: FilePath -> FilePath -> Component FunconModule (IO ())
cbs2algebra_printers cbsfile srcdir = component (\cbsfile -> return $ do
  createDirectoryIfMissing True file_dir 
  writeFile file (render' (gFactory cbsfile (last modNameAsList) file_name))
  putStrLn ("Generated " ++ file))
 where  file_dir = srcdir </> foldr (</>) "" file_dir_as_list 
        file     = file_dir </> file_name FP.<.> "java"
        file_dir_as_list = ["funcons", "prettyprinter"] 
        modNameAsList = hsmodNameFromPath "Core" cbsfile
        file_name = "Printable" ++ last modNameAsList ++ "Factory"
        render' filedoc = render (text "// GeNeRaTeD fOr:" <+> text cbsfile $+$ filedoc)

gFactory :: FunconModule -> String -> String -> Doc
gFactory fm orig_modname modname = 
  text "package funcons.prettyprinter;\n" $+$
  text ("import funcons.algebras.") <> text orig_modname <> text "Alg" <> semi $+$
  text ("import funcons.carriers.") <> text "IPrint" <> semi $+$
  text ("import funcons.prettyprinter.FCTPrinter") <> semi $+$
  text "public" <+> text "interface" <+> text modname <+> 
   text "extends" <+> text (orig_modname ++ "Alg") <> gAngle [text "IPrint"] <+> lbrace $+$
    nest 2 (
      vsep (concatMap (gFCT (aliases fm)) (funcons fm))
    ) $+$
  rbrace

gFCT :: AliasMap -> FunconSpec -> [Doc]
gFCT amap (F.FunconSpec name sig _ _ _) = concatMap (for_name sig) (my_aliases name amap)
  where for_name sig name = case sig of 
          FPartiallyLazy ss Nothing  -> [common (fixed (length ss)) name (Just $ length ss)
                                        ,common variadic name Nothing]
          FNullary                   -> [common nullary name (Just 0)]
          _                          -> [common variadic name Nothing]
          where common b n mnr = 
                  text "@Override" $+$
                  text "default" <+> text "IPrint" <+> text (var2id n ++ "_") <> params <+> lbrace $+$
                    nest 2 b $+$ 
                  rbrace
                  where params | Just 0 <- mnr = parens empty
                               | Just nr <- mnr = gTuple (zipWith (\t n -> t <+> text ("arg" ++ show n)) (repeat (text "IPrint")) [1..nr])
                               | otherwise = parens (text "IPrint" <> brackets empty <+> text "args")
                return d = text "return" <+> text "FCTPrinter." <> d <> semi
                variadic = return $ text "variadic" <> parens (doubleQuotes (text name) <> comma <> text "args")
                fixed n =  return $ text "fixed" <> parens (doubleQuotes (text name) <> comma <> args)
                  where args = hcat (intersperse (text ", ") (map (\i -> text ("arg" ++ show i)) [1..n])) 
                nullary = return $ text "nullary" <> parens (doubleQuotes (text name)) 

