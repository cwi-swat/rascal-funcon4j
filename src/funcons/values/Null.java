package funcons.values;

import funcons.values.properties.Unit;

public class Null implements Unit {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Null;
    }

    @Override
    public java.lang.String toString() {
        return "NULL";
    }
}
