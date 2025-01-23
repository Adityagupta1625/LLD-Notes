package VendingMachine.State.Impl;

import java.util.List;

import VendingMachine.Coin;
import VendingMachine.Inventory;
import VendingMachine.ItemShelf;
import VendingMachine.VendingMachine;
import VendingMachine.State.State;

public class SelectProductState extends State {

    public void selectItem(VendingMachine vendingMachine, String id) {

        System.out.println("Selected Item: " + id);

        Inventory inventory = vendingMachine.getInventory();

        ItemShelf itemShelf = inventory.getItemShelfById(id);

        if (itemShelf.isSoldOut() == true || itemShelf.getItem().getPrice() > vendingMachine.getBalance()) {

            System.out.println("Item is sold out");
            this.refundCoins(vendingMachine);
            vendingMachine.setState(new IdleState());
        } else {
            if (vendingMachine.getBalance() < itemShelf.getItem().getPrice()) {
                Integer change = itemShelf.getItem().getPrice() - vendingMachine.getBalance();
                this.returnChange(change);
            }
            vendingMachine.setState(new DispenseState());
        }
    }

    public List<Coin> refundCoins(VendingMachine vendingMachine) {
        return vendingMachine.getCoins();
    }

    public void cancel(VendingMachine vendingMachine) {
        this.refundCoins(vendingMachine);
        vendingMachine.setState(new IdleState());
    }

    public Integer returnChange(Integer returnValue) {
        System.out.println("Return Change: " + returnValue);
        return returnValue;
    }
}
