module lang::funcon::Apply

data FunCon
  = abs(FunCon exp)
  | abs(FunCon patt, FunCon exp) // TODO is this correct?
  | apply(FunCon abs, FunCon arg)
  | compose(FunCon f, FunCon g)
  | closure(FunCon x, FunCon environment)
  | close(FunCon abs)
  | bind(FunCon id)
  ;