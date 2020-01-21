package funcons.values;

import funcons.values.properties.Comparable;
import funcons.values.properties.Value;

public class String implements Value, Comparable {
    private java.lang.String value;

    public String(java.lang.Integer i) {
        value = i.toString();
    }

    public String(java.lang.Boolean b) {
        value = b.toString();
    }

    public String(java.lang.Double d) {
        value = d.toString();
    }

    public String(java.lang.String s) {
        value = s;
    }

    public java.lang.String stringValue() {
        return value;
    }

    public String append(String other) {
        return new String(stringValue() + other.stringValue());
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof String && ((String) other).value.equals(value);
    }

    @Override
    public java.lang.String toString() {
        return value;
    }

    @Override
    public Boolean greaterThan(Comparable other) {
        java.lang.String otherString = ((String)other).stringValue();
        for (int i = 0, l = Math.min(stringValue().length(), otherString.length()); i < l; i++) {
            if (stringValue().charAt(i) != otherString.charAt(i)) {
                return stringValue().charAt(i) > otherString.charAt(i);
            }
        }
        return stringValue().length() - otherString.length() > 0;
    }
}
