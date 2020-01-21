module lang::funcon::PolyType


data FunCon
  = instantiatePoly(FunCon x)
  | instantiateIfPoly(FunCon x)
  | generalise(FunCon x)
  | generaliseIfPoly(FunCon x)
  | generaliseDecl(FunCon decl)
  | generaliseMap(FunCon x)
  ;