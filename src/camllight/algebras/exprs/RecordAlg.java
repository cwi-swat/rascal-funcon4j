package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface RecordAlg<E> {
    funcons.algebras.RecordAlg<E> alg();

    @Syntax("exp = '{' recordsingle@','+ '}'") @Level(1700)
    default E recordExp(List<E> records) {
        ListIterator<E> it = records.listIterator(records.size());
        E record = it.previous();
        while(it.hasPrevious()) {
            record = alg().recordUnion(it.previous(), record);
        }
        return record;
    }

    @Syntax("recordsingle = IDTOKEN '=' exp")
    default E recordEntrySingle(java.lang.String fieldName, E exp) {
        return alg().record(alg().field(fieldName), exp);
    }

    @Syntax("recordsingle = 'mutable' IDTOKEN '=' exp")
    default E recordEntryMutableSingle(java.lang.String fieldName, E exp) {
        return alg().record(alg().field(fieldName), alg().alloc(exp));
    }

    @Syntax("exp = exp '.' IDTOKEN") @Level(1400)
    default E recordSelectExp(E record, java.lang.String fieldName) {
        return alg().assignedValueIfVar(alg().recordSelect(record, alg().field(fieldName)));
        /*return alg().assignedValueIfVar(alg().recordSelect(
                alg().apply(
                        alg().instantiateIfPoly(alg().boundValue(alg().nameId("label_selector", fieldName))),
                        record),
                alg().field(fieldName)
        ));*/
    }

    @Syntax("exp = exp '.' IDTOKEN '<-' exp") @Level(1300)
    default E recordAssignExp(E record, java.lang.String fieldName, E exp) {
        return alg().assign(alg().recordSelect(record, alg().field(fieldName)), exp);
    }
}
