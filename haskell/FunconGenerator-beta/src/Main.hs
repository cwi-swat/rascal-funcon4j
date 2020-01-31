module Main where

import Parsing.Lexer (lexer)
import Parsing.Spec (parser)
import Simplify.ConcreteToAbstract (cs2as)
import Simplify.Simplifier (simplifier)
import Simplify.CoreToTarget (core2target)
import Simplify.LiftStrictness (lift_strictness)
import Simplify.TargetToFunconModules (target2fmodule)
import Print.RascalData (cbs2rascal_data)
import Print.ObjectAlgebras (cbs2algebra_signatures)
import Types.FunconModule (FunconModule)

import CCO.Component (Component, ioRun)

import Control.Arrow ((&&&))
import Control.Monad (when)
import Data.List (isPrefixOf)
import Control.Arrow ((>>>))
import System.Environment (getArgs)

main = do   all_args <- getArgs
            let (options,args) = (filter pred all_args, filter (not . pred) all_args)
                  where pred = isPrefixOf "--"
            case args of
                [cbsf,srcdir]      -> run cbsf srcdir Nothing options
                _       ->  putStrLn $ 
                   "version CBS-beta\n\
                    \usage: cbsc <CBS-PATH> <SRC-DIR> <LANG>\n\
                    \CBS-PATH: path to the .cbs file\n\
                    \            for which code is to be generated.\n\
                    \            The file should be within a directory named \"Funcons\".\n\
                    \SRC-DIR: the source-directory in which the code is to be generated.\n\
                    \LANG: the language for which the .cbs file contains a specification.\n"

run cbsfile srcdir lang options = do
    putStrLn ("Generating " ++ cbsfile)
    cbs_contents <- readFile cbsfile
    let core2target' 
          | "--generate-congruences" `elem` options = core2target >>> lift_strictness
          | otherwise                               = core2target
    target <- ioRun (lexer >>> parser >>> cs2as pholder >>> simplifier 
                       >>> core2target')  cbs_contents
    fmodule <- ioRun (target2fmodule pholder) target
    (rs, sigs) <- ioRun (cbs2 options cbsfile srcdir) fmodule
    rs >> sigs 
 where pholder = any (== "--generate-unspecified-funcons") options
   
cbs2 :: [String] -> FilePath -> FilePath -> CCO.Component.Component FunconModule (IO (), IO ())
cbs2 options cbsd srcd = cbs2rascal_data cbsd srcd &&& cbs2algebra_signatures cbsd srcd


