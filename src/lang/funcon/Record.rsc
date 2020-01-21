module lang::funcon::Record

data FunCon
  = record(FunCon field, FunCon val)
  | field(str name)
  | recordSelect(FunCon record, FunCon field)
  | recordOver(FunCon rec1, FunCon rec2)
  | recordUnion(FunCon rec1, FunCon rec2)
  | recordMatch(FunCon rec, FunCon pattMap)
  ;