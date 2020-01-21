package funcons.values.properties;

public interface Comparable {
    java.lang.Boolean greaterThan(Comparable other);

    default java.lang.Boolean equalsComparable(Comparable other) {
        return !greaterThan(other) && !other.greaterThan(this);
    }

    default java.lang.Boolean smallerThan(Comparable other) {
        return !greaterThan(other) && !equals(other);
    }

    default java.lang.Boolean equalsComparable(Object other) {
        return ((Comparable)other).equalsComparable(this);
    }

    default java.lang.Boolean greaterThan(Object other) {
        return !equalsComparable(other) && ((Comparable)other).smallerThan(this);
    }

    default java.lang.Boolean smallerThan(Object other) {
        return !greaterThan(other) && !equalsComparable((Comparable)other);
    }

    default java.lang.Boolean greaterEqualThan(Object other) {
        return !smallerThan(other);
    }

    default Boolean smallerEqualThan(Object other) {
        return !greaterThan(other);
    }
}
