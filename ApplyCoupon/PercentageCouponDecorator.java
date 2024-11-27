package ApplyCoupon;

public class PercentageCouponDecorator extends CouponDecorator {

    private double discountPercentage;
    private Product product;

    public PercentageCouponDecorator(Product product, double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        return product.getPrice() - (product.getPrice() * discountPercentage);
    }

}
