// GeNeRaTeD fOr: ./Values/Abstraction/Generic/Generic.cbs
package funcons.prettyprinter;

import funcons.algebras.GenericAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableGenericFactory extends GenericAlg<IPrint> {
  @Override
  default IPrint abstraction__(IPrint[] args) {
    return FCTPrinter.variadic("abstraction",args);
  }
  
  @Override
  default IPrint closure__(IPrint[] args) {
    return FCTPrinter.variadic("closure",args);
  }
  
  @Override
  default IPrint enact__(IPrint[] args) {
    return FCTPrinter.variadic("enact",args);
  }
  
  @Override
  default IPrint abstractions__(IPrint[] args) {
    return FCTPrinter.variadic("abstractions",args);
  }
}