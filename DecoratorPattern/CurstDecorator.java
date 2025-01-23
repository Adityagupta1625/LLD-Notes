package DecoratorPattern;

public class CurstDecorator extends PizzaDecorator {

    private final Pizza pizza;

    public CurstDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getPrice() {
        return pizza.getPrice() + 100;
    }
}
