// GeNeRaTeD fOr: ./Computations/Abnormal/Continuing/Continuing.cbs
package funcons.prettyprinter;

import funcons.algebras.ContinuingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableContinuingFactory extends ContinuingAlg<IPrint> {
  @Override
  default IPrint continued_() {
    return FCTPrinter.nullary("continued");
  }
  
  @Override
  default IPrint finalise_continuing__(IPrint[] args) {
    return FCTPrinter.variadic("finalise-continuing",args);
  }
  
  @Override
  default IPrint continue_() {
    return FCTPrinter.nullary("continue");
  }
  
  @Override
  default IPrint handle_continue__(IPrint[] args) {
    return FCTPrinter.variadic("handle-continue",args);
  }
  
  @Override
  default IPrint continuing_() {
    return FCTPrinter.nullary("continuing");
  }
}