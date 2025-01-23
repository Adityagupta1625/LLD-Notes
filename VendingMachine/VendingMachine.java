package VendingMachine;

import java.util.List;

import VendingMachine.State.State;
import VendingMachine.State.Impl.IdleState;

public class VendingMachine {

    private Inventory inventory;
    private State state;
    private List<Coin> coins;

    public VendingMachine(Inventory inventory) {
        this.inventory = inventory;
        this.state = new IdleState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Integer getBalance() {
        Integer balance = 0;
        for (Coin coin : coins) {
            balance += coin.getValue();
        }
        return balance;
    }
}
