// GeNeRaTeD fOr: ./Values/Composite/References/References.cbs
package funcons.prettyprinter;

import funcons.algebras.ReferencesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableReferencesFactory extends ReferencesAlg<IPrint> {
  @Override
  default IPrint reference__(IPrint[] args) {
    return FCTPrinter.variadic("reference",args);
  }
  
  @Override
  default IPrint pointer_null_() {
    return FCTPrinter.nullary("pointer-null");
  }
  
  @Override
  default IPrint dereference__(IPrint[] args) {
    return FCTPrinter.variadic("dereference",args);
  }
  
  @Override
  default IPrint references__(IPrint[] args) {
    return FCTPrinter.variadic("references",args);
  }
  
  @Override
  default IPrint pointers__(IPrint[] args) {
    return FCTPrinter.variadic("pointers",args);
  }
}