package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class IntCalcAlgTest extends TestStub {

    @Test
    public void testIntUnarySub() throws Exception {
        test("-1;;", "-1");
        test("--1;;", "1");
    }

    @Test
    public void testIntAdd() throws Exception {
        test("1 + 2;;", "3");
    }

    @Test
    public void testIntSub() throws Exception {
        test("3 - 2;;", "1");
    }

    @Test
    public void testIntMultiply() throws Exception {
        test("2 * 3;;", "6");
    }

    @Test
    public void testIntDivide() throws Exception {
        test("6 / 2;;", "3");
        test("1 / 2;;", "0");
    }

    @Test
    public void testIntMod() throws Exception {
        test("3 mod 2;;", "1");
    }
}