package ATM.ATMStates;

import ATM.ATM;
import ATM.Card;
import ATM.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, String pin) {
        System.out.println("Something went wrong");
    }

    public void returnCard() {
        System.out.println("Something went wrong");
    }

    public void SelectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("Something went wrong");
    }

    public void withdraw(ATM atm, Card card, int amount) {
        System.out.println("Something went wrong");
    }

    public void checkBalance(ATM atm, Card card) {
        System.out.println("Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("Something went wrong");
    }

}
