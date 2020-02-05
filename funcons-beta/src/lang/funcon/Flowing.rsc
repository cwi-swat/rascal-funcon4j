// GeNeRaTeD fOr: ./Computations/Normal/Flowing/Flowing.cbs
module lang::funcon::Flowing

data FunCon
  = left_to_right__(list[FunCon] args)
  | l_to_r__(list[FunCon] args)
  | right_to_left__(list[FunCon] args)
  | r_to_l__(list[FunCon] args)
  | sequential__(list[FunCon] args)
  | seq__(list[FunCon] args)
  | effect__(list[FunCon] args)
  | choice__(list[FunCon] args)
  | if_true_else_(FunCon arg1,FunCon arg2,FunCon arg3)
  | if_else_(FunCon arg1,FunCon arg2,FunCon arg3)
  | while_true__(list[FunCon] args)
  | while__(list[FunCon] args)
  | do_while_true__(list[FunCon] args)
  | do_while__(list[FunCon] args)
  | interleave__(list[FunCon] args)
  | signal_()
  | yield_()
  | yield_on_value__(list[FunCon] args)
  | yield_on_abrupt__(list[FunCon] args)
  | atomic__(list[FunCon] args)
  | yielding_()
  ;
FunCon left_to_right_(FunCon args...) = left_to_right__(args);
FunCon l_to_r_(FunCon args...) = l_to_r__(args);
FunCon right_to_left_(FunCon args...) = right_to_left__(args);
FunCon r_to_l_(FunCon args...) = r_to_l__(args);
FunCon sequential_(FunCon args...) = sequential__(args);
FunCon seq_(FunCon args...) = seq__(args);
FunCon effect_(FunCon args...) = effect__(args);
FunCon choice_(FunCon args...) = choice__(args);
FunCon while_true_(FunCon args...) = while_true__(args);
FunCon while_(FunCon args...) = while__(args);
FunCon do_while_true_(FunCon args...) = do_while_true__(args);
FunCon do_while_(FunCon args...) = do_while__(args);
FunCon interleave_(FunCon args...) = interleave__(args);
FunCon yield_on_value_(FunCon args...) = yield_on_value__(args);
FunCon yield_on_abrupt_(FunCon args...) = yield_on_abrupt__(args);
FunCon atomic_(FunCon args...) = atomic__(args);