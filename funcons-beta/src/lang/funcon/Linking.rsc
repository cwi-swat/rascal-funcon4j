// GeNeRaTeD fOr: ./Computations/Normal/Linking/Linking.cbs
module lang::funcon::Linking

data FunCon
  = link__(list[FunCon] args)
  | initialise_linking__(list[FunCon] args)
  | fresh_link__(list[FunCon] args)
  | fresh_initialised_link_(FunCon arg1,FunCon arg2)
  | fresh_init_link_(FunCon arg1,FunCon arg2)
  | set_link__(list[FunCon] args)
  | follow_link__(list[FunCon] args)
  | follow_if_link__(list[FunCon] args)
  | links_()
  ;
FunCon link_(FunCon args...) = link__(args);
FunCon initialise_linking_(FunCon args...) = initialise_linking__(args);
FunCon fresh_link_(FunCon args...) = fresh_link__(args);
FunCon set_link_(FunCon args...) = set_link__(args);
FunCon follow_link_(FunCon args...) = follow_link__(args);
FunCon follow_if_link_(FunCon args...) = follow_if_link__(args);