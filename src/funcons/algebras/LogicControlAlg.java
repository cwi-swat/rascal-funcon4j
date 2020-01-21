package funcons.algebras;

public interface LogicControlAlg<E> extends PrintAlg<E> {
    E effect(E e);
    E seq(E c, E x);
    E ifTrue(E e, E c1, E c2);
    E whileTrue(E e, E c);
}
