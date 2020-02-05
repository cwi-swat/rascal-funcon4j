// GeNeRaTeD fOr: ./Values/Composite/Maps/Maps.cbs
module lang::funcon::Maps

data FunCon
  = map__(list[FunCon] args)
  | map_elements__(list[FunCon] args)
  | map_lookup__(list[FunCon] args)
  | lookup__(list[FunCon] args)
  | map_domain__(list[FunCon] args)
  | dom__(list[FunCon] args)
  | map_override__(list[FunCon] args)
  | map_unite__(list[FunCon] args)
  | map_delete__(list[FunCon] args)
  | maps__(list[FunCon] args)
  ;
FunCon map_(FunCon args...) = map__(args);
FunCon map_elements_(FunCon args...) = map_elements__(args);
FunCon map_lookup_(FunCon args...) = map_lookup__(args);
FunCon lookup_(FunCon args...) = lookup__(args);
FunCon map_domain_(FunCon args...) = map_domain__(args);
FunCon dom_(FunCon args...) = dom__(args);
FunCon map_override_(FunCon args...) = map_override__(args);
FunCon map_unite_(FunCon args...) = map_unite__(args);
FunCon map_delete_(FunCon args...) = map_delete__(args);
FunCon maps_(FunCon args...) = maps__(args);