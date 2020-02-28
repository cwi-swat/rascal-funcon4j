// GeNeRaTeD fOr: ./Values/Composite/Classes/Classes.cbs
package funcons.algebras;

public interface ClassesAlg<E> {
  E class__(E[] args);
  E class_instantiator__(E[] args);
  E class_feature_map__(E[] args);
  E class_superclass_name_sequence__(E[] args);
  E class_name_tree__(E[] args);
  E is_subclass_name__(E[] args);
  E class_name_single_inheritance_feature_map__(E[] args);
  E merge_classes__(E[] args);
  E classes_();
}