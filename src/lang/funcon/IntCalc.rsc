module lang::funcon::IntCalc

data FunCon
  = lit(int i)
  | intAdd(FunCon a, FunCon b)
  | intNegate(FunCon x)
  | intSubtract(FunCon a, FunCon b)
  | intMultiply(FunCon a, FunCon b)
  | intDivide(FunCon a, FunCon b)
  | intModulo(FunCon a, FunCon b)
  ;