package InventorySystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {

    private List<Order> orders;
    private Map<String, List<Order>> orderMap;

    public OrderController() {
        orders = new ArrayList<>();
        orderMap = new HashMap<>();
    }

    public Order createNewOrder(User user, Warehouse warehouse, Map<Product, Integer> products) {
        Order order = new Order();

        order.generateOrder(products, user.getAddress(), warehouse);

        orders.add(order);

        if (orderMap.containsKey(user.getId())) {
            orderMap.get(user.getId()).add(order);
        } else {
            List<Order> orderList = new ArrayList<>();
            orderList.add(order);
            orderMap.put(user.getId(), orderList);
        }
        return order;
    }

    public void removeOrder(Order order) {
        orders.remove(order);

        for (Map.Entry<String, List<Order>> entry : orderMap.entrySet()) {
            entry.getValue().remove(order);
        }
    }

    public List<Order> getOrdersByUserId(String userId) {
        return orderMap.get(userId);
    }

    public Order getOrderByOrderId(String orderId) {
        for (Order order : orders) {
            if (order.getId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }
}
