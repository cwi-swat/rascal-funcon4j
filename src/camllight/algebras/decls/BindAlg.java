package camllight.algebras.decls;

import camllight.algebras.patts.PattAlg;
import camllight.algebras.patts.PattMatchAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;

public interface BindAlg<E> extends PattAlg<E>, PattMatchAlg<E> {
    funcons.algebras.RecursiveAlg<E> alg();

    @Syntax("decl = 'let' 'rec' recdecl")
    default E declRec(E declTuple) {
        return alg().generaliseDecl(alg().recursiveTyped(
                alg().project(alg().lit(0), declTuple),
                alg().project(alg().lit(1), declTuple)));
    }

    @Syntax("recdecl = recdeclmono")
    default E recDeclMono(E declTuple) {
        return declTuple;
    }

    @Syntax("recdecl = recdeclmono recanddecl+")
    default E recAndDecl(E declTuple, List<E> declTuples) {
        for (E otherDeclTuple : declTuples) {
            declTuple = alg().tuple(
                    alg().mapUnion(alg().project(alg().lit(0), declTuple), alg().project(alg().lit(0), otherDeclTuple)),
                    alg().mapUnion(alg().project(alg().lit(1), declTuple), alg().project(alg().lit(1), otherDeclTuple)));
        }
        return declTuple;
    }

    @Syntax("recanddecl = 'and' recdeclmono")
    default E recAndDeclSingle(E declTuple) {
        return declTuple;
    }

    @Syntax("recdeclmono = ident patt+ '=' exp")
    default E recDeclIdentPattsExp(E ident, List<E> patts, E exp) {
        return alg().tuple(
                alg().bindValue(ident, alg().unknownType()),
                declBindMonoFunc(ident, patts, exp));
    }

    @Syntax("recdeclmono = ident '=' exp")
    default E recDeclIdentExp(E ident, E exp) {
        return alg().tuple(alg().bindValue(ident, alg().unknownType()), declBindMono(pattId(ident), exp));
    }

    @Syntax("recdeclmono = '(' ident ':' type ')' '=' exp")
    default E recDeclPattTypeExp(E ident, E type, E exp) {
        return alg().tuple(alg().bindValue(ident, type), declBindMono(pattId(ident), exp));
    }

    @Syntax("decl = 'let' decl") @Level(1)
    default E decl(E decl) {
        return decl;
    }

    @Syntax("decl = declmono anddecl+") @Level(0)
    default E andDecl(E decl, List<E> decls) {
        for (E otherDecl : decls) {
            decl = alg().mapUnion(decl, otherDecl);
        }
        return decl;
    }

    @Syntax("anddecl = 'and' declmono")
    default E andDeclSingle(E decl) {
        return decl;
    }

    @Syntax("decl = declmono")
    default E declBind(E d) {
        return d;
    }

    @Syntax("declmono = patt '=' exp")
    default E declBindMono(E patt, E exp) {
        return alg().match(exp, alg().preferOver(patt, alg().abs(alg().throw_(alg().matchFailure()))));
    }

    @Syntax("declmono = ident patt+ '=' exp")
    default E declBindMonoFunc(E id, java.util.List<E> patts, E exp) {
        if (patts.size() == 1) {
            return alg().bindValue(id, pattMatchSingle(patts.get(0), exp));
        }
        return alg().bindValue(id, pattMatchCurriedMulti(patts, exp));
    }

    @Syntax("varianttype = CONSTRTOKEN") @Level(0)
    default E variantDecl(java.lang.String token) {
        return alg().clVariant(token, alg().tupleType());
    }

    @Syntax("varianttype = CONSTRTOKEN 'of' type") @Level(1)
    default E variantTypeDecl(java.lang.String token, E type) {
        return alg().clVariant(token, type);
    }
}
