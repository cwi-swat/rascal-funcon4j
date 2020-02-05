// GeNeRaTeD fOr: ./Values/Primitive/Floats/Floats.cbs
module lang::funcon::Floats

data FunCon
  = binary32_()
  | binary64_()
  | binary128_()
  | decimal64_()
  | decimal128_()
  | float__(list[FunCon] args)
  | quiet_not_a_number__(list[FunCon] args)
  | qnan__(list[FunCon] args)
  | signaling_not_a_number__(list[FunCon] args)
  | snan__(list[FunCon] args)
  | positive_infinity__(list[FunCon] args)
  | pos_inf__(list[FunCon] args)
  | negative_infinity__(list[FunCon] args)
  | neg_inf__(list[FunCon] args)
  | float_convert__(list[FunCon] args)
  | decimal_float__(list[FunCon] args)
  | float_equal__(list[FunCon] args)
  | float_is_less__(list[FunCon] args)
  | float_is_less_or_equal__(list[FunCon] args)
  | float_is_greater__(list[FunCon] args)
  | float_is_greater_or_equal__(list[FunCon] args)
  | float_negate__(list[FunCon] args)
  | float_absolute_value__(list[FunCon] args)
  | float_add__(list[FunCon] args)
  | float_subtract__(list[FunCon] args)
  | float_multiply__(list[FunCon] args)
  | float_multiply_add__(list[FunCon] args)
  | float_divide__(list[FunCon] args)
  | float_remainder__(list[FunCon] args)
  | float_sqrt__(list[FunCon] args)
  | float_integer_power__(list[FunCon] args)
  | float_float_power__(list[FunCon] args)
  | float_round_ties_to_even__(list[FunCon] args)
  | float_round_ties_to_infinity__(list[FunCon] args)
  | float_floor__(list[FunCon] args)
  | float_ceiling__(list[FunCon] args)
  | float_truncate__(list[FunCon] args)
  | float_pi__(list[FunCon] args)
  | float_e__(list[FunCon] args)
  | float_log__(list[FunCon] args)
  | float_log10__(list[FunCon] args)
  | float_exp__(list[FunCon] args)
  | float_sin__(list[FunCon] args)
  | float_cos__(list[FunCon] args)
  | float_tan__(list[FunCon] args)
  | float_asin__(list[FunCon] args)
  | float_acos__(list[FunCon] args)
  | float_atan__(list[FunCon] args)
  | float_sinh__(list[FunCon] args)
  | float_cosh__(list[FunCon] args)
  | float_tanh__(list[FunCon] args)
  | float_asinh__(list[FunCon] args)
  | float_acosh__(list[FunCon] args)
  | float_atanh__(list[FunCon] args)
  | float_atan2__(list[FunCon] args)
  | float_formats_()
  | floats__(list[FunCon] args)
  ;
FunCon float_(FunCon args...) = float__(args);
FunCon quiet_not_a_number_(FunCon args...) = quiet_not_a_number__(args);
FunCon qnan_(FunCon args...) = qnan__(args);
FunCon signaling_not_a_number_(FunCon args...) = signaling_not_a_number__(args);
FunCon snan_(FunCon args...) = snan__(args);
FunCon positive_infinity_(FunCon args...) = positive_infinity__(args);
FunCon pos_inf_(FunCon args...) = pos_inf__(args);
FunCon negative_infinity_(FunCon args...) = negative_infinity__(args);
FunCon neg_inf_(FunCon args...) = neg_inf__(args);
FunCon float_convert_(FunCon args...) = float_convert__(args);
FunCon decimal_float_(FunCon args...) = decimal_float__(args);
FunCon float_equal_(FunCon args...) = float_equal__(args);
FunCon float_is_less_(FunCon args...) = float_is_less__(args);
FunCon float_is_less_or_equal_(FunCon args...) = float_is_less_or_equal__(args);
FunCon float_is_greater_(FunCon args...) = float_is_greater__(args);
FunCon float_is_greater_or_equal_(FunCon args...) = float_is_greater_or_equal__(args);
FunCon float_negate_(FunCon args...) = float_negate__(args);
FunCon float_absolute_value_(FunCon args...) = float_absolute_value__(args);
FunCon float_add_(FunCon args...) = float_add__(args);
FunCon float_subtract_(FunCon args...) = float_subtract__(args);
FunCon float_multiply_(FunCon args...) = float_multiply__(args);
FunCon float_multiply_add_(FunCon args...) = float_multiply_add__(args);
FunCon float_divide_(FunCon args...) = float_divide__(args);
FunCon float_remainder_(FunCon args...) = float_remainder__(args);
FunCon float_sqrt_(FunCon args...) = float_sqrt__(args);
FunCon float_integer_power_(FunCon args...) = float_integer_power__(args);
FunCon float_float_power_(FunCon args...) = float_float_power__(args);
FunCon float_round_ties_to_even_(FunCon args...) = float_round_ties_to_even__(args);
FunCon float_round_ties_to_infinity_(FunCon args...) = float_round_ties_to_infinity__(args);
FunCon float_floor_(FunCon args...) = float_floor__(args);
FunCon float_ceiling_(FunCon args...) = float_ceiling__(args);
FunCon float_truncate_(FunCon args...) = float_truncate__(args);
FunCon float_pi_(FunCon args...) = float_pi__(args);
FunCon float_e_(FunCon args...) = float_e__(args);
FunCon float_log_(FunCon args...) = float_log__(args);
FunCon float_log10_(FunCon args...) = float_log10__(args);
FunCon float_exp_(FunCon args...) = float_exp__(args);
FunCon float_sin_(FunCon args...) = float_sin__(args);
FunCon float_cos_(FunCon args...) = float_cos__(args);
FunCon float_tan_(FunCon args...) = float_tan__(args);
FunCon float_asin_(FunCon args...) = float_asin__(args);
FunCon float_acos_(FunCon args...) = float_acos__(args);
FunCon float_atan_(FunCon args...) = float_atan__(args);
FunCon float_sinh_(FunCon args...) = float_sinh__(args);
FunCon float_cosh_(FunCon args...) = float_cosh__(args);
FunCon float_tanh_(FunCon args...) = float_tanh__(args);
FunCon float_asinh_(FunCon args...) = float_asinh__(args);
FunCon float_acosh_(FunCon args...) = float_acosh__(args);
FunCon float_atanh_(FunCon args...) = float_atanh__(args);
FunCon float_atan2_(FunCon args...) = float_atan2__(args);
FunCon floats_(FunCon args...) = floats__(args);