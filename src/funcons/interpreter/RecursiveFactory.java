package funcons.interpreter;

import funcons.algebras.RecursiveAlg;
import funcons.carriers.IEval;
import funcons.values.List;
import funcons.values.Map;
import funcons.values.Undefined;
import funcons.values.properties.Value;
import funcons.values.ids.Id;
import funcons.values.recursion.Fwd;

public interface RecursiveFactory extends ModuleFactory, RecursiveAlg<IEval> {

    @Override
    default IEval freshFwd() {
        return (env, forward, store, given) -> forward.freshFwd();
    }

    @Override
    default IEval freshFwds(IEval idList) {
        return (env, forward, store, given) -> {
            IEval envEval = environment();
            List list = (List)idList.eval(env, forward, store, given);
            Undefined undefined = (Undefined)undefined().eval(env, forward, store, given);

            while(list.head() != null) {
                Id id = (Id)list.head();
                Fwd fwd = (Fwd)freshFwd().eval(env, forward, store, given);

                forward.add(fwd, undefined);

                envEval = mapUpdate(envEval, (e,f,s,g) -> id, (e,f,s,g) -> fwd);
                list = list.tail();
            }

            return envEval.eval(env, forward, store, given);
        };
    }

    @Override
    default IEval setForwards(IEval idFwdMap) {
        return (env, forward, store, given) -> {
            Map map = (Map)idFwdMap.eval(env, forward, store, given);
            for (Object idObject : map.keys()) {
                Id id = (Id)idObject;
                Value v = env.val(id);
                if (v == null) {
                    v = new Undefined();
                }
                @SuppressWarnings("unchecked")
                Fwd fwd = (Fwd)map.val(id);
                forward.add(fwd, v);
            }
            return null_().eval(env, forward, store, given);
        };
    }

    @Override
    default IEval reclose(IEval map, IEval decl) {
        return (env, forward, store, given) -> {
            Map m = (Map)map.eval(env, forward, store, given);
            return accum(scope((e,s,f,g) -> m, decl), seq(setForwards((e,s,f,g) -> m), environment())).eval(env, forward, store, given);
        };
    }

    @Override
    default IEval recursive(IEval idList, IEval decl) {
        return reclose(freshFwds(idList), decl);
    }

    @Override
    default IEval recursiveTyped(IEval idTypeMap, IEval decl) {
        return recursive(mapDomain(idTypeMap), decl);
    }

    @Override
    default IEval followFwd(IEval fwd) {
        return (env, forward, store, given) -> forward.follow((Fwd)fwd.eval(env, forward, store, given));
    }

    @Override
    default IEval followIfFwd(IEval fwd) {
        return (env, forward, store, given) -> {
            Value v = fwd.eval(env, forward, store, given);
            try {
                return forward.follow((Fwd)v);
            } catch (ClassCastException ignore) {
                return v;
            }
        };
    }
}
