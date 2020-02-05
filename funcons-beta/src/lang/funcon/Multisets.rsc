// GeNeRaTeD fOr: ./Values/Composite/Multisets/Multisets.cbs
module lang::funcon::Multisets

data FunCon
  = multiset__(list[FunCon] args)
  | multiset_elements__(list[FunCon] args)
  | multiset_occurrences__(list[FunCon] args)
  | multiset_insert__(list[FunCon] args)
  | multiset_delete__(list[FunCon] args)
  | is_submultiset__(list[FunCon] args)
  | multisets__(list[FunCon] args)
  ;
FunCon multiset_(FunCon args...) = multiset__(args);
FunCon multiset_elements_(FunCon args...) = multiset_elements__(args);
FunCon multiset_occurrences_(FunCon args...) = multiset_occurrences__(args);
FunCon multiset_insert_(FunCon args...) = multiset_insert__(args);
FunCon multiset_delete_(FunCon args...) = multiset_delete__(args);
FunCon is_submultiset_(FunCon args...) = is_submultiset__(args);
FunCon multisets_(FunCon args...) = multisets__(args);