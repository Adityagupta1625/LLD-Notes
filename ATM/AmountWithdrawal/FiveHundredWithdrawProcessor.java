package ATM.AmountWithdrawal;

import ATM.ATM;

public class FiveHundredWithdrawProcessor extends CashProcessor {

    public FiveHundredWithdrawProcessor(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int required = amount / 500;
        int balance = amount % 500;

        if (required > atm.getNoOfFiveHundredNotes()) {
            balance = balance + (required - atm.getNoOfFiveHundredNotes()) * 500;
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
        } else {
            atm.deductFiveHundredNotes(required);
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
