package ATM.ATMStates;

import ATM.Card;
import ATM.ATM;

public class HasCardState extends ATMState {

    @Override
    public void authenticatePin(ATM atm, Card card, String pin) {
        if (!card.getCardPin().equals(pin)) {
            System.out.println("Pin incorrect");
            exit(atm);
            return;
        }

        System.out.println("Pin authenticated");
        atm.setState(new SelectOperationState());
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        System.out.println("Return to Idle State");
        atm.setState(new IdleState());
    }

    @Override
    public void returnCard() {
        System.out.println("Card removed");
    }
}
