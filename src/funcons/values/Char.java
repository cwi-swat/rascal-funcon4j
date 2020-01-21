package funcons.values;

import funcons.values.properties.Comparable;
import funcons.values.properties.Value;

import java.lang.*;
import java.lang.String;

public class Char implements Value, Comparable {
    private java.lang.Character value;

    public Char(java.lang.Character c) {
        value = c;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Char && ((Char)obj).value.equals(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public Boolean greaterThan(Comparable other) {
        return value > ((Char)other).value;
    }
}
