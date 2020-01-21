package funcons.values.cl;

import funcons.values.String;

import java.util.ArrayList;
import java.util.Iterator;

public class CLString extends String {
    public CLString(java.lang.String s) {
        super(filterCamlLightEscapes(s));
    }

    private static java.lang.String filterCamlLightEscapes(java.lang.String s) {
        StringBuilder sb = new StringBuilder();
        Iterator<java.lang.Character> charIt = charIterator(s);

        while(charIt.hasNext()) {
            java.lang.Character c = charIt.next();

            if (c.equals('\\')) {
                c = handleEscape(charIt);
            }

            sb.append(c);
        }

        return sb.toString();
    }

    private static Iterator<java.lang.Character> charIterator(java.lang.String s) {
        java.util.List<java.lang.Character> cs = new ArrayList<>();
        for (java.lang.Character c : s.toCharArray()) {
            cs.add(c);
        }
        return cs.iterator();
    }

    private static java.lang.Character handleEscape(Iterator<java.lang.Character> charIt) {
        Character c = charIt.next();

        if (!Character.isDigit(c)) {
            return getCamlLightEscape(c);
        }

        return (char)Integer.parseInt("" + c + charIt.next() + charIt.next());
    }

    private static java.lang.Character getCamlLightEscape(java.lang.Character c) {
        if (c.equals('\\')) {
            return '\\';
        }
        if (c.equals('"')) {
            return '"';
        }
        if (c.equals('n')) {
            return '\n';
        }
        if (c.equals('r')) {
            return '\r';
        }
        if (c.equals('t')) {
            return '\t';
        }
        if (c.equals('b')) {
            return '\b';
        }

        throw new UnsupportedOperationException();
    }
}
