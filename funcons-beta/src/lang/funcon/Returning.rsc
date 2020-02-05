// GeNeRaTeD fOr: ./Computations/Abnormal/Returning/Returning.cbs
module lang::funcon::Returning

data FunCon
  = returned__(list[FunCon] args)
  | finalise_returning__(list[FunCon] args)
  | return__(list[FunCon] args)
  | handle_return__(list[FunCon] args)
  | returning_()
  ;
FunCon returned_(FunCon args...) = returned__(args);
FunCon finalise_returning_(FunCon args...) = finalise_returning__(args);
FunCon return_(FunCon args...) = return__(args);
FunCon handle_return_(FunCon args...) = handle_return__(args);