// GeNeRaTeD fOr: ./Values/Composite/Sets/Sets.cbs
module lang::funcon::Sets

data FunCon
  = set__(list[FunCon] args)
  | set_elements__(list[FunCon] args)
  | is_in_set__(list[FunCon] args)
  | is_subset__(list[FunCon] args)
  | set_insert__(list[FunCon] args)
  | set_unite__(list[FunCon] args)
  | set_intersect__(list[FunCon] args)
  | set_difference__(list[FunCon] args)
  | set_size__(list[FunCon] args)
  | some_element__(list[FunCon] args)
  | element_not_in__(list[FunCon] args)
  | sets__(list[FunCon] args)
  ;
FunCon set_(FunCon args...) = set__(args);
FunCon set_elements_(FunCon args...) = set_elements__(args);
FunCon is_in_set_(FunCon args...) = is_in_set__(args);
FunCon is_subset_(FunCon args...) = is_subset__(args);
FunCon set_insert_(FunCon args...) = set_insert__(args);
FunCon set_unite_(FunCon args...) = set_unite__(args);
FunCon set_intersect_(FunCon args...) = set_intersect__(args);
FunCon set_difference_(FunCon args...) = set_difference__(args);
FunCon set_size_(FunCon args...) = set_size__(args);
FunCon some_element_(FunCon args...) = some_element__(args);
FunCon element_not_in_(FunCon args...) = element_not_in__(args);
FunCon sets_(FunCon args...) = sets__(args);