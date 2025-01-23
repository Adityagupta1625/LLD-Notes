package InventorySystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;
    private List<Order> orders;
    private Cart cart;
    private Address address;

    public User(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.orders = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
