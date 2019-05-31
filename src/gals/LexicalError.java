package gals;

public class LexicalError extends AnalysisError {

    public LexicalError(String msg, int position) {
        super(msg);
    }

    public LexicalError(String msg) {
        super(msg);
    }
}
