package funcons.values.types;

import funcons.values.Int;
import funcons.values.Tuple;

public class TupleType extends Type {
    private Tuple tuple;

    public TupleType() {
        super("TupleType()");
        tuple = new Tuple();
    }

    public TupleType(Type a) {
        super("TupleType(" + a + ")");
        tuple = new Tuple(a);
    }

    public TupleType(Type a, Type b) {
        super("TupleType(" + a + ", " + b + ")");
        tuple = new Tuple(a, b);
    }

    public TupleType(Type a, Type b, Type c) {
        super("TupleType(" + a + ", " + b + ", " + c + ")");
        tuple = new Tuple(a, b, c);
    }

    private TupleType(TupleType tupleType, Type type) {
        super("TupleType(" + tupleType + " " + type + ")");
        this.tuple = tupleType.tuple.prepend(type);
    }

    public TupleType prepend(Type t) {
        return new TupleType(this, t);
    }

    public Type get(Int i) {
        return (Type)tuple.get(i);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof TupleType && ((TupleType)o).tuple.equals(this.tuple);
    }
}
