package funcons.values.cl;

import funcons.values.Char;

public class CLChar extends Char {
    public CLChar(java.lang.String s) {
        super(getCamlLightChar(s));
    }

    private static java.lang.Character getCamlLightChar(java.lang.String s) {
        if (s.length() == 1) {
            return s.charAt(0);
        }
        if (s.length() == 4) {
            return (char)Integer.parseInt(s.substring(1, s.length()));
        }
        if (s.equals("\\\\")) {
            return '\\';
        }
        if (s.equals("\\`")) {
            return '`';
        }
        if (s.equals("\\n")) {
            return '\n';
        }
        if (s.equals("\\r")) {
            return '\r';
        }
        if (s.equals("\\t")) {
            return '\t';
        }
        if (s.equals("\\b")) {
            return '\b';
        }

        throw new UnsupportedOperationException();
    }
}
