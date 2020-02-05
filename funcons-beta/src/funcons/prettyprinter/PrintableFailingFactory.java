// GeNeRaTeD fOr: ./Computations/Abnormal/Failing/Failing.cbs
package funcons.prettyprinter;

import funcons.algebras.FailingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableFailingFactory extends FailingAlg<IPrint> {
  @Override
  default IPrint failed_() {
    return FCTPrinter.nullary("failed");
  }
  
  @Override
  default IPrint finalise_failing__(IPrint[] args) {
    return FCTPrinter.variadic("finalise-failing",args);
  }
  
  @Override
  default IPrint fail_() {
    return FCTPrinter.nullary("fail");
  }
  
  @Override
  default IPrint else__(IPrint[] args) {
    return FCTPrinter.variadic("else",args);
  }
  
  @Override
  default IPrint else_choice__(IPrint[] args) {
    return FCTPrinter.variadic("else-choice",args);
  }
  
  @Override
  default IPrint check_true__(IPrint[] args) {
    return FCTPrinter.variadic("check-true",args);
  }
  
  @Override
  default IPrint check__(IPrint[] args) {
    return FCTPrinter.variadic("check",args);
  }
  
  @Override
  default IPrint checked__(IPrint[] args) {
    return FCTPrinter.variadic("checked",args);
  }
  
  @Override
  default IPrint failing_() {
    return FCTPrinter.nullary("failing");
  }
}