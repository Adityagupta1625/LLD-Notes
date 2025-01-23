package DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new CurstDecorator(new ToppingDecorator(new CheesePizza()));

        System.out.println("Pizza Price: " + pizza.getPrice());

    }
}
