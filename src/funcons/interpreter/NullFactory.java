package funcons.interpreter;

import funcons.algebras.NullAlg;
import funcons.carriers.IEval;
import funcons.values.Null;
import funcons.values.Undefined;

public interface NullFactory extends NullAlg<IEval> {

    @Override
    default IEval null_() {
        return (env, forward, store, given) -> new Null();
    }

    @Override
    default IEval undefined() {
        return (env, forword, store, given) -> new Undefined();
    }
}
