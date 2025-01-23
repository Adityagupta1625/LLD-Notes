package ATM;

public class Card {

    private String cardNumber;
    private String cardPin;
    private String cvv;
    private BankAccount bankAccount;
    private String expiryDate;

    public Card(String cardNumber, String cardPin, String cvv, BankAccount bankAccount, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.cvv = cvv;
        this.bankAccount = bankAccount;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

}
