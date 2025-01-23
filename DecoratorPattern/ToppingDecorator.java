package DecoratorPattern;

public class ToppingDecorator extends PizzaDecorator {

    private final Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getPrice() {
        return pizza.getPrice() + 50;
    }
}
