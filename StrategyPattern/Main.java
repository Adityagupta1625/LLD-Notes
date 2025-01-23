package StrategyPattern;

public class Main {

    public static void main(String[] args) {
        context context = new context(new AddStrategy());
        System.out.println(context.executeStrategy(1, 2));

        context = new context(new MultiplicationStrategy());
        System.out.println(context.executeStrategy(1, 2));
    }
}
