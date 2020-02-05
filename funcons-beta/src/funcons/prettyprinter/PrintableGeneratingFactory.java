// GeNeRaTeD fOr: ./Computations/Normal/Generating/Generating.cbs
package funcons.prettyprinter;

import funcons.algebras.GeneratingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableGeneratingFactory extends GeneratingAlg<IPrint> {
  @Override
  default IPrint initialise_generating__(IPrint[] args) {
    return FCTPrinter.variadic("initialise-generating",args);
  }
  
  @Override
  default IPrint fresh_atom_() {
    return FCTPrinter.nullary("fresh-atom");
  }
  
  @Override
  default IPrint use_atom_not_in__(IPrint[] args) {
    return FCTPrinter.variadic("use-atom-not-in",args);
  }
  
  @Override
  default IPrint atoms_() {
    return FCTPrinter.nullary("atoms");
  }
}