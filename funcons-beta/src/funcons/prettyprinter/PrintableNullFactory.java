// GeNeRaTeD fOr: ./Values/Primitive/Null/Null.cbs
package funcons.prettyprinter;

import funcons.algebras.NullAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableNullFactory extends NullAlg<IPrint> {
  @Override
  default IPrint null_value_() {
    return FCTPrinter.nullary("null-value");
  }
  
  @Override
  default IPrint null_() {
    return FCTPrinter.nullary("null");
  }
  
  @Override
  default IPrint null_type_() {
    return FCTPrinter.nullary("null-type");
  }
}