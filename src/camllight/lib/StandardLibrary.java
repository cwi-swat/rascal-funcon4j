package camllight.lib;

public interface StandardLibrary<E> {
    funcons.algebras.RecordAlg<E> alg();

    default E refFun() {
        return alg().abs(alg().alloc(alg().given()));
    }

    default E print_floatFun() {
        return alg().abs(alg().print(alg().given()));
    }

    default E print_stringFun() {
        return alg().abs(alg().print(alg().given()));
    }

    default E concat_vectFun() {
        return alg().curry(alg().abs(
                alg().vectorAppend(
                        alg().project(alg().lit(0), alg().given()),
                        alg().project(alg().lit(1), alg().given())
                )
        ));
    }

    default E vect_lengthFun() {
        return alg().abs(alg().vectorLength(alg().given()));
    }

    default E make_vectFun() {
        /* in pseudocode:
            counter = 0
            vector = [| |]
            while vector < vectSize
                vector = vector + [| vectValue |]
                counter = counter + 1
            return vector
         */

        E vectSize = alg().project(alg().lit(0), alg().given());
        E vectValue =  alg().project(alg().lit(1), alg().given());
        E bindToCounter = alg().bindValue(alg().id("_1"), alg().alloc(alg().lit(0)));
        E bindToVector = alg().bindValue(alg().id("_2"), alg().alloc(alg().vector()));
        E counter = alg().boundValue(alg().id("_1"));
        E incrCounter = alg().assign(
                counter,
                alg().intAdd(
                        alg().assignedValue(counter),
                        alg().lit(1)
                )
        );
        E vector = alg().boundValue(alg().id("_2"));
        E addToVector = alg().assign(
                vector,
                alg().vectorAppend(
                        alg().assignedValue(vector),
                        alg().vector(vectValue)
                )
        );
        E contCondition = alg().smaller(alg().assignedValue(counter), vectSize);
        E createVector = alg().whileTrue(
                contCondition,
                alg().seq(
                        addToVector,
                        incrCounter

                )
        );

        return alg().curry(alg().abs(
                alg().scope(
                        bindToCounter,
                        alg().scope(
                                bindToVector,
                                alg().seq(createVector, alg().assignedValue(vector))
                        )
                )
        ));
    }
}
