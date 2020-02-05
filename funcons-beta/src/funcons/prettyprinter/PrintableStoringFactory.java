// GeNeRaTeD fOr: ./Computations/Normal/Storing/Storing.cbs
package funcons.prettyprinter;

import funcons.algebras.StoringAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableStoringFactory extends StoringAlg<IPrint> {
  @Override
  default IPrint locations_() {
    return FCTPrinter.nullary("locations");
  }
  
  @Override
  default IPrint locs_() {
    return FCTPrinter.nullary("locs");
  }
  
  @Override
  default IPrint stores_() {
    return FCTPrinter.nullary("stores");
  }
  
  @Override
  default IPrint store_clear_() {
    return FCTPrinter.nullary("store-clear");
  }
  
  @Override
  default IPrint initialise_storing__(IPrint[] args) {
    return FCTPrinter.variadic("initialise-storing",args);
  }
  
  @Override
  default IPrint init_storing__(IPrint[] args) {
    return FCTPrinter.variadic("init-storing",args);
  }
  
  @Override
  default IPrint variable__(IPrint[] args) {
    return FCTPrinter.variadic("variable",args);
  }
  
  @Override
  default IPrint var__(IPrint[] args) {
    return FCTPrinter.variadic("var",args);
  }
  
  @Override
  default IPrint allocate_variable__(IPrint[] args) {
    return FCTPrinter.variadic("allocate-variable",args);
  }
  
  @Override
  default IPrint alloc__(IPrint[] args) {
    return FCTPrinter.variadic("alloc",args);
  }
  
  @Override
  default IPrint recycle_variables__(IPrint[] args) {
    return FCTPrinter.variadic("recycle-variables",args);
  }
  
  @Override
  default IPrint recycle__(IPrint[] args) {
    return FCTPrinter.variadic("recycle",args);
  }
  
  @Override
  default IPrint initialise_variable__(IPrint[] args) {
    return FCTPrinter.variadic("initialise-variable",args);
  }
  
  @Override
  default IPrint init__(IPrint[] args) {
    return FCTPrinter.variadic("init",args);
  }
  
  @Override
  default IPrint allocate_initialised_variable_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("allocate-initialised-variable",arg1, arg2);
  }
  
  @Override
  default IPrint alloc_init_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("alloc-init",arg1, arg2);
  }
  
  @Override
  default IPrint assign__(IPrint[] args) {
    return FCTPrinter.variadic("assign",args);
  }
  
  @Override
  default IPrint assigned__(IPrint[] args) {
    return FCTPrinter.variadic("assigned",args);
  }
  
  @Override
  default IPrint current_value__(IPrint[] args) {
    return FCTPrinter.variadic("current-value",args);
  }
  
  @Override
  default IPrint un_assign__(IPrint[] args) {
    return FCTPrinter.variadic("un-assign",args);
  }
  
  @Override
  default IPrint structural_assign__(IPrint[] args) {
    return FCTPrinter.variadic("structural-assign",args);
  }
  
  @Override
  default IPrint structural_assigned__(IPrint[] args) {
    return FCTPrinter.variadic("structural-assigned",args);
  }
  
  @Override
  default IPrint variables_() {
    return FCTPrinter.nullary("variables");
  }
  
  @Override
  default IPrint vars_() {
    return FCTPrinter.nullary("vars");
  }
}