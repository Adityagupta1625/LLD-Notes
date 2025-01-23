package VendingMachine.State;

import java.util.List;

import VendingMachine.Coin;
import VendingMachine.VendingMachine;

public abstract class State {

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        System.out.println("Method not implemented");
    }

    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins) {
        System.out.println("Method not implemented");
    }

    public void selectItem(VendingMachine vendingMachine, String id) {
        System.out.println("Method not implemented");
    }

    public List<Coin> refundCoins(VendingMachine vendingMachine) {
        System.out.println("Method not implemented");
        return null;
    }

    public Integer returnChange(VendingMachine vendingMachine) {
        System.out.println("Method not implemented");
        return 0;
    }

    public void cancel(VendingMachine vendingMachine) {
        System.out.println("Method not implemented");
    }

    public void dispenseItem(VendingMachine vendingMachine, String id) {
        System.out.println("Method not implemented");
    }
}
