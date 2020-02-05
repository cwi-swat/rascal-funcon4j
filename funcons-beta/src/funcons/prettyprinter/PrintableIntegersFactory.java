// GeNeRaTeD fOr: ./Values/Primitive/Integers/Integers.cbs
package funcons.prettyprinter;

import funcons.algebras.IntegersAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableIntegersFactory extends IntegersAlg<IPrint> {
  @Override
  default IPrint bounded_integers__(IPrint[] args) {
    return FCTPrinter.variadic("bounded-integers",args);
  }
  
  @Override
  default IPrint bounded_ints__(IPrint[] args) {
    return FCTPrinter.variadic("bounded-ints",args);
  }
  
  @Override
  default IPrint positive_integers_() {
    return FCTPrinter.nullary("positive-integers");
  }
  
  @Override
  default IPrint pos_ints_() {
    return FCTPrinter.nullary("pos-ints");
  }
  
  @Override
  default IPrint negative_integers_() {
    return FCTPrinter.nullary("negative-integers");
  }
  
  @Override
  default IPrint neg_ints_() {
    return FCTPrinter.nullary("neg-ints");
  }
  
  @Override
  default IPrint natural_numbers_() {
    return FCTPrinter.nullary("natural-numbers");
  }
  
  @Override
  default IPrint nats_() {
    return FCTPrinter.nullary("nats");
  }
  
  @Override
  default IPrint natural_successor__(IPrint[] args) {
    return FCTPrinter.variadic("natural-successor",args);
  }
  
  @Override
  default IPrint nat_succ__(IPrint[] args) {
    return FCTPrinter.variadic("nat-succ",args);
  }
  
  @Override
  default IPrint natural_predecessor__(IPrint[] args) {
    return FCTPrinter.variadic("natural-predecessor",args);
  }
  
  @Override
  default IPrint nat_pred__(IPrint[] args) {
    return FCTPrinter.variadic("nat-pred",args);
  }
  
  @Override
  default IPrint integer_add__(IPrint[] args) {
    return FCTPrinter.variadic("integer-add",args);
  }
  
  @Override
  default IPrint int_add__(IPrint[] args) {
    return FCTPrinter.variadic("int-add",args);
  }
  
  @Override
  default IPrint integer_subtract__(IPrint[] args) {
    return FCTPrinter.variadic("integer-subtract",args);
  }
  
  @Override
  default IPrint int_sub__(IPrint[] args) {
    return FCTPrinter.variadic("int-sub",args);
  }
  
  @Override
  default IPrint integer_multiply__(IPrint[] args) {
    return FCTPrinter.variadic("integer-multiply",args);
  }
  
  @Override
  default IPrint int_mul__(IPrint[] args) {
    return FCTPrinter.variadic("int-mul",args);
  }
  
  @Override
  default IPrint integer_divide__(IPrint[] args) {
    return FCTPrinter.variadic("integer-divide",args);
  }
  
  @Override
  default IPrint int_div__(IPrint[] args) {
    return FCTPrinter.variadic("int-div",args);
  }
  
  @Override
  default IPrint integer_modulo__(IPrint[] args) {
    return FCTPrinter.variadic("integer-modulo",args);
  }
  
  @Override
  default IPrint int_mod__(IPrint[] args) {
    return FCTPrinter.variadic("int-mod",args);
  }
  
  @Override
  default IPrint integer_power__(IPrint[] args) {
    return FCTPrinter.variadic("integer-power",args);
  }
  
  @Override
  default IPrint int_pow__(IPrint[] args) {
    return FCTPrinter.variadic("int-pow",args);
  }
  
  @Override
  default IPrint integer_absolute_value__(IPrint[] args) {
    return FCTPrinter.variadic("integer-absolute-value",args);
  }
  
  @Override
  default IPrint int_abs__(IPrint[] args) {
    return FCTPrinter.variadic("int-abs",args);
  }
  
  @Override
  default IPrint integer_negate__(IPrint[] args) {
    return FCTPrinter.variadic("integer-negate",args);
  }
  
  @Override
  default IPrint int_neg__(IPrint[] args) {
    return FCTPrinter.variadic("int-neg",args);
  }
  
  @Override
  default IPrint integer_is_less__(IPrint[] args) {
    return FCTPrinter.variadic("integer-is-less",args);
  }
  
  @Override
  default IPrint is_less__(IPrint[] args) {
    return FCTPrinter.variadic("is-less",args);
  }
  
  @Override
  default IPrint integer_is_less_or_equal__(IPrint[] args) {
    return FCTPrinter.variadic("integer-is-less-or-equal",args);
  }
  
  @Override
  default IPrint is_less_or_equal__(IPrint[] args) {
    return FCTPrinter.variadic("is-less-or-equal",args);
  }
  
  @Override
  default IPrint integer_is_greater__(IPrint[] args) {
    return FCTPrinter.variadic("integer-is-greater",args);
  }
  
  @Override
  default IPrint is_greater__(IPrint[] args) {
    return FCTPrinter.variadic("is-greater",args);
  }
  
  @Override
  default IPrint integer_is_greater_or_equal__(IPrint[] args) {
    return FCTPrinter.variadic("integer-is-greater-or-equal",args);
  }
  
  @Override
  default IPrint is_greater_or_equal__(IPrint[] args) {
    return FCTPrinter.variadic("is-greater-or-equal",args);
  }
  
  @Override
  default IPrint binary_natural__(IPrint[] args) {
    return FCTPrinter.variadic("binary-natural",args);
  }
  
  @Override
  default IPrint binary__(IPrint[] args) {
    return FCTPrinter.variadic("binary",args);
  }
  
  @Override
  default IPrint octal_natural__(IPrint[] args) {
    return FCTPrinter.variadic("octal-natural",args);
  }
  
  @Override
  default IPrint octal__(IPrint[] args) {
    return FCTPrinter.variadic("octal",args);
  }
  
  @Override
  default IPrint decimal_natural__(IPrint[] args) {
    return FCTPrinter.variadic("decimal-natural",args);
  }
  
  @Override
  default IPrint decimal__(IPrint[] args) {
    return FCTPrinter.variadic("decimal",args);
  }
  
  @Override
  default IPrint hexadecimal_natural__(IPrint[] args) {
    return FCTPrinter.variadic("hexadecimal-natural",args);
  }
  
  @Override
  default IPrint hexadecimal__(IPrint[] args) {
    return FCTPrinter.variadic("hexadecimal",args);
  }
  
  @Override
  default IPrint integer_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("integer-sequence",args);
  }
  
  @Override
  default IPrint integers_() {
    return FCTPrinter.nullary("integers");
  }
  
  @Override
  default IPrint ints_() {
    return FCTPrinter.nullary("ints");
  }
  
  @Override
  default IPrint integers_from__(IPrint[] args) {
    return FCTPrinter.variadic("integers-from",args);
  }
  
  @Override
  default IPrint from__(IPrint[] args) {
    return FCTPrinter.variadic("from",args);
  }
  
  @Override
  default IPrint integers_up_to__(IPrint[] args) {
    return FCTPrinter.variadic("integers-up-to",args);
  }
  
  @Override
  default IPrint up_to__(IPrint[] args) {
    return FCTPrinter.variadic("up-to",args);
  }
}