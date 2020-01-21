package funcons.values;

import funcons.values.properties.Comparable;
import funcons.values.properties.Value;

public class Vector implements Value, Comparable {
    private final List list;

    public Vector() {
        list = new List();
    }

    public Vector(Value v) {
        list = new List(v);
    }

    public Vector(List l) {
        list = l;
    }

    public Vector append(Vector other) {
        return new Vector(list.append(other.list));
    }

    public Value get(Int i) {
        return list.get(i);
    }

    public Vector set(Int i, Value v) {
        return new Vector(list.set(i, v));
    }

    public Int length() {
        return list.length();
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Vector && ((Vector)other).list.equals(this.list);
    }

    @Override
    public java.lang.String toString() {
        return "Vector<" + list.toString() + ">";
    }

    @Override
    public Boolean greaterThan(Comparable other) {
        return list.greaterThan(((Vector)other).list);
    }
}
