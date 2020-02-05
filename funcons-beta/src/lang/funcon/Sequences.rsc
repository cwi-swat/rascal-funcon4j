// GeNeRaTeD fOr: ./Values/Composite/Sequences/Sequences.cbs
module lang::funcon::Sequences

data FunCon
  = length__(list[FunCon] args)
  | is_in__(list[FunCon] args)
  | index__(list[FunCon] args)
  | first__(list[FunCon] args)
  | second__(list[FunCon] args)
  | third__(list[FunCon] args)
  | first_n__(list[FunCon] args)
  | drop_first_n__(list[FunCon] args)
  | reverse__(list[FunCon] args)
  | n_of__(list[FunCon] args)
  | intersperse__(list[FunCon] args)
  ;
FunCon length_(FunCon args...) = length__(args);
FunCon is_in_(FunCon args...) = is_in__(args);
FunCon index_(FunCon args...) = index__(args);
FunCon first_(FunCon args...) = first__(args);
FunCon second_(FunCon args...) = second__(args);
FunCon third_(FunCon args...) = third__(args);
FunCon first_n_(FunCon args...) = first_n__(args);
FunCon drop_first_n_(FunCon args...) = drop_first_n__(args);
FunCon reverse_(FunCon args...) = reverse__(args);
FunCon n_of_(FunCon args...) = n_of__(args);
FunCon intersperse_(FunCon args...) = intersperse__(args);