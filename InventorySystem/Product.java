package InventorySystem;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String id;
    private String name;
    private List<ProductUnit> productUnits;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productUnits = new ArrayList<ProductUnit>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addProductUnit(ProductUnit productUnit, int count) {
        for (int i = 0; i < count; i++) {
            productUnits.add(productUnit);
        }
    }

    public List<ProductUnit> removeProductUnits(int count) {
        List<ProductUnit> productUnits = new ArrayList<ProductUnit>();
        for (int i = 0; i < count; i++) {
            productUnits.add(this.productUnits.remove(0));
        }
        return productUnits;
    }

    public int getNoOfProductUnits() {
        return productUnits.size();
    }
}
