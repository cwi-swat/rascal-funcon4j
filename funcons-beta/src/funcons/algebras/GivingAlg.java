// GeNeRaTeD fOr: ./Computations/Normal/Giving/Giving.cbs
package funcons.algebras;

public interface GivingAlg<E> {
  E initialise_giving__(E[] args);
  E give_(E arg1,E arg2);
  E given_();
  E no_given__(E[] args);
  E left_to_right_map__(E[] args);
  E interleave_map__(E[] args);
  E left_to_right_repeat_(E arg1,E arg2,E arg3);
  E interleave_repeat_(E arg1,E arg2,E arg3);
  E left_to_right_filter__(E[] args);
  E interleave_filter__(E[] args);
  E fold_left__(E[] args);
  E fold_right__(E[] args);
}