module Print.Helper where

import Data.Char (toUpper)
import Text.PrettyPrint.HughesPJ


-- | Constants 
cValues     = text "Values"
cValuesMod  = text "Values"

-- | Helpers
firstToCap :: String -> Doc
firstToCap [] = empty
firstToCap (x:xs) = text (toUpper x : xs)

period = text "."
