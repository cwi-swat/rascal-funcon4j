// GeNeRaTeD fOr: ./Values/Composite/Trees/Trees.cbs
package funcons.prettyprinter;

import funcons.algebras.TreesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableTreesFactory extends TreesAlg<IPrint> {
  @Override
  default IPrint tree__(IPrint[] args) {
    return FCTPrinter.variadic("tree",args);
  }
  
  @Override
  default IPrint tree_root_value__(IPrint[] args) {
    return FCTPrinter.variadic("tree-root-value",args);
  }
  
  @Override
  default IPrint tree_branch_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("tree-branch-sequence",args);
  }
  
  @Override
  default IPrint single_branching_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("single-branching-sequence",args);
  }
  
  @Override
  default IPrint forest_root_value_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("forest-root-value-sequence",args);
  }
  
  @Override
  default IPrint forest_branch_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("forest-branch-sequence",args);
  }
  
  @Override
  default IPrint forest_value_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("forest-value-sequence",args);
  }
  
  @Override
  default IPrint trees__(IPrint[] args) {
    return FCTPrinter.variadic("trees",args);
  }
}