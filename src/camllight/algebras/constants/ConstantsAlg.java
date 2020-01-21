package camllight.algebras.constants;

import noa.syntax.Syntax;

public interface ConstantsAlg<E> {
    funcons.algebras.PolyTypeAlg<E> alg();

    @Syntax("constant = INTTOKEN")
    default E int_(java.lang.Integer l) {
        return alg().lit(l);
    }

    @Syntax("constant = FLOATTOKEN")
    default E float_(java.lang.Float f) {
        return alg().lit(f.doubleValue());
    }

    @Syntax("constant = BOOLTOKEN")
    default E bool(java.lang.Boolean b) {
        return alg().bool(b);
    }

    @Syntax("constant = STRINGTOKEN")
    default E string(java.lang.String s) {
        return alg().camlLightString(s);
    }

    @Syntax("constant = CONSTRTOKEN")
    default E constr(java.lang.String s) {
        return alg().instantiateIfPoly(alg().boundValue(alg().id(s)));
    }

    @Syntax("constant = CHARTOKEN")
    default E char_(java.lang.String s) {
        return alg().camlLightChar(s);
    }

    @Syntax("constant = NULLTOKEN")
    default E null_(Object o) {
        return alg().null_();
    }

    @Syntax("constant = emptylist")
    default E emptyListConstant(E l) {
        return l;
    }

    @Syntax("emptylist = EMPTYLISTTOKEN")
    default E emptyList(Object o) {
        return alg().list();
    }
}
