package VendingMachine.State.Impl;

import java.util.List;

import VendingMachine.Coin;
import VendingMachine.VendingMachine;
import VendingMachine.State.State;

public class HasMoneyState extends State {

    public void insertCoin(VendingMachine vendingMachine, List<Coin> coins) {
        System.out.println("Coins Inserted: ");
        for (Coin coin : coins) {
            System.out.println("Value: " + coin.getValue());
        }
        vendingMachine.setCoins(coins);
        vendingMachine.setState(new SelectProductState());
    }

    public void cancel(VendingMachine vendingMachine) {
        vendingMachine.setState(new IdleState());
    }
}
