module lang::funcon::Exception

data FunCon
  = \fail()
  | matchFailure()
  | exception(str message)
  | exception(str message, FunCon val)
  | throw_(FunCon exception)
  | catch_(FunCon x, FunCon abs)
  | catchElseRethrow(FunCon x, FunCon abs)
  | else_(FunCon x1, FunCon x2)
  | preferOver(FunCon a1, FunCon a2)
  ;