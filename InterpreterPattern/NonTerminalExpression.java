package InterpreterPattern;

public class NonTerminalExpression implements AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;
    private String operator;

    public NonTerminalExpression(AbstractExpression left, AbstractExpression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Integer interpret(Context context) {
        if (operator.equals("+")) {
            return left.interpret(context) + right.interpret(context);
        } else if (operator.equals("-")) {
            return left.interpret(context) - right.interpret(context);
        } else if (operator.equals("*")) {
            return left.interpret(context) * right.interpret(context);
        } else if (operator.equals("/")) {
            return left.interpret(context) / right.interpret(context);
        }
        return 0;
    }

}
