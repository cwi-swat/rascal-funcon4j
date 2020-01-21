package funcons.values.signals;

import funcons.values.properties.Value;

public abstract class FunconException extends Exception implements Value {
    private java.lang.String message;

    public FunconException(java.lang.String message) {
        super(message);
        this.message = message;
    }

    @Override
    public int hashCode() {
        return message.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FunconException && ((FunconException)obj).message.equals(message);
    }
}
