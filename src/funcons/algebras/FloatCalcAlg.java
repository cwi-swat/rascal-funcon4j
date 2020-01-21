package funcons.algebras;

public interface FloatCalcAlg<E> extends IntCalcAlg<E> {
    E lit(java.lang.Double i);

    E floatAdd(E a, E b);
    E floatNegate(E x);
    E floatSubtract(E a, E b);
    E floatMultiply(E a, E b);
    E floatDivide(E a, E b);
    E floatModulo(E a, E b);
    E floatPowerOf(E a, E b);
}
