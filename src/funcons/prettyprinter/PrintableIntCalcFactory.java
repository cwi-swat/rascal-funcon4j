package funcons.prettyprinter;

import funcons.algebras.IntCalcAlg;
import funcons.carriers.IPrint;
import funcons.values.String;

public interface PrintableIntCalcFactory extends IntCalcAlg<IPrint> {

    @Override
    default IPrint lit(Integer i) {
        return () -> new String(i);
    }

    @Override
    default IPrint intAdd(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " + " + b.print().stringValue() + ")");
    }

    @Override
    default IPrint intSubtract(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " - " + b.print().stringValue() + ")");
    }

    @Override
    default IPrint intMultiply(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " * " + b.print().stringValue() + ")");
    }

    @Override
    default IPrint intDivide(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " / " + b.print().stringValue() + ")");
    }
}
