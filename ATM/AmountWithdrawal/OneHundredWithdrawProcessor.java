package ATM.AmountWithdrawal;

import ATM.ATM;

public class OneHundredWithdrawProcessor extends CashProcessor {

    public OneHundredWithdrawProcessor(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    public void withdraw(ATM atm, int amount) {
        int required = amount / 100;
        int balance = amount % 100;

        if (required > atm.getNoOfHundredNotes()) {
            balance = balance + (required - atm.getNoOfHundredNotes()) * 100;
            atm.deductOneHundredNotes(atm.getNoOfHundredNotes());
        } else {
            atm.deductOneHundredNotes(required);
        }

        if (balance != 0) {
            System.out.println("Something went wrong");
        }
    }
}
