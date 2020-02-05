// GeNeRaTeD fOr: ./Values/Composite/Bits/Bits.cbs
module lang::funcon::Bits

data FunCon
  = bits_()
  | bit_vector__(list[FunCon] args)
  | bytes_()
  | octets_()
  | bit_vector_not__(list[FunCon] args)
  | bit_vector_and__(list[FunCon] args)
  | bit_vector_or__(list[FunCon] args)
  | bit_vector_xor__(list[FunCon] args)
  | bit_vector_shift_left__(list[FunCon] args)
  | bit_vector_logical_shift_right__(list[FunCon] args)
  | bit_vector_arithmetic_shift_right__(list[FunCon] args)
  | integer_to_bit_vector__(list[FunCon] args)
  | bit_vector_to_integer__(list[FunCon] args)
  | bit_vector_to_natural__(list[FunCon] args)
  | unsigned_bit_vector_maximum__(list[FunCon] args)
  | signed_bit_vector_maximum__(list[FunCon] args)
  | signed_bit_vector_minimum__(list[FunCon] args)
  | is_in_signed_bit_vector__(list[FunCon] args)
  | is_in_unsigned_bit_vector__(list[FunCon] args)
  | bit_vectors__(list[FunCon] args)
  ;
FunCon bit_vector_(FunCon args...) = bit_vector__(args);
FunCon bit_vector_not_(FunCon args...) = bit_vector_not__(args);
FunCon bit_vector_and_(FunCon args...) = bit_vector_and__(args);
FunCon bit_vector_or_(FunCon args...) = bit_vector_or__(args);
FunCon bit_vector_xor_(FunCon args...) = bit_vector_xor__(args);
FunCon bit_vector_shift_left_(FunCon args...) = bit_vector_shift_left__(args);
FunCon bit_vector_logical_shift_right_(FunCon args...) = bit_vector_logical_shift_right__(args);
FunCon bit_vector_arithmetic_shift_right_(FunCon args...) = bit_vector_arithmetic_shift_right__(args);
FunCon integer_to_bit_vector_(FunCon args...) = integer_to_bit_vector__(args);
FunCon bit_vector_to_integer_(FunCon args...) = bit_vector_to_integer__(args);
FunCon bit_vector_to_natural_(FunCon args...) = bit_vector_to_natural__(args);
FunCon unsigned_bit_vector_maximum_(FunCon args...) = unsigned_bit_vector_maximum__(args);
FunCon signed_bit_vector_maximum_(FunCon args...) = signed_bit_vector_maximum__(args);
FunCon signed_bit_vector_minimum_(FunCon args...) = signed_bit_vector_minimum__(args);
FunCon is_in_signed_bit_vector_(FunCon args...) = is_in_signed_bit_vector__(args);
FunCon is_in_unsigned_bit_vector_(FunCon args...) = is_in_unsigned_bit_vector__(args);
FunCon bit_vectors_(FunCon args...) = bit_vectors__(args);