package funcons.interpreter;

import funcons.algebras.ModuleAlg;
import funcons.carriers.IEval;
import funcons.values.Environment;
public interface ModuleFactory extends PolyTypeFactory, ModuleAlg<IEval> {

    @Override
    default IEval accum(IEval environment, IEval decl) {
        return (env, forward, store, given) -> {
            Environment currentEnv = (Environment)environment.eval(env, forward, store, given);
            return scope((e,f,s,g) -> currentEnv, mapOver(decl, (e,f,s,g) -> currentEnv)).eval(env, forward, store, given);
        };
    }
}
