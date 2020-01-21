package funcons.values.recursion;

import funcons.values.properties.Value;

public class Fwd implements Value {
    private final java.lang.Integer n;

    public Fwd(java.lang.Integer n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Fwd && ((Fwd)obj).n.equals(this.n);
    }

    @Override
    public int hashCode() {
        return n.hashCode();
    }

    @Override
    public String toString() {
        return "Forward:" + n;
    }
}
