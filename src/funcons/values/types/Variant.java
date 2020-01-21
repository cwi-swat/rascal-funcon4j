package funcons.values.types;

import funcons.values.properties.Value;

public interface Variant extends Value {
    Tag tag();
    Value value();
}
