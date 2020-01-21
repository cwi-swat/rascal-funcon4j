package funcons.values.cl;

public class CLMatchFailureException extends CLVariant {
    public CLMatchFailureException() {
        super("Match_failure", new funcons.values.Null());
    }
}
