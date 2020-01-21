module lang::funcon::Map

data FunCon
  = id(str s)
  | nameId(str namespace, str name)
  | bindValue(FunCon id, FunCon exp)
  | boundValue(FunCon id)
  | scope(FunCon localBindings, FunCon exp)
  | given()
  | supply(FunCon exp, FunCon x)
  | environment()
  | environment(FunCon id, FunCon val)
  | \map(FunCon key, FunCon val)
  | mapUpdate(FunCon \map, FunCon key, FunCon e)
  | mapDomain(FunCon \map)
  | mapUnion(FunCon map1, FunCon map2)
  | mapOver(FunCon map1, FunCon map2)
  ;