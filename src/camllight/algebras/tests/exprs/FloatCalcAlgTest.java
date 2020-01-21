package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class FloatCalcAlgTest extends TestStub {

    @Test
    public void testFloatNegateExp() throws Exception {
        test("-.1.;;", "-1.0");
    }

    @Test
    public void testFloatAddExp() throws Exception {
        test("3.5 +. 1.2;;", "4.700000047683716");
    }

    @Test
    public void testFloatSubtractExp() throws Exception {
        test("3.5 -. 1.2;;", "2.299999952316284");
    }

    @Test
    public void testFloatMultiplyExp() throws Exception {
        test("3.0 *. 1.5;;", "4.5");
    }

    @Test
    public void testFloatDivideExp() throws Exception {
        test("3.0 /. 1.5;;", "2.0");
    }

    @Test
    public void testFloatPowerExp() throws Exception {
        test("4.0 ** 2.0;;", "16.0");
    }
}