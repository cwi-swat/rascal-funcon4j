// GeNeRaTeD fOr: ./Values/Abstraction/Functions/Functions.cbs
package funcons.prettyprinter;

import funcons.algebras.FunctionsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableFunctionsFactory extends FunctionsAlg<IPrint> {
  @Override
  default IPrint function__(IPrint[] args) {
    return FCTPrinter.variadic("function",args);
  }
  
  @Override
  default IPrint apply__(IPrint[] args) {
    return FCTPrinter.variadic("apply",args);
  }
  
  @Override
  default IPrint supply__(IPrint[] args) {
    return FCTPrinter.variadic("supply",args);
  }
  
  @Override
  default IPrint compose__(IPrint[] args) {
    return FCTPrinter.variadic("compose",args);
  }
  
  @Override
  default IPrint uncurry__(IPrint[] args) {
    return FCTPrinter.variadic("uncurry",args);
  }
  
  @Override
  default IPrint curry__(IPrint[] args) {
    return FCTPrinter.variadic("curry",args);
  }
  
  @Override
  default IPrint partial_apply__(IPrint[] args) {
    return FCTPrinter.variadic("partial-apply",args);
  }
  
  @Override
  default IPrint functions__(IPrint[] args) {
    return FCTPrinter.variadic("functions",args);
  }
}