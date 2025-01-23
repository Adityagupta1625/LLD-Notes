package ATM.ATMStates;

import ATM.ATM;
import ATM.Card;

public class CheckBalanceState extends ATMState {

    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Balance: " + card.getBankAccount().getBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        System.out.println("Card removed");
        atm.setState(new IdleState());
    }

    @Override
    public void returnCard() {
        System.out.println("Card removed");
    }
}
