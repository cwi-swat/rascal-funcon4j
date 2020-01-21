package funcons.interpreter;

import funcons.algebras.VectorAlg;
import funcons.carriers.IEval;
import funcons.values.Int;
import funcons.values.Vector;

public interface VectorFactory extends ListFactory, VectorAlg<IEval> {
    @Override
    default IEval vector() {
        return (env, forwards, store, given) -> new Vector();
    }

    @Override
    default IEval vector(IEval val) {
        return (env, forwards, store, given) -> new Vector(alloc(val).eval(env, forwards, store, given));
    }

    @Override
    default IEval vectorSelect(IEval vector, IEval index) {
        return (env, forwards, store, given) -> {
            Vector v = (Vector)vector.eval(env, forwards, store, given);
            Int i = (Int)index.eval(env, forwards, store, given);
            return assignedValue((e,f,s,g) -> v.get(i)).eval(env, forwards, store, given);
        };
    }

    @Override
    default IEval vectorAppend(IEval vector1, IEval vector2) {
        return (env, forwards, store, given) -> {
            Vector v1 = (Vector)vector1.eval(env, forwards, store, given);
            Vector v2 = (Vector)vector2.eval(env, forwards, store, given);
            return v1.append(v2);
        };
    }

    @Override
    default IEval vectorLength(IEval vect) {
        return (env, forwards, store, given) ->
                ((Vector)vect.eval(env, forwards, store, given)).length();
    }

    @Override
    default IEval vectorAssign(IEval vector, IEval index, IEval val) {
        return (env, forwards, store, given) -> {
            Vector vec = (Vector)vector.eval(env, forwards, store, given);
            Int i = (Int)index.eval(env, forwards, store, given);
            return assign((e,f,s,g) -> vec.get(i), val).eval(env, forwards, store, given);
        };
    }
}
