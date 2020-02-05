// GeNeRaTeD fOr: ./Values/Composite/Trees/Trees.cbs
module lang::funcon::Trees

data FunCon
  = tree__(list[FunCon] args)
  | tree_root_value__(list[FunCon] args)
  | tree_branch_sequence__(list[FunCon] args)
  | single_branching_sequence__(list[FunCon] args)
  | forest_root_value_sequence__(list[FunCon] args)
  | forest_branch_sequence__(list[FunCon] args)
  | forest_value_sequence__(list[FunCon] args)
  | trees__(list[FunCon] args)
  ;
FunCon tree_(FunCon args...) = tree__(args);
FunCon tree_root_value_(FunCon args...) = tree_root_value__(args);
FunCon tree_branch_sequence_(FunCon args...) = tree_branch_sequence__(args);
FunCon single_branching_sequence_(FunCon args...) = single_branching_sequence__(args);
FunCon forest_root_value_sequence_(FunCon args...) = forest_root_value_sequence__(args);
FunCon forest_branch_sequence_(FunCon args...) = forest_branch_sequence__(args);
FunCon forest_value_sequence_(FunCon args...) = forest_value_sequence__(args);
FunCon trees_(FunCon args...) = trees__(args);