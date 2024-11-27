package InterpreterPattern;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        context.set("a", 3);
        context.set("b", 3);
        context.set("c", 4);
        context.set("d", 5);

        AbstractExpression e1 = new NonTerminalExpression(new TerminalExpression("a"), new TerminalExpression("b"),
                "+");

        AbstractExpression e2 = new NonTerminalExpression(new TerminalExpression("c"), new TerminalExpression("d"),
                "+");

        AbstractExpression e3 = new NonTerminalExpression(e1, e2, "*");

        System.out.println(e3.interpret(context));
    }
}
