package InventorySystem;

import java.util.Date;
import java.util.Map;

public class Order {

    private Invoice invoice;
    private Payment payment;
    private Map<Product, Integer> products;
    private String id;
    private Address deliveryAddress;
    private Warehouse warehouse;
    private OrderStatus status;

    public void updateOrderStatus(OrderStatus orderStatus) {
        this.status = orderStatus;
    }

    public String getId() {
        return id;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void generateOrder(Map<Product, Integer> products, Address deliveryAddress, Warehouse warehouse) {
        this.products = products;
        this.deliveryAddress = deliveryAddress;
        this.warehouse = warehouse;
        this.status = OrderStatus.PLACED;
        this.id = "123";
    }

    public int getTotalAmount() {
        int price = 0;

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            price += entry.getKey().getPrice() * entry.getValue();
        }

        return price;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void generateInvoice(User user) {
        this.invoice = new Invoice(user, "123", new Date(), this.getTotalAmount());
    }

    public boolean makePayment(PaymentMode paymentMode) {
        this.payment = new Payment(paymentMode);
        return this.payment.makePayment();
    }

}
