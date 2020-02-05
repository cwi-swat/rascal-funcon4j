// GeNeRaTeD fOr: ./Values/Composite/Bits/Bits.cbs
package funcons.prettyprinter;

import funcons.algebras.BitsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableBitsFactory extends BitsAlg<IPrint> {
  @Override
  default IPrint bits_() {
    return FCTPrinter.nullary("bits");
  }
  
  @Override
  default IPrint bit_vector__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector",args);
  }
  
  @Override
  default IPrint bytes_() {
    return FCTPrinter.nullary("bytes");
  }
  
  @Override
  default IPrint octets_() {
    return FCTPrinter.nullary("octets");
  }
  
  @Override
  default IPrint bit_vector_not__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-not",args);
  }
  
  @Override
  default IPrint bit_vector_and__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-and",args);
  }
  
  @Override
  default IPrint bit_vector_or__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-or",args);
  }
  
  @Override
  default IPrint bit_vector_xor__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-xor",args);
  }
  
  @Override
  default IPrint bit_vector_shift_left__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-shift-left",args);
  }
  
  @Override
  default IPrint bit_vector_logical_shift_right__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-logical-shift-right",args);
  }
  
  @Override
  default IPrint bit_vector_arithmetic_shift_right__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-arithmetic-shift-right",args);
  }
  
  @Override
  default IPrint integer_to_bit_vector__(IPrint[] args) {
    return FCTPrinter.variadic("integer-to-bit-vector",args);
  }
  
  @Override
  default IPrint bit_vector_to_integer__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-to-integer",args);
  }
  
  @Override
  default IPrint bit_vector_to_natural__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vector-to-natural",args);
  }
  
  @Override
  default IPrint unsigned_bit_vector_maximum__(IPrint[] args) {
    return FCTPrinter.variadic("unsigned-bit-vector-maximum",args);
  }
  
  @Override
  default IPrint signed_bit_vector_maximum__(IPrint[] args) {
    return FCTPrinter.variadic("signed-bit-vector-maximum",args);
  }
  
  @Override
  default IPrint signed_bit_vector_minimum__(IPrint[] args) {
    return FCTPrinter.variadic("signed-bit-vector-minimum",args);
  }
  
  @Override
  default IPrint is_in_signed_bit_vector__(IPrint[] args) {
    return FCTPrinter.variadic("is-in-signed-bit-vector",args);
  }
  
  @Override
  default IPrint is_in_unsigned_bit_vector__(IPrint[] args) {
    return FCTPrinter.variadic("is-in-unsigned-bit-vector",args);
  }
  
  @Override
  default IPrint bit_vectors__(IPrint[] args) {
    return FCTPrinter.variadic("bit-vectors",args);
  }
}