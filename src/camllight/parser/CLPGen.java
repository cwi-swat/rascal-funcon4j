package camllight.parser;

import camllight.algebras.AllAlg;
import noa.syntax.PGen;

public class CLPGen {
    public static void main(String[] args) {
        PGen pgen = new PGen(camllight.parser.Tokens.class, AllAlg.class);
        pgen.generate("CL", "camllight.parser", "", true); // TODO the path parameter seems to be completely ignored???
    }
}
