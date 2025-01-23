package ATM.AmountWithdrawal;

import ATM.ATM;

public class OneThousandWithdrawProcessor extends CashProcessor {

    public OneThousandWithdrawProcessor(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int required = amount / 1000;
        int balance = amount % 1000;

        if (required > atm.getNoOfThousandNotes()) {
            balance = balance + (required - atm.getNoOfThousandNotes()) * 1000;
            atm.deductOneThousandNotes(atm.getNoOfThousandNotes());
        } else {
            atm.deductOneThousandNotes(required);
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
