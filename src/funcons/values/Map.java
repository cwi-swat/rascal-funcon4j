package funcons.values;

import funcons.values.properties.Comparable;
import funcons.values.properties.Value;

import java.lang.*;
import java.lang.String;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Map<K, V> implements Value, Comparable {
    private interface Keys<K> {
        Set<K> get();
    }

    private interface Scope<K, V> {
        V get(K key);
    }

    private final Scope<K, V> scope;
    private final Keys<K> keys;

    public Map() {
        scope = (key) -> null;
        keys = HashSet::new;
    }

    public Map(K key, V x) {
        scope = (otherKey) -> key.equals(otherKey) ? x : null;
        keys = () -> {
            Set<K> ks = new HashSet<>();
            ks.add(key);
            return ks;
        };
    }

    public Map(Map<K, V> m, K key, V x) {
        scope = (otherKey) -> key.equals(otherKey) ? x : m.val(otherKey);
        keys = () -> {
            Set<K> ks = m.keys();
            ks.add(key);
            return ks;
        };
    }

    public Map(Map<K, V> a, Map<K, V> b) {
        scope = (key) -> {
            V result = b.val(key);
            return result != null ? result : a.val(key);
        };
        keys = () -> {
            Set<K> ks = a.keys();
            ks.addAll(b.keys());
            return ks;
        };
    }

    public Map<K, V> add(K key, V x) {
        return new Map<>(this, key, x);
    }

    public Map<K, V> extend(Map<K, V> m) {
        return new Map<>(this, m);
    }

    public V val(K key) {
        return scope.get(key);
    }

    public Set<K> keys() {
        return keys.get();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Map[");
        Iterator<K> keyIterator = keys().iterator();
        while(keyIterator.hasNext()) {
            K key = keyIterator.next();
            sb.append(key);
            sb.append(":");
            sb.append(val(key));
            if (keyIterator.hasNext()) {
                sb.append("; ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return keys().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Map)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        Map<K,V> otherMap = ((Map<K,V>)other);

        Set<K> ks = keys();

        if (!ks.equals(otherMap.keys())) {
            return false;
        }

        for (K key : ks) {
            if (!val(key).equals(otherMap.val(key))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public Boolean greaterThan(Comparable other) {
        int nGreater = 0;
        for (K k : keys()) {
            V v = val(k);
            @SuppressWarnings("unchecked")
            Object otherV = ((Map)other).val(k);
            if (otherV != null && !((Comparable)v).equalsComparable(otherV)) {
                nGreater += ((Comparable)v).greaterThan(otherV) ? 1 : -1;
            }
        }
        return nGreater > 0;
    }
}
