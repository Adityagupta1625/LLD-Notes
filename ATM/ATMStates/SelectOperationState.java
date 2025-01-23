package ATM.ATMStates;

import ATM.ATM;
import ATM.Card;
import ATM.TransactionType;

public class SelectOperationState extends ATMState {

    @Override
    public void SelectOperation(ATM atm, Card card, TransactionType transactionType) {
        if (transactionType == TransactionType.CHECK_BALANCE) {
            atm.setState(new CheckBalanceState());
        } else if (transactionType == TransactionType.WITHDRAW) {
            atm.setState(new CashWithdrawalState());
        } else {
            System.out.println("Something went wrong");
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
