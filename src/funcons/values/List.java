package funcons.values;

import funcons.values.properties.Comparable;
import funcons.values.properties.Value;

public class List implements Value, Comparable {
    private List tail;
    private Value head;

    public List() {
        tail = null;
        head = null;
    }

    public List(Value v) {
        tail = new List();
        head = v;
    }

    public List(Value v1, Value v2) {
        tail = new List(v2);
        head = v1;
    }

    private List(Value v, List l) {
        tail = l;
        head = v;
    }


    public List prepend(Value v) {
        return new List(v, this);
    }

    public List append(Value v) {
        return append(new List(v));
    }

    public List append(List l) {
        if (head() == null) {
            return l;
        }

        List newL = l.prepend(head());
        return tail() == null ? newL : tail().append(newL);
    }

    public Value get(Int i) {
        if (i.intValue() == 0) {
            return head;
        }
        return tail.get(new Int(i.intValue() - 1));
    }

    public List set(Int i, Value v) {
        if (i.intValue() == 0) {
            return new List(v, tail());
        }
        return new List(head(), tail().set(new Int(i.intValue() - 1), v));
    }

    public List reverse() {
        java.util.ArrayList<Value> items = this.toArrayList();
        List list = new List();
        for (java.util.ListIterator<Value> iterator = items.listIterator(items.size()); iterator.hasPrevious();) {
            list = list.prepend(iterator.previous());
        }
        return list;
    }

    public Value head() {
        return head;
    }

    public List tail() {
        return tail;
    }

    public Int length() {
        if (head == null) {
            return new Int(0);
        }
        return new Int(1 + tail.length().intValue());
    }

    @Override
    public java.lang.String toString() {
        return "[" +
                (head() == null ? "" : head() + ", ") +
                (tail() == null ? "" : tail()) +
                "]";
    }

    @Override
    public int hashCode() {
        return (head == null ? 0 : head.hashCode()) + (tail == null ? 0 : 10 * tail.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof List)) {
            return false;
        }

        List other = (List)o;

        return (head == null ? other.head == null : head.equals(other.head)) &&
                (tail == null ? other.tail == null : tail.equals(other.tail));
    }

    private java.util.ArrayList<Value> toArrayList() {
        java.util.ArrayList<Value> items = new java.util.ArrayList<>();
        List cursor = this;
        while (cursor != null && cursor.head() != null) {
            items.add(cursor.head());
            cursor = cursor.tail();
        }
        java.util.Collections.reverse(items);
        return items;
    }

    @Override
    public Boolean greaterThan(Comparable other) {
        List otherList = ((List)other);
        if (head() == null || otherList.head() == null) {
            return head() != null && otherList.head() == null;
        }

        if (((Comparable)head()).greaterThan(otherList.head())) {
            return true;
        }

        if (((Comparable)head()).equalsComparable(otherList.head())) {
            return tail().greaterThan(otherList.tail());
        }

        return false;
    }
}
