package funcons.values.types;

import funcons.values.properties.Value;

public class NominalType extends Type {

    private final Token token;

    public NominalType(Value name, Token token) {
        super(name.toString()); // TODO Hacky?
        this.token = token;
    }

    @Override
    public int hashCode() {
        return token.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof NominalType && ((NominalType)obj).token.equals(this.token);
    }
}
