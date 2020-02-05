// GeNeRaTeD fOr: ./Values/Composite/Classes/Classes.cbs
module lang::funcon::Classes

data FunCon
  = class__(list[FunCon] args)
  | class_instantiator__(list[FunCon] args)
  | class_feature_map__(list[FunCon] args)
  | class_superclass_name_sequence__(list[FunCon] args)
  | class_name_tree__(list[FunCon] args)
  | is_subclass_name__(list[FunCon] args)
  | class_name_single_inheritance_feature_map__(list[FunCon] args)
  | classes_()
  ;
FunCon class_(FunCon args...) = class__(args);
FunCon class_instantiator_(FunCon args...) = class_instantiator__(args);
FunCon class_feature_map_(FunCon args...) = class_feature_map__(args);
FunCon class_superclass_name_sequence_(FunCon args...) = class_superclass_name_sequence__(args);
FunCon class_name_tree_(FunCon args...) = class_name_tree__(args);
FunCon is_subclass_name_(FunCon args...) = is_subclass_name__(args);
FunCon class_name_single_inheritance_feature_map_(FunCon args...) = class_name_single_inheritance_feature_map__(args);