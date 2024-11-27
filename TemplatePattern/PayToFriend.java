package TemplatePattern;

public class PayToFriend extends PaymentFlow {

    @Override
    public void calculateFee() {
        System.out.println("0% fee charged");

    }

    @Override
    public void debitAmount() {
        System.out.println("Debiting amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("Crediting amount");
    }

    @Override
    public void validateRequest() {
        System.out.println("Validating request");
    }
}
