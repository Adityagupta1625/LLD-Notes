package VendingMachine.States.impl;

import java.util.List;

import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingMachine;
import VendingMachine.States.State;

public class HasMoneyState implements State {

    private VendingMachine vendingMachine;

    public HasMoneyState() {
        System.out.println("Machine is in has money state");
    }

    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void clickOnInsertCoinButton() throws Exception {
        throw new Exception("Invalid operation");
    }

    @Override
    public void clickOnSelectItemButton() throws Exception {
        throw new Exception("Insert coin first");
    }

    @Override
    public void insertCoin(Coin coin) throws Exception {
        throw new Exception("Click on select item button first");
    }

    @Override
    public Item dispense() throws Exception {
        throw new Exception("Select item first");
    }

    @Override
    public void selectItem(int id) throws Exception {
        throw new Exception("Enter the item code first");
    }

    @Override
    public List<Coin> cancel() throws Exception {
        throw new Exception("Invalid operation");
    }

    @Override
    public List<Coin> getChange() throws Exception {
        throw new Exception("Not Applicable");
    }

    @Override
    public void updateInventory(int id, Item item) throws Exception {
        this.vendingMachine.getInventory().addItem(item, id);
    }
}
