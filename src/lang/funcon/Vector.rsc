module lang::funcon::Vector

data FunCon 
  = vector()
	| vector(FunCon val)
  | vectorSelect(FunCon vector, FunCon index)
  | vectorAppend(FunCon vector1, FunCon vector2)
  | vectorLength(FunCon vector)
  | vectorAssign(FunCon vector, FunCon index, FunCon val)
  ;