// GeNeRaTeD fOr: ./Values/Composite/Records/Records.cbs
module lang::funcon::Records

data FunCon
  = record__(list[FunCon] args)
  | record_map__(list[FunCon] args)
  | record_select__(list[FunCon] args)
  | records__(list[FunCon] args)
  ;
FunCon record_(FunCon args...) = record__(args);
FunCon record_map_(FunCon args...) = record_map__(args);
FunCon record_select_(FunCon args...) = record_select__(args);
FunCon records_(FunCon args...) = records__(args);