package funcons.values.types;

import funcons.values.properties.Value;

public class Tag implements Value {
    public final java.lang.String name;

    public Tag(java.lang.String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Tag && ((Tag)o).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Tag(" + name + ")";
    }
}
