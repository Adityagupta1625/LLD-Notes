package VendingMachine.State.Impl;

import VendingMachine.VendingMachine;
import VendingMachine.State.State;

public class IdleState extends State {

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("Insert Coin");
        vendingMachine.setState(new HasMoneyState());
    }
}
