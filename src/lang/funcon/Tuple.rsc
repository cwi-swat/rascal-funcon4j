module lang::funcon::Tuple

data FunCon
  = \tuple()
  | \tuple(FunCon x)
  | \tuple(FunCon x1, FunCon x2)
  | \tuple(FunCon x1, FunCon x2, FunCon x3)
  | tuplePrefix(FunCon x, FunCon tup)
  | tupleHead(FunCon tup)
  | tupleTail(FunCon tup)
  | project(FunCon index, FunCon tup)
  | partialApp(FunCon f, FunCon x)
  | partialAppN(FunCon f, FunCon x)
  | curry(FunCon f)
  | curryN(FunCon n, FunCon f)
  | uncurry(FunCon abs)
  | tuplePrefixMatch(FunCon tup, FunCon p1, FunCon p2)
  | tuplePrefixPatt(FunCon p1, FunCon p2)
  ;