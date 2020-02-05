// GeNeRaTeD fOr: ./Values/Composite/Objects/Objects.cbs
package funcons.prettyprinter;

import funcons.algebras.ObjectsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableObjectsFactory extends ObjectsAlg<IPrint> {
  @Override
  default IPrint object__(IPrint[] args) {
    return FCTPrinter.variadic("object",args);
  }
  
  @Override
  default IPrint object_identity__(IPrint[] args) {
    return FCTPrinter.variadic("object-identity",args);
  }
  
  @Override
  default IPrint object_class_name__(IPrint[] args) {
    return FCTPrinter.variadic("object-class-name",args);
  }
  
  @Override
  default IPrint object_feature_map__(IPrint[] args) {
    return FCTPrinter.variadic("object-feature-map",args);
  }
  
  @Override
  default IPrint object_subobject_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("object-subobject-sequence",args);
  }
  
  @Override
  default IPrint object_tree__(IPrint[] args) {
    return FCTPrinter.variadic("object-tree",args);
  }
  
  @Override
  default IPrint object_single_inheritance_feature_map__(IPrint[] args) {
    return FCTPrinter.variadic("object-single-inheritance-feature-map",args);
  }
  
  @Override
  default IPrint objects_() {
    return FCTPrinter.nullary("objects");
  }
}