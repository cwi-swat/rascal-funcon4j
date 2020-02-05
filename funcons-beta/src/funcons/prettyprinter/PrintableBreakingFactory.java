// GeNeRaTeD fOr: ./Computations/Abnormal/Breaking/Breaking.cbs
package funcons.prettyprinter;

import funcons.algebras.BreakingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableBreakingFactory extends BreakingAlg<IPrint> {
  @Override
  default IPrint broken_() {
    return FCTPrinter.nullary("broken");
  }
  
  @Override
  default IPrint finalise_breaking__(IPrint[] args) {
    return FCTPrinter.variadic("finalise-breaking",args);
  }
  
  @Override
  default IPrint break_() {
    return FCTPrinter.nullary("break");
  }
  
  @Override
  default IPrint handle_break__(IPrint[] args) {
    return FCTPrinter.variadic("handle-break",args);
  }
  
  @Override
  default IPrint breaking_() {
    return FCTPrinter.nullary("breaking");
  }
}