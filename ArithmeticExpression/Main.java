package ArithmeticExpression;

public class Main {

    public static void main(String[] args) {
        Expression e1 = new ArithmeticExpression(new Number(10), new Number(5), Operator.ADD);

        Expression e2 = new ArithmeticExpression(e1, new Number(2), Operator.MULTIPLY);

        System.out.println("Result:" + " " + e2.evaluate());
    }
}
