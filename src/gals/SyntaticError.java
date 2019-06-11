package gals;

public class SyntaticError extends AnalysisError {

    private Token token;

    public SyntaticError(String msg, Token token) {
        super(msg);
        this.token = token;
    }

    public SyntaticError(String msg) {
        super(msg);
    }

    public Token getToken() {
        return token;
    }
    
    
}