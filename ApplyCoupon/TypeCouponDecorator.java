package ApplyCoupon;

import java.util.ArrayList;

public class TypeCouponDecorator extends CouponDecorator {

    private Product product;
    private ArrayList<ProductType> eligibleTypes;
    private double discountPercentage;

    public TypeCouponDecorator(Product product, double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.eligibleTypes = new ArrayList<ProductType>();
        this.eligibleTypes.add(ProductType.ELECTRONICS);
        this.eligibleTypes.add(ProductType.CLOTHES);
    }

    @Override
    public double getPrice() {

        if (eligibleTypes.contains(product.getProductType())) {
            return product.getPrice() - (product.getPrice() * discountPercentage);
        } else {
            return product.getPrice();
        }
    }
}
