// GeNeRaTeD fOr: ./Values/Composite/Bits/Bits.cbs
package funcons.algebras;

public interface BitsAlg<E> {
  E bits_();
  E bit_vector__(E[] args);
  E bytes_();
  E octets_();
  E bit_vector_not__(E[] args);
  E bit_vector_and__(E[] args);
  E bit_vector_or__(E[] args);
  E bit_vector_xor__(E[] args);
  E bit_vector_shift_left__(E[] args);
  E bit_vector_logical_shift_right__(E[] args);
  E bit_vector_arithmetic_shift_right__(E[] args);
  E integer_to_bit_vector__(E[] args);
  E bit_vector_to_integer__(E[] args);
  E bit_vector_to_natural__(E[] args);
  E unsigned_bit_vector_maximum__(E[] args);
  E signed_bit_vector_maximum__(E[] args);
  E signed_bit_vector_minimum__(E[] args);
  E is_in_signed_bit_vector__(E[] args);
  E is_in_unsigned_bit_vector__(E[] args);
  E bit_vectors__(E[] args);
}