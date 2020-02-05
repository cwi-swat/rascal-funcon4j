// GeNeRaTeD fOr: ./Values/Abstraction/Thunks/Thunks.cbs
package funcons.prettyprinter;

import funcons.algebras.ThunksAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableThunksFactory extends ThunksAlg<IPrint> {
  @Override
  default IPrint thunk__(IPrint[] args) {
    return FCTPrinter.variadic("thunk",args);
  }
  
  @Override
  default IPrint force__(IPrint[] args) {
    return FCTPrinter.variadic("force",args);
  }
  
  @Override
  default IPrint thunks__(IPrint[] args) {
    return FCTPrinter.variadic("thunks",args);
  }
}