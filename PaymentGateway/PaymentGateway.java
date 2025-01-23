package PaymentGateway;

import java.util.List;

import PaymentGateway.Instrument.InstrumentController;
import PaymentGateway.Instrument.InstrumentDO;
import PaymentGateway.Instrument.InstrumentType;
import PaymentGateway.Transaction.TransactionController;
import PaymentGateway.Transaction.TransactionDO;
import PaymentGateway.User.UserController;
import PaymentGateway.User.UserDO;

public class PaymentGateway {

    public static void main(String[] args) {
        UserDO user1 = new UserDO();
        UserDO user2 = new UserDO();

        user1.setName("Aditya");
        user1.setUserId("1");
        user1.setEmail("2CtHs@example.com");

        user2.setName("Rahul");
        user2.setUserId("2");
        user2.setEmail("Y1NQs@example.com");

        UserController userController = new UserController();
        userController.addUser(user1);
        userController.addUser(user2);

        InstrumentDO instrument1 = new InstrumentDO();
        InstrumentDO instrument2 = new InstrumentDO();

        instrument1.setInstrumentId("1");
        instrument1.setUserId("1");
        instrument1.setInstrumentType(InstrumentType.CARD);
        instrument1.setCardNumber("1234-1234-1234-1234");
        instrument1.setExpiryDate("01/2022");
        instrument1.setCvv("123");

        instrument2.setInstrumentId("2");
        instrument2.setUserId("2");
        instrument2.setInstrumentType(InstrumentType.BANK_ACCOUNT);
        instrument2.setAccountNumber("1234-1234-1234-1234");
        instrument2.setIfsc("1234-1234-1234-1234");

        InstrumentController instrumentController = new InstrumentController();
        instrumentController.addInstrument(instrument1);
        instrumentController.addInstrument(instrument2);

        List<InstrumentDO> instruments = instrumentController.getInstrumentsByUserId("1");

        for (InstrumentDO instrument : instruments) {
            System.out.println("Instrument Id: " + instrument.getInstrumentId() + " " + "Instrument Type: "
                    + instrument.getInstrumentType().toString());
        }

        instruments = instrumentController.getInstrumentsByUserId("2");

        for (InstrumentDO instrument : instruments) {
            System.out.println("Instrument Id: " + instrument.getInstrumentId() + " " + "Instrument Type: "
                    + instrument.getInstrumentType().toString());
        }

        TransactionDO transactionDo = new TransactionDO();
        transactionDo.setSenderUserId("1");
        transactionDo.setReceiverUserId("2");
        transactionDo.setAmount(100);
        transactionDo.setDebitInstrumentId("1");
        transactionDo.setCreditInstrumentId("2");

        TransactionController transactionController = new TransactionController();

        transactionController.processPayment(transactionDo);

        List<TransactionDO> transactions = transactionController.getTransactions("1");

        for (TransactionDO transaction : transactions) {
            System.out.println("Amount: " + transaction.getAmount() + " " + "Receiver User Id: "
                    + transaction.getReceiverUserId() + " " + "Sender User Id: " + transaction.getSenderUserId());
        }

    }
}
