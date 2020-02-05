// GeNeRaTeD fOr: ./Values/Composite/Variants/Variants.cbs
package funcons.prettyprinter;

import funcons.algebras.VariantsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableVariantsFactory extends VariantsAlg<IPrint> {
  @Override
  default IPrint variant__(IPrint[] args) {
    return FCTPrinter.variadic("variant",args);
  }
  
  @Override
  default IPrint variant_id__(IPrint[] args) {
    return FCTPrinter.variadic("variant-id",args);
  }
  
  @Override
  default IPrint variant_value__(IPrint[] args) {
    return FCTPrinter.variadic("variant-value",args);
  }
  
  @Override
  default IPrint variants__(IPrint[] args) {
    return FCTPrinter.variadic("variants",args);
  }
}