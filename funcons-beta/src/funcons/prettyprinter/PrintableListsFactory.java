// GeNeRaTeD fOr: ./Values/Composite/Lists/Lists.cbs
package funcons.prettyprinter;

import funcons.algebras.ListsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableListsFactory extends ListsAlg<IPrint> {
  @Override
  default IPrint list__(IPrint[] args) {
    return FCTPrinter.variadic("list",args);
  }
  
  @Override
  default IPrint list_elements__(IPrint[] args) {
    return FCTPrinter.variadic("list-elements",args);
  }
  
  @Override
  default IPrint list_nil_() {
    return FCTPrinter.nullary("list-nil");
  }
  
  @Override
  default IPrint nil_() {
    return FCTPrinter.nullary("nil");
  }
  
  @Override
  default IPrint list_cons__(IPrint[] args) {
    return FCTPrinter.variadic("list-cons",args);
  }
  
  @Override
  default IPrint cons__(IPrint[] args) {
    return FCTPrinter.variadic("cons",args);
  }
  
  @Override
  default IPrint list_head__(IPrint[] args) {
    return FCTPrinter.variadic("list-head",args);
  }
  
  @Override
  default IPrint head__(IPrint[] args) {
    return FCTPrinter.variadic("head",args);
  }
  
  @Override
  default IPrint list_tail__(IPrint[] args) {
    return FCTPrinter.variadic("list-tail",args);
  }
  
  @Override
  default IPrint tail__(IPrint[] args) {
    return FCTPrinter.variadic("tail",args);
  }
  
  @Override
  default IPrint list_length__(IPrint[] args) {
    return FCTPrinter.variadic("list-length",args);
  }
  
  @Override
  default IPrint list_append__(IPrint[] args) {
    return FCTPrinter.variadic("list-append",args);
  }
  
  @Override
  default IPrint lists__(IPrint[] args) {
    return FCTPrinter.variadic("lists",args);
  }
}