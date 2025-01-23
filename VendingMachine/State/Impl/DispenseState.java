package VendingMachine.State.Impl;

import java.util.List;

import VendingMachine.Coin;
import VendingMachine.Inventory;
import VendingMachine.ItemShelf;
import VendingMachine.VendingMachine;
import VendingMachine.State.State;

public class DispenseState extends State {

    public void dispenseItem(VendingMachine vendingMachine, String id) {
        Inventory inventory = vendingMachine.getInventory();

        ItemShelf itemShelf = inventory.getItemShelfById(id);
        itemShelf.setSoldOut(true);

        System.out.println("Dispensing " + itemShelf.getItem().getName());
        vendingMachine.setState(new IdleState());
    }

    public List<Coin> refundCoins(VendingMachine vendingMachine) {
        return vendingMachine.getCoins();
    }

    public void cancel(VendingMachine vendingMachine) {
        this.refundCoins(vendingMachine);
        vendingMachine.setState(new IdleState());
    }
}
