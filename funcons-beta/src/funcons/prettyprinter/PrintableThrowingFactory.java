// GeNeRaTeD fOr: ./Computations/Abnormal/Throwing/Throwing.cbs
package funcons.prettyprinter;

import funcons.algebras.ThrowingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableThrowingFactory extends ThrowingAlg<IPrint> {
  @Override
  default IPrint thrown__(IPrint[] args) {
    return FCTPrinter.variadic("thrown",args);
  }
  
  @Override
  default IPrint finalise_throwing__(IPrint[] args) {
    return FCTPrinter.variadic("finalise-throwing",args);
  }
  
  @Override
  default IPrint throw__(IPrint[] args) {
    return FCTPrinter.variadic("throw",args);
  }
  
  @Override
  default IPrint handle_thrown__(IPrint[] args) {
    return FCTPrinter.variadic("handle-thrown",args);
  }
  
  @Override
  default IPrint handle_recursively__(IPrint[] args) {
    return FCTPrinter.variadic("handle-recursively",args);
  }
  
  @Override
  default IPrint catch_else_throw_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("catch-else-throw",arg1, arg2);
  }
  
  @Override
  default IPrint throwing_() {
    return FCTPrinter.nullary("throwing");
  }
}