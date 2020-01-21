package funcons.values.ids;

public class NameId extends Id {
    public final java.lang.String namespace;

    public NameId(java.lang.String namespace, java.lang.String name) {
        super(name);
        this.namespace = namespace;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof NameId && ((NameId)o).namespace.equals(this.namespace) && super.equals(o);
    }
}
