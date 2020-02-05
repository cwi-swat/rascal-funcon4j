// GeNeRaTeD fOr: ./Values/Primitive/Integers/Integers.cbs
module lang::funcon::Integers

data FunCon
  = bounded_integers__(list[FunCon] args)
  | bounded_ints__(list[FunCon] args)
  | positive_integers_()
  | pos_ints_()
  | negative_integers_()
  | neg_ints_()
  | natural_numbers_()
  | nats_()
  | natural_successor__(list[FunCon] args)
  | nat_succ__(list[FunCon] args)
  | natural_predecessor__(list[FunCon] args)
  | nat_pred__(list[FunCon] args)
  | integer_add__(list[FunCon] args)
  | int_add__(list[FunCon] args)
  | integer_subtract__(list[FunCon] args)
  | int_sub__(list[FunCon] args)
  | integer_multiply__(list[FunCon] args)
  | int_mul__(list[FunCon] args)
  | integer_divide__(list[FunCon] args)
  | int_div__(list[FunCon] args)
  | integer_modulo__(list[FunCon] args)
  | int_mod__(list[FunCon] args)
  | integer_power__(list[FunCon] args)
  | int_pow__(list[FunCon] args)
  | integer_absolute_value__(list[FunCon] args)
  | int_abs__(list[FunCon] args)
  | integer_negate__(list[FunCon] args)
  | int_neg__(list[FunCon] args)
  | integer_is_less__(list[FunCon] args)
  | is_less__(list[FunCon] args)
  | integer_is_less_or_equal__(list[FunCon] args)
  | is_less_or_equal__(list[FunCon] args)
  | integer_is_greater__(list[FunCon] args)
  | is_greater__(list[FunCon] args)
  | integer_is_greater_or_equal__(list[FunCon] args)
  | is_greater_or_equal__(list[FunCon] args)
  | binary_natural__(list[FunCon] args)
  | binary__(list[FunCon] args)
  | octal_natural__(list[FunCon] args)
  | octal__(list[FunCon] args)
  | decimal_natural__(list[FunCon] args)
  | decimal__(list[FunCon] args)
  | hexadecimal_natural__(list[FunCon] args)
  | hexadecimal__(list[FunCon] args)
  | integer_sequence__(list[FunCon] args)
  | integers_()
  | ints_()
  | integers_from__(list[FunCon] args)
  | from__(list[FunCon] args)
  | integers_up_to__(list[FunCon] args)
  | up_to__(list[FunCon] args)
  ;
FunCon bounded_integers_(FunCon args...) = bounded_integers__(args);
FunCon bounded_ints_(FunCon args...) = bounded_ints__(args);
FunCon natural_successor_(FunCon args...) = natural_successor__(args);
FunCon nat_succ_(FunCon args...) = nat_succ__(args);
FunCon natural_predecessor_(FunCon args...) = natural_predecessor__(args);
FunCon nat_pred_(FunCon args...) = nat_pred__(args);
FunCon integer_add_(FunCon args...) = integer_add__(args);
FunCon int_add_(FunCon args...) = int_add__(args);
FunCon integer_subtract_(FunCon args...) = integer_subtract__(args);
FunCon int_sub_(FunCon args...) = int_sub__(args);
FunCon integer_multiply_(FunCon args...) = integer_multiply__(args);
FunCon int_mul_(FunCon args...) = int_mul__(args);
FunCon integer_divide_(FunCon args...) = integer_divide__(args);
FunCon int_div_(FunCon args...) = int_div__(args);
FunCon integer_modulo_(FunCon args...) = integer_modulo__(args);
FunCon int_mod_(FunCon args...) = int_mod__(args);
FunCon integer_power_(FunCon args...) = integer_power__(args);
FunCon int_pow_(FunCon args...) = int_pow__(args);
FunCon integer_absolute_value_(FunCon args...) = integer_absolute_value__(args);
FunCon int_abs_(FunCon args...) = int_abs__(args);
FunCon integer_negate_(FunCon args...) = integer_negate__(args);
FunCon int_neg_(FunCon args...) = int_neg__(args);
FunCon integer_is_less_(FunCon args...) = integer_is_less__(args);
FunCon is_less_(FunCon args...) = is_less__(args);
FunCon integer_is_less_or_equal_(FunCon args...) = integer_is_less_or_equal__(args);
FunCon is_less_or_equal_(FunCon args...) = is_less_or_equal__(args);
FunCon integer_is_greater_(FunCon args...) = integer_is_greater__(args);
FunCon is_greater_(FunCon args...) = is_greater__(args);
FunCon integer_is_greater_or_equal_(FunCon args...) = integer_is_greater_or_equal__(args);
FunCon is_greater_or_equal_(FunCon args...) = is_greater_or_equal__(args);
FunCon binary_natural_(FunCon args...) = binary_natural__(args);
FunCon binary_(FunCon args...) = binary__(args);
FunCon octal_natural_(FunCon args...) = octal_natural__(args);
FunCon octal_(FunCon args...) = octal__(args);
FunCon decimal_natural_(FunCon args...) = decimal_natural__(args);
FunCon decimal_(FunCon args...) = decimal__(args);
FunCon hexadecimal_natural_(FunCon args...) = hexadecimal_natural__(args);
FunCon hexadecimal_(FunCon args...) = hexadecimal__(args);
FunCon integer_sequence_(FunCon args...) = integer_sequence__(args);
FunCon integers_from_(FunCon args...) = integers_from__(args);
FunCon from_(FunCon args...) = from__(args);
FunCon integers_up_to_(FunCon args...) = integers_up_to__(args);
FunCon up_to_(FunCon args...) = up_to__(args);