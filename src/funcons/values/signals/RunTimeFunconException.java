package funcons.values.signals;

import funcons.values.Null;
import funcons.values.properties.Value;

public class RunTimeFunconException extends FunconException {
    final Value value;

    public RunTimeFunconException(java.lang.String message) {
        super(message);
        value = new Null();
    }

    public RunTimeFunconException(java.lang.String message, Value v) {
        super(message);
        value = v;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof RunTimeFunconException &&
                ((RunTimeFunconException)obj).value.equals(value) &&
                super.equals(obj);
    }
}
