package funcons.prettyprinter;

import funcons.algebras.LogicControlAlg;
import funcons.carriers.IPrint;
import funcons.values.String;

public interface PrintableLogicControlFactory extends
        PrintableIntCalcFactory,
        LogicControlAlg<IPrint> {

    @Override
    default IPrint bool(Boolean b) {
        return () -> new String(b);
    }

    @Override
    default IPrint effect(IPrint i) {
        return () -> new String("effect(" + i.print().stringValue() + ")");
    }

    @Override
    default IPrint ifTrue(IPrint e, IPrint c1, IPrint c2) {
        return () -> new String("(" + e.print().stringValue() + " ? " + c1.print().stringValue() + " : " + c2.print().stringValue() + ")");
    }

    @Override
    default IPrint seq(IPrint c, IPrint e) {
        return () -> new String("(" + c.print().stringValue() + " -> " + e.print().stringValue() + ")");
    }

    @Override
    default IPrint whileTrue(IPrint e, IPrint c) {
        return () -> new String("(While " + e.print().stringValue() + " do " + c.print().stringValue() + ")");
    }
}
