// GeNeRaTeD fOr: ./Computations/Normal/Interacting/Interacting.cbs
package funcons.prettyprinter;

import funcons.algebras.InteractingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableInteractingFactory extends InteractingAlg<IPrint> {
  @Override
  default IPrint print__(IPrint[] args) {
    return FCTPrinter.variadic("print",args);
  }
  
  @Override
  default IPrint read_() {
    return FCTPrinter.nullary("read");
  }
}