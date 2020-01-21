package funcons.algebras;

public interface ElseAlg<E> extends ExceptionAlg<E> {
    E only(E v);
    E any();
    E whenTrue(E exp, E x);
    E match(E exp, E pat);
    E pattAbs(E pat, E x);
    E pattUnion(E pat1, E pat2);
    E pattNonBinding(E pat);
}
