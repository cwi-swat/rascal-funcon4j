// GeNeRaTeD fOr: ./Computations/Abnormal/Abrupting/Abrupting.cbs
package funcons.prettyprinter;

import funcons.algebras.AbruptingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableAbruptingFactory extends AbruptingAlg<IPrint> {
  @Override
  default IPrint stuck_() {
    return FCTPrinter.nullary("stuck");
  }
  
  @Override
  default IPrint finalise_abrupting__(IPrint[] args) {
    return FCTPrinter.variadic("finalise-abrupting",args);
  }
  
  @Override
  default IPrint abrupt__(IPrint[] args) {
    return FCTPrinter.variadic("abrupt",args);
  }
  
  @Override
  default IPrint handle_abrupt__(IPrint[] args) {
    return FCTPrinter.variadic("handle-abrupt",args);
  }
  
  @Override
  default IPrint finally__(IPrint[] args) {
    return FCTPrinter.variadic("finally",args);
  }
}