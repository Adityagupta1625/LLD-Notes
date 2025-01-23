package InventorySystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(main.generateWarehouse());

        List<User> users = new ArrayList<>();
        users.add(main.createUser());

    }

    public Warehouse generateWarehouse() {
        Product product1 = new Product("1", "Apple", 1000);

        product1.addProductUnit(new ProductUnit("1.1", "2022-10-10", "123"), 5);

        product1.addProductUnit(new ProductUnit("1.2", "2022-10-10", "124"), 3);

        Product product2 = new Product("2", "Acer", 900);

        product2.addProductUnit(new ProductUnit("2.1", "2022-10-10", "125"), 10);

        Product product3 = new Product("3", "Asus", 700);

        product3.addProductUnit(new ProductUnit("3.1", "2022-10-10", "126"), 7);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Inventory inventory = new Inventory(products);

        Address address = new Address("Jalandhar", "Punjab", "Guru Amar Dass Nagar", "144008", "29");

        Warehouse warehouse = new Warehouse(address, inventory);

        return warehouse;
    }

    public User createUser() {
        User user = new User("Aditya", "1", new Address("Jalandhar", "Punjab", "Guru Amar Dass Nagar", "144008", "29"));
        return user;
    }
}
