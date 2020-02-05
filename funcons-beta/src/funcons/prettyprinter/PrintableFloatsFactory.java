// GeNeRaTeD fOr: ./Values/Primitive/Floats/Floats.cbs
package funcons.prettyprinter;

import funcons.algebras.FloatsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableFloatsFactory extends FloatsAlg<IPrint> {
  @Override
  default IPrint binary32_() {
    return FCTPrinter.nullary("binary32");
  }
  
  @Override
  default IPrint binary64_() {
    return FCTPrinter.nullary("binary64");
  }
  
  @Override
  default IPrint binary128_() {
    return FCTPrinter.nullary("binary128");
  }
  
  @Override
  default IPrint decimal64_() {
    return FCTPrinter.nullary("decimal64");
  }
  
  @Override
  default IPrint decimal128_() {
    return FCTPrinter.nullary("decimal128");
  }
  
  @Override
  default IPrint float__(IPrint[] args) {
    return FCTPrinter.variadic("float",args);
  }
  
  @Override
  default IPrint quiet_not_a_number__(IPrint[] args) {
    return FCTPrinter.variadic("quiet-not-a-number",args);
  }
  
  @Override
  default IPrint qnan__(IPrint[] args) {
    return FCTPrinter.variadic("qNaN",args);
  }
  
  @Override
  default IPrint signaling_not_a_number__(IPrint[] args) {
    return FCTPrinter.variadic("signaling-not-a-number",args);
  }
  
  @Override
  default IPrint snan__(IPrint[] args) {
    return FCTPrinter.variadic("sNaN",args);
  }
  
  @Override
  default IPrint positive_infinity__(IPrint[] args) {
    return FCTPrinter.variadic("positive-infinity",args);
  }
  
  @Override
  default IPrint pos_inf__(IPrint[] args) {
    return FCTPrinter.variadic("pos-inf",args);
  }
  
  @Override
  default IPrint negative_infinity__(IPrint[] args) {
    return FCTPrinter.variadic("negative-infinity",args);
  }
  
  @Override
  default IPrint neg_inf__(IPrint[] args) {
    return FCTPrinter.variadic("neg-inf",args);
  }
  
  @Override
  default IPrint float_convert__(IPrint[] args) {
    return FCTPrinter.variadic("float-convert",args);
  }
  
  @Override
  default IPrint decimal_float__(IPrint[] args) {
    return FCTPrinter.variadic("decimal-float",args);
  }
  
  @Override
  default IPrint float_equal__(IPrint[] args) {
    return FCTPrinter.variadic("float-equal",args);
  }
  
  @Override
  default IPrint float_is_less__(IPrint[] args) {
    return FCTPrinter.variadic("float-is-less",args);
  }
  
  @Override
  default IPrint float_is_less_or_equal__(IPrint[] args) {
    return FCTPrinter.variadic("float-is-less-or-equal",args);
  }
  
  @Override
  default IPrint float_is_greater__(IPrint[] args) {
    return FCTPrinter.variadic("float-is-greater",args);
  }
  
  @Override
  default IPrint float_is_greater_or_equal__(IPrint[] args) {
    return FCTPrinter.variadic("float-is-greater-or-equal",args);
  }
  
  @Override
  default IPrint float_negate__(IPrint[] args) {
    return FCTPrinter.variadic("float-negate",args);
  }
  
  @Override
  default IPrint float_absolute_value__(IPrint[] args) {
    return FCTPrinter.variadic("float-absolute-value",args);
  }
  
  @Override
  default IPrint float_add__(IPrint[] args) {
    return FCTPrinter.variadic("float-add",args);
  }
  
  @Override
  default IPrint float_subtract__(IPrint[] args) {
    return FCTPrinter.variadic("float-subtract",args);
  }
  
  @Override
  default IPrint float_multiply__(IPrint[] args) {
    return FCTPrinter.variadic("float-multiply",args);
  }
  
  @Override
  default IPrint float_multiply_add__(IPrint[] args) {
    return FCTPrinter.variadic("float-multiply-add",args);
  }
  
  @Override
  default IPrint float_divide__(IPrint[] args) {
    return FCTPrinter.variadic("float-divide",args);
  }
  
  @Override
  default IPrint float_remainder__(IPrint[] args) {
    return FCTPrinter.variadic("float-remainder",args);
  }
  
  @Override
  default IPrint float_sqrt__(IPrint[] args) {
    return FCTPrinter.variadic("float-sqrt",args);
  }
  
  @Override
  default IPrint float_integer_power__(IPrint[] args) {
    return FCTPrinter.variadic("float-integer-power",args);
  }
  
  @Override
  default IPrint float_float_power__(IPrint[] args) {
    return FCTPrinter.variadic("float-float-power",args);
  }
  
  @Override
  default IPrint float_round_ties_to_even__(IPrint[] args) {
    return FCTPrinter.variadic("float-round-ties-to-even",args);
  }
  
  @Override
  default IPrint float_round_ties_to_infinity__(IPrint[] args) {
    return FCTPrinter.variadic("float-round-ties-to-infinity",args);
  }
  
  @Override
  default IPrint float_floor__(IPrint[] args) {
    return FCTPrinter.variadic("float-floor",args);
  }
  
  @Override
  default IPrint float_ceiling__(IPrint[] args) {
    return FCTPrinter.variadic("float-ceiling",args);
  }
  
  @Override
  default IPrint float_truncate__(IPrint[] args) {
    return FCTPrinter.variadic("float-truncate",args);
  }
  
  @Override
  default IPrint float_pi__(IPrint[] args) {
    return FCTPrinter.variadic("float-pi",args);
  }
  
  @Override
  default IPrint float_e__(IPrint[] args) {
    return FCTPrinter.variadic("float-e",args);
  }
  
  @Override
  default IPrint float_log__(IPrint[] args) {
    return FCTPrinter.variadic("float-log",args);
  }
  
  @Override
  default IPrint float_log10__(IPrint[] args) {
    return FCTPrinter.variadic("float-log10",args);
  }
  
  @Override
  default IPrint float_exp__(IPrint[] args) {
    return FCTPrinter.variadic("float-exp",args);
  }
  
  @Override
  default IPrint float_sin__(IPrint[] args) {
    return FCTPrinter.variadic("float-sin",args);
  }
  
  @Override
  default IPrint float_cos__(IPrint[] args) {
    return FCTPrinter.variadic("float-cos",args);
  }
  
  @Override
  default IPrint float_tan__(IPrint[] args) {
    return FCTPrinter.variadic("float-tan",args);
  }
  
  @Override
  default IPrint float_asin__(IPrint[] args) {
    return FCTPrinter.variadic("float-asin",args);
  }
  
  @Override
  default IPrint float_acos__(IPrint[] args) {
    return FCTPrinter.variadic("float-acos",args);
  }
  
  @Override
  default IPrint float_atan__(IPrint[] args) {
    return FCTPrinter.variadic("float-atan",args);
  }
  
  @Override
  default IPrint float_sinh__(IPrint[] args) {
    return FCTPrinter.variadic("float-sinh",args);
  }
  
  @Override
  default IPrint float_cosh__(IPrint[] args) {
    return FCTPrinter.variadic("float-cosh",args);
  }
  
  @Override
  default IPrint float_tanh__(IPrint[] args) {
    return FCTPrinter.variadic("float-tanh",args);
  }
  
  @Override
  default IPrint float_asinh__(IPrint[] args) {
    return FCTPrinter.variadic("float-asinh",args);
  }
  
  @Override
  default IPrint float_acosh__(IPrint[] args) {
    return FCTPrinter.variadic("float-acosh",args);
  }
  
  @Override
  default IPrint float_atanh__(IPrint[] args) {
    return FCTPrinter.variadic("float-atanh",args);
  }
  
  @Override
  default IPrint float_atan2__(IPrint[] args) {
    return FCTPrinter.variadic("float-atan2",args);
  }
  
  @Override
  default IPrint float_formats_() {
    return FCTPrinter.nullary("float-formats");
  }
  
  @Override
  default IPrint floats__(IPrint[] args) {
    return FCTPrinter.variadic("floats",args);
  }
}