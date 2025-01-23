package InventorySystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Integer, Integer> products;

    public Cart() {
        this.products = new HashMap<>();
    }

    public void addItemToCart(int productId, int count) {
        if (products.containsKey(productId)) {
            products.put(productId, products.get(productId) + count);
        } else {
            products.put(productId, count);
        }
    }

    public void emptyCart() {
        this.products = new HashMap<>();
    }

    public void removeItemFromCart(int productId, int count) {
        int noOfItems = products.get(productId);

        if (noOfItems > count) {
            products.put(productId, noOfItems - count);
        } else {
            products.remove(productId);
        }
    }

    public Map<Integer, Integer> getProducts() {
        return products;
    }
}
