// GeNeRaTeD fOr: ./Values/Abstraction/Generic/Generic.cbs
module lang::funcon::Generic

data FunCon
  = abstraction__(list[FunCon] args)
  | closure__(list[FunCon] args)
  | enact__(list[FunCon] args)
  | abstractions__(list[FunCon] args)
  ;
FunCon abstraction_(FunCon args...) = abstraction__(args);
FunCon closure_(FunCon args...) = closure__(args);
FunCon enact_(FunCon args...) = enact__(args);
FunCon abstractions_(FunCon args...) = abstractions__(args);