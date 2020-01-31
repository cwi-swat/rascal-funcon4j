
module Main where

import Types.Abstract
import Print.Interpreter

main = putStrLn $ ppInterpreter "Intrepeter1" interpreter

-- | Example interpreter
interpreter = Interpreter values [given] [supply]

-- | Values
values = [ValueSort "ints" Nothing ["int_negate", "int_plus"]]

-- | Entities
given = Entity "given" (Read "null") Val

-- | Funcons
supply = Funcons name sig rules
    where sig   = BSig name (SigVar "X") (Depends (SigVar "X") (SigVar "Y"))
          name  ="supply" 
          rules =   [ IMSOS (EvalRule [("given", "_")]
                                (Binary (FunconVar "X") (FunconVar "Y"), []) [] 
                                (Binary (FunconVar "X") (FunconVar "Y'"), []))
                            [IsVal "X", 
                             Rule $ EvalRule [("given", "X")] (Unary (FunconVar "Y"), []) [] 
                                                              (Unary (FunconVar "Y"), []) ]
                    , IMSOS (EvalRule [] (Binary (FunconVar "X") (FunconVar "Y"), []) []
                                         (Unary (FunconVar "Y"), []))
                            [IsVal "X", IsVal "Y"]
                    ]
