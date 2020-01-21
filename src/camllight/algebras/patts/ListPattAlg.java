package camllight.algebras.patts;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ListPattAlg<E> {
    funcons.algebras.ListAlg<E> alg();

    @Syntax("patt = emptylist") @Level(20)
    default E emptyListPatt(E l) {
        return alg().only(l);
    }

    @Syntax("patt = '[' headtaillistpatt ']'") @Level(0)
    default E headTailListPatt(E p) {
        return p;
    }

    @Syntax("headtaillistpatt = patt") @Level(0)
    default E headTailListPattSingle(E p) {
        return p;
    }

    @Syntax("headtaillistpatt = patt '::' headtaillistpatt") @Level(1)
    default E headTailListPattMulti(E p1, E p2) {
        return alg().listPrefixPatt(p1, p2);
    }

    @Syntax("patt = '[' pattlist ']'")@Level(10)
    default E pattList(E p) {
        return p;
    }

    @Syntax("pattlist = patt")
    default E pattListSingle(E p) {
        return headTailListPattMulti(p, alg().only(alg().list()));
    }

    @Syntax("pattlist = patt ',' pattlist")
    default E pattListMulti(E p1, E p2) {
        return headTailListPattMulti(p1, p2);
    }
}
