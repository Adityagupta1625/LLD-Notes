package PaymentGateway.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TransactionService {

    private static Map<String, List<Transaction>> transactionVsUsers = new HashMap<String, List<Transaction>>();;
    private Processor processor;
    private static TransactionService instance = null;

    public static TransactionService getInstance() {
        if (instance == null) {
            instance = new TransactionService();
        }
        return instance;
    }

    public TransactionService() {
        this.processor = new Processor();
    }

    public void processPayment(TransactionDO transactionDO) {
        processor.processPayment(transactionDO);

        Transaction transaction = new Transaction();
        transaction.setTransactionId(new Random().nextInt() + "");
        transaction.setAmount(transactionDO.getAmount());
        transaction.setSenderUserId(transactionDO.getSenderUserId());
        transaction.setReceiverUserId(transactionDO.getReceiverUserId());
        transaction.setDebitInstrumentId(transactionDO.getDebitInstrumentId());
        transaction.setCreditInstrumentId(transactionDO.getCreditInstrumentId());
        transaction.setStatus(TransactionStatus.SUCCESS);

        List<Transaction> senderTxnList = transactionVsUsers.get(transactionDO.getSenderUserId());
        if (senderTxnList == null) {
            senderTxnList = new ArrayList<Transaction>();
        }
        senderTxnList.add(transaction);
        transactionVsUsers.put(transactionDO.getSenderUserId(), senderTxnList);

        List<Transaction> receiverTxnList = transactionVsUsers.get(transactionDO.getReceiverUserId());
        if (receiverTxnList == null) {
            receiverTxnList = new ArrayList<Transaction>();
        }
        receiverTxnList.add(transaction);
        transactionVsUsers.put(transactionDO.getReceiverUserId(), receiverTxnList);
    }

    private TransactionDO convertToTransactionDO(Transaction transaction) {
        TransactionDO transactionDO = new TransactionDO();
        transactionDO.setSenderUserId(transaction.getSenderUserId());
        transactionDO.setReceiverUserId(transaction.getReceiverUserId());
        transactionDO.setAmount(transaction.getAmount());
        transactionDO.setDebitInstrumentId(transaction.getDebitInstrumentId());
        transactionDO.setCreditInstrumentId(transaction.getCreditInstrumentId());
        return transactionDO;
    }

    public List<TransactionDO> getTransactions(String userId) {
        List<Transaction> transactions = transactionVsUsers.get(userId);
        List<TransactionDO> transactionDOs = new ArrayList<TransactionDO>();
        for (Transaction transaction : transactions) {
            transactionDOs.add(convertToTransactionDO(transaction));
        }
        return transactionDOs;
    }
}
