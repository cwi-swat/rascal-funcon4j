package camllight.algebras.patts;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface PattMatchAlg<E> extends TuplePattAlg<E> {
    @Syntax("pattmatch = pattmatchsingle") @Level(0)
    default E pattMatch(E pm) {
        return pm;
    }

    @Syntax("pattmatchsingle = patt '->' exp")
    default E pattMatchSingle(E p, E e) {
        return alg().abs(p, e);
    }

    @Syntax("pattmatch = pattmatchsingle '|' pattmatch") @Level(1)
    default E pattMatchMulti(E head, E tail) {
        return alg().preferOver(head, tail);
    }

    @Syntax("pattmatch = '|' pattmatch")
    default E pattMatchStripe(E pm) {
        return pm;
    }

    @Syntax("pattmatchcurried = patt+ '->' exp")
    default E pattMatchCurriedMulti(java.util.List<E> ps, E exp) {
        E pattern = pattTuple(ps.get(0), ps.subList(1, ps.size()));
        return alg().curryN(alg().lit(ps.size()), pattMatchSingle(pattern, exp));
    }
}