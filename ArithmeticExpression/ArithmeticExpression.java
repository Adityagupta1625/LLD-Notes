package ArithmeticExpression;

public class ArithmeticExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;
    private Operator operator;

    public ArithmeticExpression(Expression leftExpression, Expression rightExpression, Operator operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    public int evaluate() {
        switch (operator) {
            case ADD:
                return leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT:
                return leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY:
                return leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE:
                return leftExpression.evaluate() / rightExpression.evaluate();
        }
        return 0;
    }
}
