// GeNeRaTeD fOr: ./Values/Composite/Strings/Strings.cbs
package funcons.prettyprinter;

import funcons.algebras.StringsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableStringsFactory extends StringsAlg<IPrint> {
  @Override
  default IPrint strings_() {
    return FCTPrinter.nullary("strings");
  }
  
  @Override
  default IPrint string__(IPrint[] args) {
    return FCTPrinter.variadic("string",args);
  }
  
  @Override
  default IPrint string_append__(IPrint[] args) {
    return FCTPrinter.variadic("string-append",args);
  }
  
  @Override
  default IPrint to_string__(IPrint[] args) {
    return FCTPrinter.variadic("to-string",args);
  }
}