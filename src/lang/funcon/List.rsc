module lang::funcon::List

data FunCon
  = \list()
  | \list(FunCon x)
  | \list(FunCon x1, FunCon x2)
  | listPrefix(FunCon x, FunCon l)
  | applyToEach(FunCon a, FunCon l)
  | listPrefixMatch(FunCon l, FunCon p1, FunCon p2)
  | listPrefixPatt(FunCon p1, FunCon p2)
  | intClosedInterval(FunCon m, FunCon n)
  | listReverse(FunCon l)
  | listAppend(FunCon list1, FunCon list2)
  ;