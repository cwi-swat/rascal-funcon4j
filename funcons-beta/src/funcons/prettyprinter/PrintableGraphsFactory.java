// GeNeRaTeD fOr: ./Values/Composite/Graphs/Graphs.cbs
package funcons.prettyprinter;

import funcons.algebras.GraphsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableGraphsFactory extends GraphsAlg<IPrint> {
  @Override
  default IPrint directed_graphs__(IPrint[] args) {
    return FCTPrinter.variadic("directed-graphs",args);
  }
  
  @Override
  default IPrint is_cyclic__(IPrint[] args) {
    return FCTPrinter.variadic("is-cyclic",args);
  }
  
  @Override
  default IPrint topological_sort__(IPrint[] args) {
    return FCTPrinter.variadic("topological-sort",args);
  }
}