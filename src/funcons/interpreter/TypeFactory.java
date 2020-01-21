package funcons.interpreter;

import funcons.algebras.TypeAlg;
import funcons.carriers.IEval;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.cl.CLVariant;
import funcons.values.ids.Meta;
import funcons.values.ids.TypeVar;
import funcons.values.types.*;

public interface TypeFactory extends VectorFactory, TypeAlg<IEval> {
    @Override
    default IEval type(java.lang.String name) {
        return (env, forward, store, given) -> new Type(name);
    }

    @Override
    default IEval unknownType() {
        return (env, forward, store, given) -> new UnknownType();
    }

    @Override
    default IEval tag(java.lang.String name) {
        return (env, forward, store, given) -> new Tag(name);
    }

    @Override
    default IEval typeVar(java.lang.String name) {
        return (env, forward, store, given) -> new TypeVar(name);
    }

    @Override
    default IEval clVariant(java.lang.String tagName, IEval exp) {
        return (env, forward, store, given) -> new CLVariant(tagName, exp.eval(env, forward, store, given));
    }

    @Override
    default IEval meta(java.lang.String name) {
        return (env, forward, store, given) -> new Meta(name);
    }

    @Override
    default IEval nomVal(IEval nomTag, IEval val) {
        return (env, forward, store, given) ->
                new NominalVal((NominalTag)nomTag.eval(env, forward, store, given), val.eval(env, forward, store, given));
    }

    @Override
    default IEval nomTag(IEval token) {
        return (env, forward, store, given) -> new NominalTag((Token)token.eval(env, forward, store, given));
    }

    @Override
    default IEval nomValSelect(IEval nomTag, IEval nomVal) {
        return (env, forward, store, given) -> {
            NominalVal nVal = (NominalVal)nomVal.eval(env, forward, store, given);
            return whenTrue(equal(nomTag, (e,f,s,g) -> nVal.tag()), (e,f,s,g) -> nVal.val()).eval(env, forward, store, given);
        };
    }

    @Override
    default IEval scopeNominalCoercion(IEval type1, IEval type2, IEval abs) {
        return apply(abs, nomTag(freshToken()));
    }

    @Override
    default IEval depends(IEval type1, IEval type2) {
        return (env, forward, store, given) ->
                new Depends(type1.eval(env, forward, store, given), type2.eval(env, forward, store, given));
    }

    @Override
    default IEval typed(IEval exp, IEval type) {
        return exp;
    }

    @Override
    default IEval tupleType() {
        return (env, forward, store, given) -> new TupleType();
    }

    @Override
    default IEval tupleType(IEval x) {
        return (env, forward, store, given) ->
                new TupleType((Type)x.eval(env, forward, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2) {
        return (env, forward, store, given) -> new TupleType(
                (Type)x1.eval(env, forward, store, given),
                (Type)x2.eval(env, forward, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2, IEval x3) {
        return (env, forward, store, given) -> new TupleType(
                (Type)x1.eval(env, forward, store, given),
                (Type)x2.eval(env, forward, store, given),
                (Type)x3.eval(env, forward, store, given));
    }

    @Override
    default IEval tupleTypePrefix(IEval x, IEval tup) {
        return (env, forward, store, given) -> {
            TupleType tt = (TupleType)tup.eval(env, forward, store, given);
            Type t = (Type)x.eval(env, forward, store, given);
            return tt.prepend(t);
        };
    }

    @Override
    default IEval projectType(IEval index, IEval tup) {
        return (env, forward, store, given) -> {
            TupleType tt = (TupleType)tup.eval(env, forward, store, given);
            Int i = (Int)index.eval(env, forward, store, given);
            return tt.get(i);
        };
    }

    @Override
    default IEval boundType(IEval id) {
        return null_(); // TODO evaluated statically?
    }

    @Override
    default IEval freshToken() {
        return (env, forward, store, given) -> new Token();
    }

    @Override
    default IEval newType(IEval name) {
        return (env, forward, store, given) ->
                new NominalType(name.eval(env, forward, store, given), (Token)freshToken().eval(env, forward, store, given));
    }

    @Override
    default IEval typeDef(IEval id, IEval type) {
        return (env, forward, store, given) -> new Environment();
    }

    @Override
    default IEval restrictDomain(IEval abs, IEval type) {
        return abs;
    }

    @Override
    default IEval pattAtType(IEval patt, IEval type) {
        return restrictDomain(patt, type);
    }

    @Override
    default IEval variantMatch(IEval tag, IEval variant, IEval patt) {
        return (env, forward, store, given) -> {
            try {
                Variant v = (Variant)variant.eval(env, forward, store, given);
                return whenTrue(equal(tag, (e, f, s, g) -> v.tag()), match((e, f, s, g) -> v.value(), patt)).eval(env, forward, store, given);
            } catch (ClassCastException e) {
                return fail().eval(env, forward, store, given);
            }
        };
    }
}
