package funcons.values;

import funcons.entities.Store;
import funcons.values.properties.Comparable;
import funcons.values.properties.Value;

import java.lang.*;
import java.lang.String;

public class Variable implements Value, Comparable {
    private java.lang.Integer loc;
    private Store store;

    public Variable(java.lang.Integer location, Store store) {
        this.loc = location;
        this.store = store;
    }

    public Value value() {
        return store.val(this);
    }

    @Override
    public int hashCode() {
        return loc;
    }

    @Override
    public String toString() {
        return "Variable@" + loc + "<" + value() + ">";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Variable && ((Variable)o).loc.equals(loc);
    }

    @Override
    public Boolean equalsComparable(Comparable other) {
        Value v = value();
        return !((Comparable)v).greaterThan(other) && !other.greaterThan(v);
    }

    @Override
    public Boolean equalsComparable(Object other) {
        return ((Comparable)other).equalsComparable(value());
    }

    @Override
    public Boolean greaterThan(Comparable other) {
        return other.smallerThan(this.value());
    }

    @Override
    public Boolean greaterThan(Object other) {
        Value v = this.value();
        return !((Comparable)other).equalsComparable(v) && ((Comparable)other).smallerThan(this.value());
    }
}
