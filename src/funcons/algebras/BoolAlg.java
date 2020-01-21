package funcons.algebras;

public interface BoolAlg<E> extends FloatCalcAlg<E> {
    E bool(java.lang.Boolean b);
    E not(E b);

    E greater(E a, E b);
    E smaller(E a, E b);
    E greaterEqual(E a, E b);
    E smallerEqual(E a, E b);
    E equal(E x1, E x2);
    E physicalEqual(E e1, E e2);
}
