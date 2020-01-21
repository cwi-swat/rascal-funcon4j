package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ArrayAlg<E> {
    funcons.algebras.VectorAlg<E> alg();

    @Syntax("exp = EMPTYARRAYTOKEN")
    default E emptyArray(java.lang.String src) {
        return alg().vector();
    }

    @Syntax("exp = '[|' exp ','? '|]'") @Level(1800)
    default E arraySingle(E exp) {
        return alg().vector(exp);
    }

    @Syntax("exp = '[|' exparray ','? '|]'") @Level(1801)
    default E arrayMulti(E expVector) {
        return expVector;
    }

    @Syntax("exparray = exp ',' exp") @Level(0)
    default E innerExpArrayDouble(E e1, E e2) {
        return alg().vectorAppend(alg().vector(e1), alg().vector(e2));
    }

    @Syntax("exparray = exp ',' exparray") @Level(1)
    default E innerExpArrayMulti(E e1, E e2) {
        return alg().vectorAppend(alg().vector(e1), e2);
    }

    @Syntax("exp = exp '.(' exp ')'") @Level(1200)
    default E arraySelect(E array, E index) {
        return alg().vectorSelect(array, index);
    }

    @Syntax("exp = exp '.(' exp ')' '<-' exp") @Level(1100)
    default E arrayAssign(E array, E index, E val) {
        return alg().vectorAssign(array, index, val);
    }
}
