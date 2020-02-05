// GeNeRaTeD fOr: ./Values/Composite/Maps/Maps.cbs
package funcons.prettyprinter;

import funcons.algebras.MapsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableMapsFactory extends MapsAlg<IPrint> {
  @Override
  default IPrint map__(IPrint[] args) {
    return FCTPrinter.variadic("map",args);
  }
  
  @Override
  default IPrint map_elements__(IPrint[] args) {
    return FCTPrinter.variadic("map-elements",args);
  }
  
  @Override
  default IPrint map_lookup__(IPrint[] args) {
    return FCTPrinter.variadic("map-lookup",args);
  }
  
  @Override
  default IPrint lookup__(IPrint[] args) {
    return FCTPrinter.variadic("lookup",args);
  }
  
  @Override
  default IPrint map_domain__(IPrint[] args) {
    return FCTPrinter.variadic("map-domain",args);
  }
  
  @Override
  default IPrint dom__(IPrint[] args) {
    return FCTPrinter.variadic("dom",args);
  }
  
  @Override
  default IPrint map_override__(IPrint[] args) {
    return FCTPrinter.variadic("map-override",args);
  }
  
  @Override
  default IPrint map_unite__(IPrint[] args) {
    return FCTPrinter.variadic("map-unite",args);
  }
  
  @Override
  default IPrint map_delete__(IPrint[] args) {
    return FCTPrinter.variadic("map-delete",args);
  }
  
  @Override
  default IPrint maps__(IPrint[] args) {
    return FCTPrinter.variadic("maps",args);
  }
}