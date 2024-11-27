package ApplyCoupon;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<Product>();
    }

    public void addItem(Product product) {

        Product productWithDiscount = new PercentageCouponDecorator(new TypeCouponDecorator(product, 0.1), 0.1);

        System.out.println(productWithDiscount.getName() + " " + productWithDiscount.getPrice());

        items.add(productWithDiscount);
    }

    public double getTotal() {
        double total = 0;

        for (Product product : items) {
            total += product.getPrice();
        }

        return total;
    }
}
