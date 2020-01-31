
module Print.Interpreter where

import Types.Abstract
import Print.Helper

import Text.PrettyPrint.HughesPJ

-- | Given a module name, make a Haskell module
ppInterpreter :: String -> Interpreter -> String
ppInterpreter mod i =  render $
            text "module" <+> text mod <+> text "where"
        $+$ imports
        $+$ ppValues values
        $+$ vcat (map ppEntity (int_entities i))
        $+$ vcat (map ppFuncon (int_funcons i))
 where  values  = (int_values i)
        opMap   = [ (n,os) | ValueSort n _ os <- values ]
        imports = vcat (map (uncurry ppImport) opMap)
        
ppImport :: String -> [Code] -> Doc
ppImport name ops = text "import" <+> cValuesMod <> period  <> firstToCap name 
                        <+> parens (hsep $ punctuate comma (map text ops))
   
ppValues vs = text "data" <+> cValues <+> equals <+> text "Null"

ppEntity (Entity id ty val) = 
    case val of
        Val     -> text "type" <+> ty_name <+> equals <+> cValues 
        Sort s  -> text "type" <+> ty_name <+> equals <+> firstToCap s
 where  ty_name = firstToCap id
ppFuncon f = empty 
