module lang::funcon::Recursive

data FunCon
  = freshFwd()
  | freshFwds(FunCon idList)
  | setForwards(FunCon idFwdMap)
  | reclose(FunCon idFwdsMap, FunCon decl)
  | recursive(FunCon idList,FunCon decl)
  | recursiveTyped(FunCon idTypeMap, FunCon decl)
  | followFwd(FunCon fwd)
  | followIfFwd(FunCon fwd)
  ;