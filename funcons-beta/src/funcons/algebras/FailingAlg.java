// GeNeRaTeD fOr: ./Computations/Abnormal/Failing/Failing.cbs
package funcons.algebras;

public interface FailingAlg<E> {
  E failed_();
  E finalise_failing__(E[] args);
  E fail_();
  E else__(E[] args);
  E else_choice__(E[] args);
  E check_true__(E[] args);
  E check__(E[] args);
  E checked__(E[] args);
  E failing_();
}