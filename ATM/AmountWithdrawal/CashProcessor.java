package ATM.AmountWithdrawal;

import ATM.ATM;

public abstract class CashProcessor {

    CashProcessor nextCashProcessor;

    public CashProcessor(CashProcessor nextCashProcessor) {
        this.nextCashProcessor = nextCashProcessor;
    }

    public void withdraw(ATM atm, int amount) {
        if (nextCashProcessor != null) {
            nextCashProcessor.withdraw(atm, amount);
        }
    }
}
