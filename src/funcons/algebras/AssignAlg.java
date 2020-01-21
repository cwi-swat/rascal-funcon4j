package funcons.algebras;

public interface AssignAlg<E> extends ElseAlg<E> {
    E assign(E var, E x);
    E assignedValue(E var);
    E assignedValueIfVar(E v);
    E alloc(E x);
}
