// GeNeRaTeD fOr: ./Computations/Abnormal/Returning/Returning.cbs
package funcons.prettyprinter;

import funcons.algebras.ReturningAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableReturningFactory extends ReturningAlg<IPrint> {
  @Override
  default IPrint returned__(IPrint[] args) {
    return FCTPrinter.variadic("returned",args);
  }
  
  @Override
  default IPrint finalise_returning__(IPrint[] args) {
    return FCTPrinter.variadic("finalise-returning",args);
  }
  
  @Override
  default IPrint return__(IPrint[] args) {
    return FCTPrinter.variadic("return",args);
  }
  
  @Override
  default IPrint handle_return__(IPrint[] args) {
    return FCTPrinter.variadic("handle-return",args);
  }
  
  @Override
  default IPrint returning_() {
    return FCTPrinter.nullary("returning");
  }
}