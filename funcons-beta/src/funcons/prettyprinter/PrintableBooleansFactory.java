// GeNeRaTeD fOr: ./Values/Primitive/Booleans/Booleans.cbs
package funcons.prettyprinter;

import funcons.algebras.BooleansAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableBooleansFactory extends BooleansAlg<IPrint> {
  @Override
  default IPrint true_() {
    return FCTPrinter.nullary("true");
  }
  
  @Override
  default IPrint false_() {
    return FCTPrinter.nullary("false");
  }
  
  @Override
  default IPrint not__(IPrint[] args) {
    return FCTPrinter.variadic("not",args);
  }
  
  @Override
  default IPrint implies__(IPrint[] args) {
    return FCTPrinter.variadic("implies",args);
  }
  
  @Override
  default IPrint and__(IPrint[] args) {
    return FCTPrinter.variadic("and",args);
  }
  
  @Override
  default IPrint or__(IPrint[] args) {
    return FCTPrinter.variadic("or",args);
  }
  
  @Override
  default IPrint exclusive_or__(IPrint[] args) {
    return FCTPrinter.variadic("exclusive-or",args);
  }
  
  @Override
  default IPrint xor__(IPrint[] args) {
    return FCTPrinter.variadic("xor",args);
  }
  
  @Override
  default IPrint booleans_() {
    return FCTPrinter.nullary("booleans");
  }
  
  @Override
  default IPrint bools_() {
    return FCTPrinter.nullary("bools");
  }
}