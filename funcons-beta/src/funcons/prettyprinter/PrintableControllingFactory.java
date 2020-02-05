// GeNeRaTeD fOr: ./Computations/Abnormal/Controlling/Controlling.cbs
package funcons.prettyprinter;

import funcons.algebras.ControllingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableControllingFactory extends ControllingAlg<IPrint> {
  @Override
  default IPrint continuation__(IPrint[] args) {
    return FCTPrinter.variadic("continuation",args);
  }
  
  @Override
  default IPrint hole_() {
    return FCTPrinter.nullary("hole");
  }
  
  @Override
  default IPrint resume_continuation__(IPrint[] args) {
    return FCTPrinter.variadic("resume-continuation",args);
  }
  
  @Override
  default IPrint control__(IPrint[] args) {
    return FCTPrinter.variadic("control",args);
  }
  
  @Override
  default IPrint delimit_current_continuation__(IPrint[] args) {
    return FCTPrinter.variadic("delimit-current-continuation",args);
  }
  
  @Override
  default IPrint delimit_cc__(IPrint[] args) {
    return FCTPrinter.variadic("delimit-cc",args);
  }
  
  @Override
  default IPrint continuations__(IPrint[] args) {
    return FCTPrinter.variadic("continuations",args);
  }
}