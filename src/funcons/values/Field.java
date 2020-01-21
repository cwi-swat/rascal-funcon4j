package funcons.values;

import funcons.values.properties.Value;

import java.lang.*;
import java.lang.String;

public class Field implements Value {
    private java.lang.String name;

    public Field(java.lang.String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Field && ((Field)obj).name.equals(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
