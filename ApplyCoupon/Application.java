package ApplyCoupon;

public class Application {

    public static void main(String[] args) {
        Product item1 = new Item("Item 1", 100, ProductType.ELECTRONICS);

        Product item2 = new Item("Item 2", 200, ProductType.BOOKS);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);

        double total = cart.getTotal();
        System.out.println("Total: " + total);
    }

}
