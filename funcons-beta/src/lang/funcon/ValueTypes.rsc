// GeNeRaTeD fOr: ./Values/Value-Types/Value-Types.cbs
module lang::funcon::ValueTypes

data FunCon
  = is_in_type__(list[FunCon] args)
  | is__(list[FunCon] args)
  | is_value__(list[FunCon] args)
  | is_val__(list[FunCon] args)
  | when_true__(list[FunCon] args)
  | when__(list[FunCon] args)
  | cast_to_type__(list[FunCon] args)
  | cast__(list[FunCon] args)
  | is_equal__(list[FunCon] args)
  | is_eq__(list[FunCon] args)
  | values_()
  | vals_()
  | value_types_()
  | types_()
  | empty_type_()
  | ground_values_()
  | ground_vals_()
  ;
FunCon is_in_type_(FunCon args...) = is_in_type__(args);
FunCon is_(FunCon args...) = is__(args);
FunCon is_value_(FunCon args...) = is_value__(args);
FunCon is_val_(FunCon args...) = is_val__(args);
FunCon when_true_(FunCon args...) = when_true__(args);
FunCon when_(FunCon args...) = when__(args);
FunCon cast_to_type_(FunCon args...) = cast_to_type__(args);
FunCon cast_(FunCon args...) = cast__(args);
FunCon is_equal_(FunCon args...) = is_equal__(args);
FunCon is_eq_(FunCon args...) = is_eq__(args);