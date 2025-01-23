package ATM;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.intializeATM();
        atmRoom.createUser();

        atmRoom.atm.getCurrentStatus();
        atmRoom.atm.getState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), "1234");
        atmRoom.atm.getState().SelectOperation(atmRoom.atm, atmRoom.user.getCard(), TransactionType.WITHDRAW);
        atmRoom.atm.getState().withdraw(atmRoom.atm, atmRoom.user.getCard(), 7700);
        atmRoom.atm.getCurrentStatus();
    }

    private void intializeATM() {
        atm = new ATM();
        atm.setAtmBalance(16000, 10, 10, 10);
    }

    private void createUser() {
        Card card = createCard();
        user = new User("John Doe", card);
    }

    private Card createCard() {
        BankAccount bankAccount = createBankAccount(10000);
        return new Card("12345678", "1234", "786", bankAccount, "12/24");
    }

    private BankAccount createBankAccount(int balance) {
        return new BankAccount("123456789", balance);
    }
}
