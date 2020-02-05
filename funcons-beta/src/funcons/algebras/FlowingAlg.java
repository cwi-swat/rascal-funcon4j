// GeNeRaTeD fOr: ./Computations/Normal/Flowing/Flowing.cbs
package funcons.algebras;

public interface FlowingAlg<E> {
  E left_to_right__(E[] args);
  E l_to_r__(E[] args);
  E right_to_left__(E[] args);
  E r_to_l__(E[] args);
  E sequential__(E[] args);
  E seq__(E[] args);
  E effect__(E[] args);
  E choice__(E[] args);
  E if_true_else_(E arg1,E arg2,E arg3);
  E if_else_(E arg1,E arg2,E arg3);
  E while_true__(E[] args);
  E while__(E[] args);
  E do_while_true__(E[] args);
  E do_while__(E[] args);
  E interleave__(E[] args);
  E signal_();
  E yield_();
  E yield_on_value__(E[] args);
  E yield_on_abrupt__(E[] args);
  E atomic__(E[] args);
  E yielding_();
}