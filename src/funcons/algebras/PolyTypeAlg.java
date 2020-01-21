package funcons.algebras;

public interface PolyTypeAlg<E> extends TypeAlg<E> {
    E instantiatePoly(E x);
    E instantiateIfPoly(E x);
    E generalise(E x);
    E generaliseIfPoly(E x);
    E generaliseDecl(E decl);
    E generaliseMap(E x);
}
