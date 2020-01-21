package camllight.algebras.base;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ModuleAlg<E> {
    //funcons.algebras.RecordAlg<E> alg();
    funcons.algebras.ModuleAlg<E> alg();

    //|[ prog[: IMPL :] ]| ->
    //|[ scope(accum(cl_base,cl_library), decl_impl[: IMPL :]) ]|
    @Syntax("prog = declimpl")
    default E start(E e) {
        return e;
    }

    @Syntax("declimpl = declorexp ';;' declimpl") @Level(1)
    default E declImpl(E decl, E declImpl) {
        return alg().accum(decl, declImpl);
    }

    @Syntax("declimpl = declorexp ';;'") @Level(0)
    default E declImplSingle(E decl) {
        return decl;
    }

    @Syntax("declorexp = exp") @Level(1)
    default E declOrExpExp(E exp) {
        return alg().seq(alg().print(exp), alg().environment());
    }

    @Syntax("declorexp = decl") @Level(0)
    default E declOrExpDecl(E decl) {
        return decl;
    }

    /*
    to-funcons:
            |[ decl[: ~TDS :] ]| ->
            |[ accum(decl_newtypes[: ~TDS :],
                     accum(decl_type_abbrvs[: ~TDS :],
                     decl_labels_and_variants[: ~TDS :])) ]|
    to-funcons:
            |[ decl[: ~ED :] ]| ->
            |[ decl_exception[: ~ED :] ]|
    to-funcons:
            |[ decl[: ~D :] ]| ->
            |[ map_empty ]| // directives not yet specified
    */

    @Syntax("ident = IDTOKEN") @Level(0)
    default E id(java.lang.String name) {
        return alg().id(name);
    }

    // Not part of the language, just used for easy testing purposes
    @Syntax("exp = 'print' exp")
    default E print(E e) {
        return alg().print(e);
    }
}
