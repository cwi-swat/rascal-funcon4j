package funcons.values.types;

import funcons.values.properties.Value;

public class Depends extends Type {

    private final Value type1, type2;

    public Depends(Value type1, Value type2) {
        super("Depends: " + type1 + " " + type2);
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Depends &&
                ((Depends) o).type1.equals(this.type1) &&
                ((Depends) o).type2.equals(this.type2);
    }
}
