package PaymentGateway.Transaction;

public class TransactionDO {
    private String senderUserId;
    private String receiverUserId;
    private int amount;
    private String debitInstrumentId;
    private String creditInstrumentId;

    public String getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(String senderUserId) {
        this.senderUserId = senderUserId;
    }

    public String getReceiverUserId() {
        return receiverUserId;
    }

    public void setReceiverUserId(String receiverUserId) {
        this.receiverUserId = receiverUserId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDebitInstrumentId() {
        return debitInstrumentId;
    }

    public void setDebitInstrumentId(String debitInstrumentId) {
        this.debitInstrumentId = debitInstrumentId;
    }

    public String getCreditInstrumentId() {
        return creditInstrumentId;
    }

    public void setCreditInstrumentId(String creditInstrumentId) {
        this.creditInstrumentId = creditInstrumentId;
    }
}
