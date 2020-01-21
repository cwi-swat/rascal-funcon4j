package funcons.values.cl;

import funcons.values.properties.Value;
import funcons.values.signals.RunTimeFunconException;
import funcons.values.types.Tag;
import funcons.values.types.Variant;

public class CLVariant extends RunTimeFunconException implements Variant {

    private final Tag tag;
    private final Value value;

    public CLVariant(java.lang.String tagName, Value v) {
        super(tagName);
        this.tag = new Tag(tagName);
        this.value = v;
    }

    @Override
    public Tag tag() {
        return tag;
    }

    @Override
    public Value value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Variant && ((Variant)o).tag().equals(tag()) && ((Variant)o).value().equals(value());
    }

    @Override
    public int hashCode() {
        return tag().hashCode() * 37 + value().hashCode();
    }

    @Override
    public String toString() {
        return "Variant(" + tag() + "," + value() + ")";
    }
}
