package TemplatePattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();

    public abstract void creditAmount();

    public abstract void debitAmount();

    public abstract void calculateFee();

    public final void payMoney() {

        validateRequest();

        debitAmount();

        calculateFee();

        creditAmount();
    }

}
