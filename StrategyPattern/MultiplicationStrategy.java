package StrategyPattern;

public class MultiplicationStrategy implements Strategy {

    public int execute(int a, int b) {
        return a * b;
    }

}
