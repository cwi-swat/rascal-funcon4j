// GeNeRaTeD fOr: ./Computations/Normal/Interacting/Interacting.cbs
module lang::funcon::Interacting

data FunCon
  = print__(list[FunCon] args)
  | read_()
  ;
FunCon print_(FunCon args...) = print__(args);