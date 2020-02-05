// GeNeRaTeD fOr: ./Values/Composite/Lists/Lists.cbs
package funcons.algebras;

public interface ListsAlg<E> {
  E list__(E[] args);
  E list_elements__(E[] args);
  E list_nil_();
  E nil_();
  E list_cons__(E[] args);
  E cons__(E[] args);
  E list_head__(E[] args);
  E head__(E[] args);
  E list_tail__(E[] args);
  E tail__(E[] args);
  E list_length__(E[] args);
  E list_append__(E[] args);
  E lists__(E[] args);
}