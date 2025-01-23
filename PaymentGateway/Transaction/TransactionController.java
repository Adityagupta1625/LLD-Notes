package PaymentGateway.Transaction;

import java.util.List;

public class TransactionController {

    private TransactionService transactionService;

    public TransactionController() {
        this.transactionService = TransactionService.getInstance();
    }

    public void processPayment(TransactionDO transactionDO) {
        transactionService.processPayment(transactionDO);
    }

    public List<TransactionDO> getTransactions(String userId) {
        return transactionService.getTransactions(userId);
    }
}
