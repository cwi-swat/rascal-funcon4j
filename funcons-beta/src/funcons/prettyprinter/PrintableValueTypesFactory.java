// GeNeRaTeD fOr: ./Values/Value-Types/Value-Types.cbs
package funcons.prettyprinter;

import funcons.algebras.ValueTypesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableValueTypesFactory extends ValueTypesAlg<IPrint> {
  @Override
  default IPrint is_in_type__(IPrint[] args) {
    return FCTPrinter.variadic("is-in-type",args);
  }
  
  @Override
  default IPrint is__(IPrint[] args) {
    return FCTPrinter.variadic("is",args);
  }
  
  @Override
  default IPrint is_value__(IPrint[] args) {
    return FCTPrinter.variadic("is-value",args);
  }
  
  @Override
  default IPrint is_val__(IPrint[] args) {
    return FCTPrinter.variadic("is-val",args);
  }
  
  @Override
  default IPrint when_true__(IPrint[] args) {
    return FCTPrinter.variadic("when-true",args);
  }
  
  @Override
  default IPrint when__(IPrint[] args) {
    return FCTPrinter.variadic("when",args);
  }
  
  @Override
  default IPrint cast_to_type__(IPrint[] args) {
    return FCTPrinter.variadic("cast-to-type",args);
  }
  
  @Override
  default IPrint cast__(IPrint[] args) {
    return FCTPrinter.variadic("cast",args);
  }
  
  @Override
  default IPrint is_equal__(IPrint[] args) {
    return FCTPrinter.variadic("is-equal",args);
  }
  
  @Override
  default IPrint is_eq__(IPrint[] args) {
    return FCTPrinter.variadic("is-eq",args);
  }
  
  @Override
  default IPrint values_() {
    return FCTPrinter.nullary("values");
  }
  
  @Override
  default IPrint vals_() {
    return FCTPrinter.nullary("vals");
  }
  
  @Override
  default IPrint value_types_() {
    return FCTPrinter.nullary("value-types");
  }
  
  @Override
  default IPrint types_() {
    return FCTPrinter.nullary("types");
  }
  
  @Override
  default IPrint empty_type_() {
    return FCTPrinter.nullary("empty-type");
  }
  
  @Override
  default IPrint ground_values_() {
    return FCTPrinter.nullary("ground-values");
  }
  
  @Override
  default IPrint ground_vals_() {
    return FCTPrinter.nullary("ground-vals");
  }
}