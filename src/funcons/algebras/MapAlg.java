package funcons.algebras;

public interface MapAlg<E> extends LogicControlAlg<E> {
    E id(java.lang.String s);
    E nameId(java.lang.String namespace, java.lang.String id);
    E bindValue(E id, E exp);
    E boundValue(E id);
    E scope(E localBindings, E exp);
    E given();
    E supply(E exp, E x);
    E environment();
    E environment(E id, E val);
    E map(E key, E val);
    E mapUpdate(E map, E key, E e);
    E mapDomain(E map);
    E mapUnion(E map1, E map2);
    E mapOver(E map1, E map2);
}