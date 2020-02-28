// GeNeRaTeD fOr: ./Values/Composite/Classes/Classes.cbs
package funcons.prettyprinter;

import funcons.algebras.ClassesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableClassesFactory extends ClassesAlg<IPrint> {
  @Override
  default IPrint class__(IPrint[] args) {
    return FCTPrinter.variadic("class",args);
  }
  
  @Override
  default IPrint class_instantiator__(IPrint[] args) {
    return FCTPrinter.variadic("class-instantiator",args);
  }
  
  @Override
  default IPrint class_feature_map__(IPrint[] args) {
    return FCTPrinter.variadic("class-feature-map",args);
  }
  
  @Override
  default IPrint class_superclass_name_sequence__(IPrint[] args) {
    return FCTPrinter.variadic("class-superclass-name-sequence",args);
  }
  
  @Override
  default IPrint class_name_tree__(IPrint[] args) {
    return FCTPrinter.variadic("class-name-tree",args);
  }
  
  @Override
  default IPrint is_subclass_name__(IPrint[] args) {
    return FCTPrinter.variadic("is-subclass-name",args);
  }
  
  @Override
  default IPrint class_name_single_inheritance_feature_map__(IPrint[] args) {
    return FCTPrinter.variadic("class-name-single-inheritance-feature-map",args);
  }
  
  @Override
  default IPrint merge_classes__(IPrint[] args) {
    return FCTPrinter.variadic("merge-classes",args);
  }
  
  @Override
  default IPrint classes_() {
    return FCTPrinter.nullary("classes");
  }
}