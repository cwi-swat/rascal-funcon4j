// GeNeRaTeD fOr: ./Computations/Normal/Linking/Linking.cbs
package funcons.prettyprinter;

import funcons.algebras.LinkingAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableLinkingFactory extends LinkingAlg<IPrint> {
  @Override
  default IPrint link__(IPrint[] args) {
    return FCTPrinter.variadic("link",args);
  }
  
  @Override
  default IPrint initialise_linking__(IPrint[] args) {
    return FCTPrinter.variadic("initialise-linking",args);
  }
  
  @Override
  default IPrint fresh_link__(IPrint[] args) {
    return FCTPrinter.variadic("fresh-link",args);
  }
  
  @Override
  default IPrint fresh_initialised_link_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("fresh-initialised-link",arg1, arg2);
  }
  
  @Override
  default IPrint fresh_init_link_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("fresh-init-link",arg1, arg2);
  }
  
  @Override
  default IPrint set_link__(IPrint[] args) {
    return FCTPrinter.variadic("set-link",args);
  }
  
  @Override
  default IPrint follow_link__(IPrint[] args) {
    return FCTPrinter.variadic("follow-link",args);
  }
  
  @Override
  default IPrint follow_if_link__(IPrint[] args) {
    return FCTPrinter.variadic("follow-if-link",args);
  }
  
  @Override
  default IPrint links_() {
    return FCTPrinter.nullary("links");
  }
}