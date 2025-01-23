package StrategyPattern;

public class context {

    private Strategy strategy;

    public context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return this.strategy.execute(a, b);
    }
}
