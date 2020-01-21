package funcons.carriers;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.values.Environment;
import funcons.values.properties.Value;
import funcons.values.signals.FunconException;

public interface IEval {
    Value eval(Environment env, Forwards forward, Store store, Value given) throws FunconException;
}