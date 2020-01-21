package funcons.interpreter.tests;

import funcons.algebras.PrintAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.PrintFactory;
import funcons.values.Environment;
import funcons.values.Null;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintFactoryTest {

    PrintAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new PrintFactory() {};
    }

    @Test
    public void testPrint() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        alg.print(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("0", outContent.toString());
    }
}