// GeNeRaTeD fOr: ./Computations/Normal/Giving/Giving.cbs
module lang::funcon::Giving

data FunCon
  = initialise_giving__(list[FunCon] args)
  | give_(FunCon arg1,FunCon arg2)
  | given_()
  | no_given__(list[FunCon] args)
  | left_to_right_map__(list[FunCon] args)
  | interleave_map__(list[FunCon] args)
  | left_to_right_repeat_(FunCon arg1,FunCon arg2,FunCon arg3)
  | interleave_repeat_(FunCon arg1,FunCon arg2,FunCon arg3)
  | left_to_right_filter__(list[FunCon] args)
  | interleave_filter__(list[FunCon] args)
  | fold_left__(list[FunCon] args)
  | fold_right__(list[FunCon] args)
  ;
FunCon initialise_giving_(FunCon args...) = initialise_giving__(args);
FunCon no_given_(FunCon args...) = no_given__(args);
FunCon left_to_right_map_(FunCon args...) = left_to_right_map__(args);
FunCon interleave_map_(FunCon args...) = interleave_map__(args);
FunCon left_to_right_filter_(FunCon args...) = left_to_right_filter__(args);
FunCon interleave_filter_(FunCon args...) = interleave_filter__(args);
FunCon fold_left_(FunCon args...) = fold_left__(args);
FunCon fold_right_(FunCon args...) = fold_right__(args);