package funcons.values.types;

import funcons.values.properties.Value;

public class NominalTag implements Value {

    private final Token token;

    public NominalTag(Token token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof NominalTag && ((NominalTag)obj).token.equals(this.token);
    }
}
