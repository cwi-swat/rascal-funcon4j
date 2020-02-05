// GeNeRaTeD fOr: ./Computations/Abnormal/Throwing/Throwing.cbs
module lang::funcon::Throwing

data FunCon
  = thrown__(list[FunCon] args)
  | finalise_throwing__(list[FunCon] args)
  | throw__(list[FunCon] args)
  | handle_thrown__(list[FunCon] args)
  | handle_recursively__(list[FunCon] args)
  | catch_else_throw_(FunCon arg1,FunCon arg2)
  | throwing_()
  ;
FunCon thrown_(FunCon args...) = thrown__(args);
FunCon finalise_throwing_(FunCon args...) = finalise_throwing__(args);
FunCon throw_(FunCon args...) = throw__(args);
FunCon handle_thrown_(FunCon args...) = handle_thrown__(args);
FunCon handle_recursively_(FunCon args...) = handle_recursively__(args);