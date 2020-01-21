package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ExceptionAlg<E> {
    funcons.algebras.ExceptionAlg<E> alg();

    @Syntax("exp = 'try' exp 'with' pattmatch") @Level(100)
    default E tryWithExp(E exp, E pattmatch) {
        return alg().catchElseRethrow(exp, pattmatch);
    }

    @Syntax("exp = 'raise' CONSTRTOKEN") @Level(101)
    default E raiseExp(java.lang.String constrToken) {
        return alg().throw_(alg().boundValue(alg().id(constrToken)));
    }

    @Syntax("exp = 'raise' CONSTRTOKEN exp") @Level(102)
    default E raiseWithArgumentExp(java.lang.String constrToken, E exp) {
        return alg().throw_(alg().apply(alg().boundValue(alg().id(constrToken)), exp));
    }
}
