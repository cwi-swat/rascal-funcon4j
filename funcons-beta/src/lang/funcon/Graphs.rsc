// GeNeRaTeD fOr: ./Values/Composite/Graphs/Graphs.cbs
module lang::funcon::Graphs

data FunCon
  = directed_graphs__(list[FunCon] args)
  | is_cyclic__(list[FunCon] args)
  | topological_sort__(list[FunCon] args)
  ;
FunCon directed_graphs_(FunCon args...) = directed_graphs__(args);
FunCon is_cyclic_(FunCon args...) = is_cyclic__(args);
FunCon topological_sort_(FunCon args...) = topological_sort__(args);