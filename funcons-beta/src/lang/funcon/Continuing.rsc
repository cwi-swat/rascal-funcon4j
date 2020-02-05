// GeNeRaTeD fOr: ./Computations/Abnormal/Continuing/Continuing.cbs
module lang::funcon::Continuing

data FunCon
  = continued_()
  | finalise_continuing__(list[FunCon] args)
  | continue_()
  | handle_continue__(list[FunCon] args)
  | continuing_()
  ;
FunCon finalise_continuing_(FunCon args...) = finalise_continuing__(args);
FunCon handle_continue_(FunCon args...) = handle_continue__(args);