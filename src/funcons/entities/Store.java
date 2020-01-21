package funcons.entities;

import funcons.values.properties.Value;
import funcons.values.Variable;

import java.util.HashMap;

public class Store {
    private java.lang.Integer allocCount;
    private HashMap<Variable, Value> map;

    public Store() {
        map = new HashMap<>();
        allocCount = 0;
    }

    public void store(Variable var, Value val) {
        map.put(var, val);
    }

    public Value val(Variable var) {
        return map.get(var);
    }

    public Variable alloc() {
        Variable v = new Variable(allocCount, this);
        allocCount++;
        return v;
    }

    public Variable alloc(Value initialValue) {
        Variable v = new Variable(allocCount, this);
        allocCount++;
        map.put(v, initialValue);
        return v;
    }
}
