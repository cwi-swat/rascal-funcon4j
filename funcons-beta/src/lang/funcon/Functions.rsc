// GeNeRaTeD fOr: ./Values/Abstraction/Functions/Functions.cbs
module lang::funcon::Functions

data FunCon
  = function__(list[FunCon] args)
  | apply__(list[FunCon] args)
  | supply__(list[FunCon] args)
  | compose__(list[FunCon] args)
  | uncurry__(list[FunCon] args)
  | curry__(list[FunCon] args)
  | partial_apply__(list[FunCon] args)
  | functions__(list[FunCon] args)
  ;
FunCon function_(FunCon args...) = function__(args);
FunCon apply_(FunCon args...) = apply__(args);
FunCon supply_(FunCon args...) = supply__(args);
FunCon compose_(FunCon args...) = compose__(args);
FunCon uncurry_(FunCon args...) = uncurry__(args);
FunCon curry_(FunCon args...) = curry__(args);
FunCon partial_apply_(FunCon args...) = partial_apply__(args);
FunCon functions_(FunCon args...) = functions__(args);