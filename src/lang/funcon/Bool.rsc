module lang::funcon::Bool

data FunCon
  = \bool(bool x)
  | not(FunCon b)
  | greater(FunCon a, FunCon b)
  | smaller(FunCon a, FunCon b)
  | greaterEqual(FunCon a, FunCon b)
  | smallerEqual(FunCon a, FunCon b)
  | equal(FunCon x1, FunCon x2)
  | physicalEqual(FunCon e1, FunCon e2)
  ;