package funcons.interpreter;

import funcons.algebras.AssignAlg;
import funcons.carriers.IEval;
import funcons.values.Null;
import funcons.values.Variable;
import funcons.values.properties.Value;

public interface AssignFactory extends ElseFactory, AssignAlg<IEval> {

    @Override
    default IEval assign(IEval var, IEval x) {
        return (env, forward, store, given) -> {
            store.store((Variable) var.eval(env, forward, store, given), x.eval(env, forward, store, given));
            return new Null();
        };
    }

    @Override
    default IEval assignedValue(IEval var) {
        return (env, forward, store, given) -> store.val((Variable)var.eval(env, forward, store, given));
    }

    @Override
    default IEval assignedValueIfVar(IEval v) {
        return (env, forward, store, given) -> {
            Value val = v.eval(env, forward, store, given);
            try {
                return store.val((Variable)val);
            } catch (java.lang.ClassCastException e) {
                return val;
            }
        };
    }

    @Override
    default IEval alloc(IEval x) {
        return (env, forward, store, given) -> store.alloc(x.eval(env, forward, store, given));
    }

}
