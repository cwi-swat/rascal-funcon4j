module lang::funcon::Else

data FunCon
  = only(FunCon v)
  | \any()
  | whenTrue(FunCon exp, FunCon x)
  | match(FunCon exp, FunCon pat)
  | pattAbs(FunCon pat, FunCon x)
  | pattUnion(FunCon pat1, FunCon pat2)
  | pattNonBinding(FunCon pat)
  ;