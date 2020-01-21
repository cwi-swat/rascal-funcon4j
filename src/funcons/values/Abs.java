package funcons.values;

import funcons.values.properties.Value;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Abs<E> implements Value {

    private final E body;

    public Abs(E body) {
        this.body = body;
    }

    public E body() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        return o == this;
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException();
    }

    @Override
    public java.lang.String toString() {
        return "ABS: " + body.toString();
    }
}
