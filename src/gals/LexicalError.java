package gals;

public class LexicalError extends AnalysisError {

    private String lexeme;
    private int position;

    public int getPosition() {
        return position;
    }

    public LexicalError(String msg, String lexeme, int position) {
        super(msg);
        this.lexeme = lexeme;
        this.position = position;
    }

    public LexicalError(String msg) {
        super(msg);
    }

    public String getLexeme() {
        return lexeme;
    }
}