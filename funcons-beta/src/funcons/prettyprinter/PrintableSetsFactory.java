// GeNeRaTeD fOr: ./Values/Composite/Sets/Sets.cbs
package funcons.prettyprinter;

import funcons.algebras.SetsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableSetsFactory extends SetsAlg<IPrint> {
  @Override
  default IPrint set__(IPrint[] args) {
    return FCTPrinter.variadic("set",args);
  }
  
  @Override
  default IPrint set_elements__(IPrint[] args) {
    return FCTPrinter.variadic("set-elements",args);
  }
  
  @Override
  default IPrint is_in_set__(IPrint[] args) {
    return FCTPrinter.variadic("is-in-set",args);
  }
  
  @Override
  default IPrint is_subset__(IPrint[] args) {
    return FCTPrinter.variadic("is-subset",args);
  }
  
  @Override
  default IPrint set_insert__(IPrint[] args) {
    return FCTPrinter.variadic("set-insert",args);
  }
  
  @Override
  default IPrint set_unite__(IPrint[] args) {
    return FCTPrinter.variadic("set-unite",args);
  }
  
  @Override
  default IPrint set_intersect__(IPrint[] args) {
    return FCTPrinter.variadic("set-intersect",args);
  }
  
  @Override
  default IPrint set_difference__(IPrint[] args) {
    return FCTPrinter.variadic("set-difference",args);
  }
  
  @Override
  default IPrint set_size__(IPrint[] args) {
    return FCTPrinter.variadic("set-size",args);
  }
  
  @Override
  default IPrint some_element__(IPrint[] args) {
    return FCTPrinter.variadic("some-element",args);
  }
  
  @Override
  default IPrint element_not_in__(IPrint[] args) {
    return FCTPrinter.variadic("element-not-in",args);
  }
  
  @Override
  default IPrint sets__(IPrint[] args) {
    return FCTPrinter.variadic("sets",args);
  }
}