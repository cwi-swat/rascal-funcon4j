package camllight.parser;

import noa.syntax.Level;
import noa.syntax.Skip;
import noa.syntax.Token;

public interface Tokens {
    @Token("[0-9]+")
    static int inttoken(String src) {
        return Integer.parseInt(src);
    }

    @Token("[0-9]+ '.' [0-9]*")
    static float floattoken(String src) {
        return Float.parseFloat(src);
    }

    @Token("'false' | 'true'")
    static boolean booltoken(String src) {
        return src.equals("true");
    }

    @Token("'\"' (~('\"' | '\\\\') | '\\\\' ('\"' | '\\\\' | 'n' | 'r' | 't' | 'b' | [0-9][0-9][0-9]))* '\"'")
    static String stringtoken(String src) {
        return src.substring(1, src.length() - 1);
    }

    @Token("'`' (~('`' | '\\\\') | '\\\\' ('`' | '\\\\' | 'n' | 'r' | 't' | 'b' | [0-9][0-9][0-9]))* '`'")
    static String chartoken(String src) {
        return src.substring(1, src.length() - 1);
    }

    @Token("'_'")
    static String wildcardtoken(String src) {
        return src;
    }

    @Token("[ ]+") @Skip
    void ws();

    @Token("['\\n']+") @Skip
    void linefeed();

    @Token("['\\r']+") @Skip
    void carriagereturn();

    @Token("['\\t']+") @Skip
    void horizontaltab();

    @Token("['\\f']+") @Skip
    void formfeed();

    @Token("'(*' .*? '*)'") @Skip
    void comment();

    @Token("'[' [ ]* ']'")
    static String emptylisttoken(String src) {
        return src;
    }

    @Token("'[|' [ ]* '|]'")
    static String emptyarraytoken(String src) {
        return src;
    }

    @Token("'(' [ ]* ')'")
    static String nulltoken(String src) {
        return src;
    }

    @Token("[A-Z][a-zA-Z_0-9]*") @Level(0)
    static String constrtoken(String src) {
        return src;
    }

    @Token("[a-z_][a-zA-Z_0-9]*") @Level(1)
    static String idtoken(String src) {
        return src;
    }
}