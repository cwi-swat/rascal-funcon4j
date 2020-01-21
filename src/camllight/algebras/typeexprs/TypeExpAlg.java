package camllight.algebras.typeexprs;

import camllight.algebras.base.ModuleAlg;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface TypeExpAlg<E> {

    funcons.algebras.TypeAlg<E> alg();

    @Syntax("type = '(' type ')'")
    default E bracketedType(E type) {
        return type;
    }

    @Syntax("type = IDTOKEN")
    default E typeId(java.lang.String name) {
        return alg().type(name);
        //return alg().boundType(alg().id(name));
    }

    @Syntax("type = type '->' type")
    default E functionType(E t1, E t2) {
        return alg().depends(t1, t2);
    }

    /*
    to-funcons:
    |[ type[: ~T ~LI :] ]| ->
    |[ instantiate_type(type[: ~LI :], type_list[: ~T :]) ]|
    to-funcons:
    |[ type[: (~T1 , ~T2 ...) ~LI :] ]| ->
    |[ instantiate_type(type[: ~LI :], type_list[: ~T1 , ~T2 ... :]) ]|
     */

    // Syntax only
    @Syntax("type = type IDTOKEN")
    default E typeIdType(E type, java.lang.String idToken) {
        return typeId(idToken);
    }

    // Syntax only
    @Syntax("type = '(' type@','+ ')' IDTOKEN")
    default E typesIdType(List<E> types, java.lang.String idToken) {
        return typeId(idToken);
    }

    @Syntax("type = vartype")
    default E varTypeType(E varType) {
        return varType;
    }

    @Syntax("vartype = '\\'' IDTOKEN")
    default E varType(java.lang.String id) {
        return alg().typeVar(id);
    }

    @Syntax("type = type tupletypelist+")
    default E tupleType(E t, List<E> ts) {
        E tuple = alg().tupleType();

        ListIterator<E> it = ts.listIterator(ts.size());
        while (it.hasPrevious()) {
            tuple = alg().tupleTypePrefix(it.previous(), tuple);
        }

        return alg().tupleTypePrefix(t, tuple);
    }

    @Syntax("tupletypelist = '*' type")
    default E tupleTypeSingle(E type) {
        return type;
    }
}
