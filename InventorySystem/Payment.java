package InventorySystem;

public class Payment {

    private PaymentMode paymentMode;

    public Payment(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public boolean makePayment() {
        return paymentMode.makePayment();
    }
}
