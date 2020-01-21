package funcons.values;

import funcons.values.ids.Id;
import funcons.values.properties.Value;

public class Environment extends Map<Id, Value> {

    public Environment() {
        super();
    }

    public Environment(Id key, Value x) {
        super(key, x);
    }

    private Environment(Environment m, Id key, Value x) {
        super(m, key, x);
    }

    private Environment(Environment a, Map<Id, Value> b) {
        super(a, b);
    }

    @Override
    public Environment add(Id key, Value x) {
        return new Environment(this, key, x);
    }

    @Override
    public Environment extend(Map<Id, Value> m) {
        return new Environment(this, m);
    }
}
