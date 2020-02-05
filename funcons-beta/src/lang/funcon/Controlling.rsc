// GeNeRaTeD fOr: ./Computations/Abnormal/Controlling/Controlling.cbs
module lang::funcon::Controlling

data FunCon
  = continuation__(list[FunCon] args)
  | hole_()
  | resume_continuation__(list[FunCon] args)
  | control__(list[FunCon] args)
  | delimit_current_continuation__(list[FunCon] args)
  | delimit_cc__(list[FunCon] args)
  | continuations__(list[FunCon] args)
  ;
FunCon continuation_(FunCon args...) = continuation__(args);
FunCon resume_continuation_(FunCon args...) = resume_continuation__(args);
FunCon control_(FunCon args...) = control__(args);
FunCon delimit_current_continuation_(FunCon args...) = delimit_current_continuation__(args);
FunCon delimit_cc_(FunCon args...) = delimit_cc__(args);
FunCon continuations_(FunCon args...) = continuations__(args);