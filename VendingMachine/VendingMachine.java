package VendingMachine;

import java.util.ArrayList;
import java.util.List;

import VendingMachine.States.State;
import VendingMachine.States.impl.IdleState;

public class VendingMachine {

    private State state;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        this.state = new IdleState(this);
        this.inventory = new Inventory();
        this.coinList = new ArrayList<Coin>();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
