// GeNeRaTeD fOr: ./Values/Composite/Objects/Objects.cbs
module lang::funcon::Objects

data FunCon
  = object__(list[FunCon] args)
  | object_identity__(list[FunCon] args)
  | object_class_name__(list[FunCon] args)
  | object_feature_map__(list[FunCon] args)
  | object_subobject_sequence__(list[FunCon] args)
  | object_tree__(list[FunCon] args)
  | object_single_inheritance_feature_map__(list[FunCon] args)
  | objects_()
  ;
FunCon object_(FunCon args...) = object__(args);
FunCon object_identity_(FunCon args...) = object_identity__(args);
FunCon object_class_name_(FunCon args...) = object_class_name__(args);
FunCon object_feature_map_(FunCon args...) = object_feature_map__(args);
FunCon object_subobject_sequence_(FunCon args...) = object_subobject_sequence__(args);
FunCon object_tree_(FunCon args...) = object_tree__(args);
FunCon object_single_inheritance_feature_map_(FunCon args...) = object_single_inheritance_feature_map__(args);