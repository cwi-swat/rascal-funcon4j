package funcons.algebras;

public interface ApplyAlg<E> extends MapAlg<E> {
    E abs(E exp);
    E abs(E patt, E exp); // TODO is this correct?
    E apply(E abs, E arg);
    E compose(E f, E g);
    E closure(E x, E environment);
    E close(E abs);
    E bind(E id);
}