// GeNeRaTeD fOr: ./Computations/Abnormal/Throwing/Throwing.cbs
package funcons.algebras;

public interface ThrowingAlg<E> {
  E thrown__(E[] args);
  E finalise_throwing__(E[] args);
  E throw__(E[] args);
  E handle_thrown__(E[] args);
  E handle_recursively__(E[] args);
  E catch_else_throw_(E arg1,E arg2);
  E throwing_();
}