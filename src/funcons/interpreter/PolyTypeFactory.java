package funcons.interpreter;

import funcons.algebras.PolyTypeAlg;
import funcons.carriers.IEval;

public interface PolyTypeFactory extends TypeFactory, PolyTypeAlg<IEval> {

    @Override
    default IEval instantiatePoly(IEval x) {
        return x;
    }

    @Override
    default IEval instantiateIfPoly(IEval x) {
        return x;
    }

    @Override
    default IEval generalise(IEval x) {
        return x;
    }

    @Override
    default IEval generaliseIfPoly(IEval x) {
        return x;
    }

    @Override
    default IEval generaliseDecl(IEval x) {
        return x;
    }

    @Override
    default IEval generaliseMap(IEval x) {
        return x;
    }
}
