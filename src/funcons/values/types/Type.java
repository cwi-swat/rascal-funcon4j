package funcons.values.types;

import funcons.values.properties.Value;

public class Type implements Value {
    public final java.lang.String name;

    public Type(java.lang.String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Type && ((Type)o).name.equals(this.name);
    }

    @Override
    public String toString() {
        return "Type: " + name;
    }
}
