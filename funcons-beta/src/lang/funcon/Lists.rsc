// GeNeRaTeD fOr: ./Values/Composite/Lists/Lists.cbs
module lang::funcon::Lists

data FunCon
  = list__(list[FunCon] args)
  | list_elements__(list[FunCon] args)
  | list_nil_()
  | nil_()
  | list_cons__(list[FunCon] args)
  | cons__(list[FunCon] args)
  | list_head__(list[FunCon] args)
  | head__(list[FunCon] args)
  | list_tail__(list[FunCon] args)
  | tail__(list[FunCon] args)
  | list_length__(list[FunCon] args)
  | list_append__(list[FunCon] args)
  | lists__(list[FunCon] args)
  ;
FunCon list_(FunCon args...) = list__(args);
FunCon list_elements_(FunCon args...) = list_elements__(args);
FunCon list_cons_(FunCon args...) = list_cons__(args);
FunCon cons_(FunCon args...) = cons__(args);
FunCon list_head_(FunCon args...) = list_head__(args);
FunCon head_(FunCon args...) = head__(args);
FunCon list_tail_(FunCon args...) = list_tail__(args);
FunCon tail_(FunCon args...) = tail__(args);
FunCon list_length_(FunCon args...) = list_length__(args);
FunCon list_append_(FunCon args...) = list_append__(args);
FunCon lists_(FunCon args...) = lists__(args);