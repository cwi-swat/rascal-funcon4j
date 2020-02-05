// GeNeRaTeD fOr: ./Values/Composite/Sequences/Sequences.cbs
package funcons.prettyprinter;

import funcons.algebras.SequencesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableSequencesFactory extends SequencesAlg<IPrint> {
  @Override
  default IPrint length__(IPrint[] args) {
    return FCTPrinter.variadic("length",args);
  }
  
  @Override
  default IPrint is_in__(IPrint[] args) {
    return FCTPrinter.variadic("is-in",args);
  }
  
  @Override
  default IPrint index__(IPrint[] args) {
    return FCTPrinter.variadic("index",args);
  }
  
  @Override
  default IPrint first__(IPrint[] args) {
    return FCTPrinter.variadic("first",args);
  }
  
  @Override
  default IPrint second__(IPrint[] args) {
    return FCTPrinter.variadic("second",args);
  }
  
  @Override
  default IPrint third__(IPrint[] args) {
    return FCTPrinter.variadic("third",args);
  }
  
  @Override
  default IPrint first_n__(IPrint[] args) {
    return FCTPrinter.variadic("first-n",args);
  }
  
  @Override
  default IPrint drop_first_n__(IPrint[] args) {
    return FCTPrinter.variadic("drop-first-n",args);
  }
  
  @Override
  default IPrint reverse__(IPrint[] args) {
    return FCTPrinter.variadic("reverse",args);
  }
  
  @Override
  default IPrint n_of__(IPrint[] args) {
    return FCTPrinter.variadic("n-of",args);
  }
  
  @Override
  default IPrint intersperse__(IPrint[] args) {
    return FCTPrinter.variadic("intersperse",args);
  }
}