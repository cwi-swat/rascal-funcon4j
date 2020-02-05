// GeNeRaTeD fOr: ./Values/Composite/Records/Records.cbs
package funcons.prettyprinter;

import funcons.algebras.RecordsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableRecordsFactory extends RecordsAlg<IPrint> {
  @Override
  default IPrint record__(IPrint[] args) {
    return FCTPrinter.variadic("record",args);
  }
  
  @Override
  default IPrint record_map__(IPrint[] args) {
    return FCTPrinter.variadic("record-map",args);
  }
  
  @Override
  default IPrint record_select__(IPrint[] args) {
    return FCTPrinter.variadic("record-select",args);
  }
  
  @Override
  default IPrint records__(IPrint[] args) {
    return FCTPrinter.variadic("records",args);
  }
}