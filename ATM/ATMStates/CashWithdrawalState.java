package ATM.ATMStates;

import ATM.ATM;
import ATM.Card;
import ATM.AmountWithdrawal.*;

public class CashWithdrawalState extends ATMState {

    @Override
    public void withdraw(ATM atm, Card card, int amount) {
        if (atm.getAtmBalance() < amount) {
            System.out.println("Insufficient balance in ATM");
        } else if (amount > card.getBankAccount().getBalance()) {
            System.out.println("Insufficient balance in card");
        } else {
            atm.setAtmBalance(atm.getAtmBalance() - amount);
            card.getBankAccount().setBalance(card.getBankAccount().getBalance() - amount);

            CashProcessor cashProcessor = new OneThousandWithdrawProcessor(
                    new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            cashProcessor.withdraw(atm, amount);

            exit(atm);
        }
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
