package funcons.values.types;

import funcons.values.properties.Value;

public class Token implements Value {
    private static Integer tokenCount = 0;

    private final Integer identifier;

    public Token() {
        identifier = tokenCount;
        tokenCount++;
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Token && ((Token)obj).identifier.equals(this.identifier);
    }
}
