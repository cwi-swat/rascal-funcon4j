// GeNeRaTeD fOr: ./Values/Composite/Sequences/Sequences.cbs
package funcons.algebras;

public interface SequencesAlg<E> {
  E length__(E[] args);
  E is_in__(E[] args);
  E index__(E[] args);
  E first__(E[] args);
  E second__(E[] args);
  E third__(E[] args);
  E first_n__(E[] args);
  E drop_first_n__(E[] args);
  E reverse__(E[] args);
  E n_of__(E[] args);
  E intersperse__(E[] args);
}