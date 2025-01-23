package PaymentGateway.Instrument;

public class BankAccountInstrument extends Instrument {

    private String accountNumber;
    private String ifsc;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

}
