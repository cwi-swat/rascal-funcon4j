// GeNeRaTeD fOr: ./Computations/Abnormal/Failing/Failing.cbs
module lang::funcon::Failing

data FunCon
  = failed_()
  | finalise_failing__(list[FunCon] args)
  | fail_()
  | else__(list[FunCon] args)
  | else_choice__(list[FunCon] args)
  | check_true__(list[FunCon] args)
  | check__(list[FunCon] args)
  | checked__(list[FunCon] args)
  | failing_()
  ;
FunCon finalise_failing_(FunCon args...) = finalise_failing__(args);
FunCon else_(FunCon args...) = else__(args);
FunCon else_choice_(FunCon args...) = else_choice__(args);
FunCon check_true_(FunCon args...) = check_true__(args);
FunCon check_(FunCon args...) = check__(args);
FunCon checked_(FunCon args...) = checked__(args);