// GeNeRaTeD fOr: ./Values/Abstraction/Thunks/Thunks.cbs
module lang::funcon::Thunks

data FunCon
  = thunk__(list[FunCon] args)
  | force__(list[FunCon] args)
  | thunks__(list[FunCon] args)
  ;
FunCon thunk_(FunCon args...) = thunk__(args);
FunCon force_(FunCon args...) = force__(args);
FunCon thunks_(FunCon args...) = thunks__(args);