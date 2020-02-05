// GeNeRaTeD fOr: ./Computations/Abnormal/Controlling/Controlling.cbs
package funcons.algebras;

public interface ControllingAlg<E> {
  E continuation__(E[] args);
  E hole_();
  E resume_continuation__(E[] args);
  E control__(E[] args);
  E delimit_current_continuation__(E[] args);
  E delimit_cc__(E[] args);
  E continuations__(E[] args);
}