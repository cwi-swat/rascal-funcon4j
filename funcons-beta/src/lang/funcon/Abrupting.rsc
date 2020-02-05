// GeNeRaTeD fOr: ./Computations/Abnormal/Abrupting/Abrupting.cbs
module lang::funcon::Abrupting

data FunCon
  = stuck_()
  | finalise_abrupting__(list[FunCon] args)
  | abrupt__(list[FunCon] args)
  | handle_abrupt__(list[FunCon] args)
  | finally__(list[FunCon] args)
  ;
FunCon finalise_abrupting_(FunCon args...) = finalise_abrupting__(args);
FunCon abrupt_(FunCon args...) = abrupt__(args);
FunCon handle_abrupt_(FunCon args...) = handle_abrupt__(args);
FunCon finally_(FunCon args...) = finally__(args);