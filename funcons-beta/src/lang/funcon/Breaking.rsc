// GeNeRaTeD fOr: ./Computations/Abnormal/Breaking/Breaking.cbs
module lang::funcon::Breaking

data FunCon
  = broken_()
  | finalise_breaking__(list[FunCon] args)
  | break_()
  | handle_break__(list[FunCon] args)
  | breaking_()
  ;
FunCon finalise_breaking_(FunCon args...) = finalise_breaking__(args);
FunCon handle_break_(FunCon args...) = handle_break__(args);