package funcons.algebras;

public interface TupleAlg<E> extends AssignAlg<E> {
    E tuple();
    E tuple(E x);
    E tuple(E x1, E x2);
    E tuple(E x1, E x2, E x3);
    E tuplePrefix(E x, E tup);
    E tupleHead(E tup); // TODO write test
    E tupleTail(E tup); // TODO write test
    E project(E index, E tup);

    E partialApp(E f, E x);
    E partialAppN(E f, E x);
    E curry(E f);
    E curryN(E n, E f);
    E uncurry(E abs);
    E tuplePrefixMatch(E tup, E p1, E p2);
    E tuplePrefixPatt(E p1, E p2);
}
