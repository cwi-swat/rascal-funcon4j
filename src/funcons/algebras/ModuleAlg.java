package funcons.algebras;

public interface ModuleAlg<E> extends PolyTypeAlg<E> {
    E accum(E env, E decl);
}
