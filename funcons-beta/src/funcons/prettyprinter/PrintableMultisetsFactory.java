// GeNeRaTeD fOr: ./Values/Composite/Multisets/Multisets.cbs
package funcons.prettyprinter;

import funcons.algebras.MultisetsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableMultisetsFactory extends MultisetsAlg<IPrint> {
  @Override
  default IPrint multiset__(IPrint[] args) {
    return FCTPrinter.variadic("multiset",args);
  }
  
  @Override
  default IPrint multiset_elements__(IPrint[] args) {
    return FCTPrinter.variadic("multiset-elements",args);
  }
  
  @Override
  default IPrint multiset_occurrences__(IPrint[] args) {
    return FCTPrinter.variadic("multiset-occurrences",args);
  }
  
  @Override
  default IPrint multiset_insert__(IPrint[] args) {
    return FCTPrinter.variadic("multiset-insert",args);
  }
  
  @Override
  default IPrint multiset_delete__(IPrint[] args) {
    return FCTPrinter.variadic("multiset-delete",args);
  }
  
  @Override
  default IPrint is_submultiset__(IPrint[] args) {
    return FCTPrinter.variadic("is-submultiset",args);
  }
  
  @Override
  default IPrint multisets__(IPrint[] args) {
    return FCTPrinter.variadic("multisets",args);
  }
}