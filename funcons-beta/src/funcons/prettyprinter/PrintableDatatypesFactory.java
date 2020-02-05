// GeNeRaTeD fOr: ./Values/Composite/Datatypes/Datatypes.cbs
package funcons.prettyprinter;

import funcons.algebras.DatatypesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableDatatypesFactory extends DatatypesAlg<IPrint> {
  @Override
  default IPrint datatype_value__(IPrint[] args) {
    return FCTPrinter.variadic("datatype-value",args);
  }
  
  @Override
  default IPrint datatype_value_id__(IPrint[] args) {
    return FCTPrinter.variadic("datatype-value-id",args);
  }
  
  @Override
  default IPrint datatype_value_elements__(IPrint[] args) {
    return FCTPrinter.variadic("datatype-value-elements",args);
  }
  
  @Override
  default IPrint datatype_values_() {
    return FCTPrinter.nullary("datatype-values");
  }
}