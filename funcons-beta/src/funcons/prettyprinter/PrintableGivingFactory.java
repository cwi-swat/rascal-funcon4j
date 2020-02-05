// GeNeRaTeD fOr: ./Computations/Normal/Giving/Giving.cbs
package funcons.prettyprinter;

import funcons.algebras.GivingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableGivingFactory extends GivingAlg<IPrint> {
  @Override
  default IPrint initialise_giving__(IPrint[] args) {
    return FCTPrinter.variadic("initialise-giving",args);
  }
  
  @Override
  default IPrint give_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("give",arg1, arg2);
  }
  
  @Override
  default IPrint given_() {
    return FCTPrinter.nullary("given");
  }
  
  @Override
  default IPrint no_given__(IPrint[] args) {
    return FCTPrinter.variadic("no-given",args);
  }
  
  @Override
  default IPrint left_to_right_map__(IPrint[] args) {
    return FCTPrinter.variadic("left-to-right-map",args);
  }
  
  @Override
  default IPrint interleave_map__(IPrint[] args) {
    return FCTPrinter.variadic("interleave-map",args);
  }
  
  @Override
  default IPrint left_to_right_repeat_(IPrint arg1,IPrint arg2,IPrint arg3) {
    return FCTPrinter.fixed("left-to-right-repeat",arg1, arg2, arg3);
  }
  
  @Override
  default IPrint interleave_repeat_(IPrint arg1,IPrint arg2,IPrint arg3) {
    return FCTPrinter.fixed("interleave-repeat",arg1, arg2, arg3);
  }
  
  @Override
  default IPrint left_to_right_filter__(IPrint[] args) {
    return FCTPrinter.variadic("left-to-right-filter",args);
  }
  
  @Override
  default IPrint interleave_filter__(IPrint[] args) {
    return FCTPrinter.variadic("interleave-filter",args);
  }
  
  @Override
  default IPrint fold_left__(IPrint[] args) {
    return FCTPrinter.variadic("fold-left",args);
  }
  
  @Override
  default IPrint fold_right__(IPrint[] args) {
    return FCTPrinter.variadic("fold-right",args);
  }
}