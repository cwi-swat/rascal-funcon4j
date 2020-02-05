// GeNeRaTeD fOr: ./Computations/Normal/Flowing/Flowing.cbs
package funcons.prettyprinter;

import funcons.algebras.FlowingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableFlowingFactory extends FlowingAlg<IPrint> {
  @Override
  default IPrint left_to_right__(IPrint[] args) {
    return FCTPrinter.variadic("left-to-right",args);
  }
  
  @Override
  default IPrint l_to_r__(IPrint[] args) {
    return FCTPrinter.variadic("l-to-r",args);
  }
  
  @Override
  default IPrint right_to_left__(IPrint[] args) {
    return FCTPrinter.variadic("right-to-left",args);
  }
  
  @Override
  default IPrint r_to_l__(IPrint[] args) {
    return FCTPrinter.variadic("r-to-l",args);
  }
  
  @Override
  default IPrint sequential__(IPrint[] args) {
    return FCTPrinter.variadic("sequential",args);
  }
  
  @Override
  default IPrint seq__(IPrint[] args) {
    return FCTPrinter.variadic("seq",args);
  }
  
  @Override
  default IPrint effect__(IPrint[] args) {
    return FCTPrinter.variadic("effect",args);
  }
  
  @Override
  default IPrint choice__(IPrint[] args) {
    return FCTPrinter.variadic("choice",args);
  }
  
  @Override
  default IPrint if_true_else_(IPrint arg1,IPrint arg2,IPrint arg3) {
    return FCTPrinter.fixed("if-true-else",arg1, arg2, arg3);
  }
  
  @Override
  default IPrint if_else_(IPrint arg1,IPrint arg2,IPrint arg3) {
    return FCTPrinter.fixed("if-else",arg1, arg2, arg3);
  }
  
  @Override
  default IPrint while_true__(IPrint[] args) {
    return FCTPrinter.variadic("while-true",args);
  }
  
  @Override
  default IPrint while__(IPrint[] args) {
    return FCTPrinter.variadic("while",args);
  }
  
  @Override
  default IPrint do_while_true__(IPrint[] args) {
    return FCTPrinter.variadic("do-while-true",args);
  }
  
  @Override
  default IPrint do_while__(IPrint[] args) {
    return FCTPrinter.variadic("do-while",args);
  }
  
  @Override
  default IPrint interleave__(IPrint[] args) {
    return FCTPrinter.variadic("interleave",args);
  }
  
  @Override
  default IPrint signal_() {
    return FCTPrinter.nullary("signal");
  }
  
  @Override
  default IPrint yield_() {
    return FCTPrinter.nullary("yield");
  }
  
  @Override
  default IPrint yield_on_value__(IPrint[] args) {
    return FCTPrinter.variadic("yield-on-value",args);
  }
  
  @Override
  default IPrint yield_on_abrupt__(IPrint[] args) {
    return FCTPrinter.variadic("yield-on-abrupt",args);
  }
  
  @Override
  default IPrint atomic__(IPrint[] args) {
    return FCTPrinter.variadic("atomic",args);
  }
  
  @Override
  default IPrint yielding_() {
    return FCTPrinter.nullary("yielding");
  }
}