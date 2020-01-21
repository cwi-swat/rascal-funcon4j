package funcons.algebras;

public interface ListAlg<E> extends TupleAlg<E> {
    E list();
    E list(E x);
    E list(E x1, E x2);
    E listPrefix(E x, E l);
    E applyToEach(E a, E l);
    E listPrefixMatch(E l, E p1, E p2);
    E listPrefixPatt(E p1, E p2);
    E intClosedInterval(E m, E n);
    E listReverse(E l);
    E listAppend(E list1, E list2);
}
