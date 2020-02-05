// GeNeRaTeD fOr: ./Computations/Normal/Binding/Binding.cbs
package funcons.prettyprinter;

import funcons.algebras.BindingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableBindingFactory extends BindingAlg<IPrint> {
  @Override
  default IPrint environments_() {
    return FCTPrinter.nullary("environments");
  }
  
  @Override
  default IPrint envs_() {
    return FCTPrinter.nullary("envs");
  }
  
  @Override
  default IPrint identifier_tagged__(IPrint[] args) {
    return FCTPrinter.variadic("identifier-tagged",args);
  }
  
  @Override
  default IPrint id_tagged__(IPrint[] args) {
    return FCTPrinter.variadic("id-tagged",args);
  }
  
  @Override
  default IPrint fresh_identifier_() {
    return FCTPrinter.nullary("fresh-identifier");
  }
  
  @Override
  default IPrint initialise_binding__(IPrint[] args) {
    return FCTPrinter.variadic("initialise-binding",args);
  }
  
  @Override
  default IPrint bind_value__(IPrint[] args) {
    return FCTPrinter.variadic("bind-value",args);
  }
  
  @Override
  default IPrint bind__(IPrint[] args) {
    return FCTPrinter.variadic("bind",args);
  }
  
  @Override
  default IPrint unbind__(IPrint[] args) {
    return FCTPrinter.variadic("unbind",args);
  }
  
  @Override
  default IPrint bound_directly__(IPrint[] args) {
    return FCTPrinter.variadic("bound-directly",args);
  }
  
  @Override
  default IPrint bound_value__(IPrint[] args) {
    return FCTPrinter.variadic("bound-value",args);
  }
  
  @Override
  default IPrint bound__(IPrint[] args) {
    return FCTPrinter.variadic("bound",args);
  }
  
  @Override
  default IPrint closed__(IPrint[] args) {
    return FCTPrinter.variadic("closed",args);
  }
  
  @Override
  default IPrint scope_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("scope",arg1, arg2);
  }
  
  @Override
  default IPrint accumulate__(IPrint[] args) {
    return FCTPrinter.variadic("accumulate",args);
  }
  
  @Override
  default IPrint collateral__(IPrint[] args) {
    return FCTPrinter.variadic("collateral",args);
  }
  
  @Override
  default IPrint bind_recursively_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("bind-recursively",arg1, arg2);
  }
  
  @Override
  default IPrint recursive_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("recursive",arg1, arg2);
  }
  
  @Override
  default IPrint re_close_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("re-close",arg1, arg2);
  }
  
  @Override
  default IPrint bind_to_forward_links__(IPrint[] args) {
    return FCTPrinter.variadic("bind-to-forward-links",args);
  }
  
  @Override
  default IPrint set_forward_links__(IPrint[] args) {
    return FCTPrinter.variadic("set-forward-links",args);
  }
  
  @Override
  default IPrint identifiers_() {
    return FCTPrinter.nullary("identifiers");
  }
  
  @Override
  default IPrint ids_() {
    return FCTPrinter.nullary("ids");
  }
}