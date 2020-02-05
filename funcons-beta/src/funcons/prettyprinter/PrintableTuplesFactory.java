// GeNeRaTeD fOr: ./Values/Composite/Tuples/Tuples.cbs
package funcons.prettyprinter;

import funcons.algebras.TuplesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableTuplesFactory extends TuplesAlg<IPrint> {
  @Override
  default IPrint tuple__(IPrint[] args) {
    return FCTPrinter.variadic("tuple",args);
  }
  
  @Override
  default IPrint tuple_elements__(IPrint[] args) {
    return FCTPrinter.variadic("tuple-elements",args);
  }
  
  @Override
  default IPrint tuple_zip__(IPrint[] args) {
    return FCTPrinter.variadic("tuple-zip",args);
  }
  
  @Override
  default IPrint tuples__(IPrint[] args) {
    return FCTPrinter.variadic("tuples",args);
  }
}