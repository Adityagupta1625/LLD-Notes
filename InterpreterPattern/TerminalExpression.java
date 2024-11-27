package InterpreterPattern;

public class TerminalExpression implements AbstractExpression {

    private String stringVal;

    public TerminalExpression(String stringVal) {
        this.stringVal = stringVal;
    }

    public Integer interpret(Context context) {
        return context.get(stringVal);
    }
}
