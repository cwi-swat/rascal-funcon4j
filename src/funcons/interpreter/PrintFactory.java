package funcons.interpreter;

import funcons.algebras.PrintAlg;
import funcons.carriers.IEval;
import funcons.values.Null;

public interface PrintFactory extends StringFactory, PrintAlg<IEval> {
    @Override
    default IEval print(IEval x) {
        return (env, forward, store, given) -> {
            System.out.print(x.eval(env, forward, store, given));
            return new Null();
        };
    }
}
