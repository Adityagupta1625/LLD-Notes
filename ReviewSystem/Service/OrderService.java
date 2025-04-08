package ReviewSystem.Service;

import java.util.HashMap;
import java.util.Map;

import ReviewSystem.DAO.OrderDAO;
import ReviewSystem.Model.Order;
import ReviewSystem.Model.OrderStatus;

public class OrderService {

    private Map<Integer, Order> orderMap;

    public OrderService() {
        this.orderMap = new HashMap<Integer, Order>();
    }

    public void addOrder(OrderDAO orderDAO) {
        Order order = new Order();
        order.setOrderId(orderDAO.getOrderId());
        order.setUserId(orderDAO.getUserId());
        order.setProductId(orderDAO.getProductId());
        order.setQuantity(orderDAO.getQuantity());
        order.setTotalPrice(orderDAO.getTotalPrice());
        order.setOrderStatus(orderDAO.getOrderStatus());
        orderMap.put(order.getOrderId(), order);
    }

    public Order getOrder(int orderId) {
        return orderMap.get(orderId);
    }

    public Boolean canReview(int orderId) {
        Order order = orderMap.get(orderId);
        return order.getOrderStatus() == OrderStatus.DELIVERED;
    }
}
