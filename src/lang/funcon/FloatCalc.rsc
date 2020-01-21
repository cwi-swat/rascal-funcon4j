module lang::funcon::FloatCalc

data FunCon
  = lit(real i)
  | floatAdd(FunCon a, FunCon b)
  | floatNegate(FunCon x)
  | floatSubtract(FunCon a, FunCon b)
  | floatMultiply(FunCon a, FunCon b)
  | floatDivide(FunCon a, FunCon b)
  | floatModulo(FunCon a, FunCon b)
  | floatPowerOf(FunCon a, FunCon b)
  ;
