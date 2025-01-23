package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private Inventory inventory;

    private Inventory generateInventory() {
        inventory = new Inventory();

        inventory.addItemShelf(new ItemShelf(new Item("COKE", 10), "A1", false));
        inventory.addItemShelf(new ItemShelf(new Item("PEPSI", 10), "A2", false));
        inventory.addItemShelf(new ItemShelf(new Item("SPRITE", 10), "A3", false));
        inventory.addItemShelf(new ItemShelf(new Item("FANTA", 10), "A4", false));

        return inventory;
    }

    public static void main(String[] args) {
        Main main = new Main();

        Inventory inventory = main.generateInventory();
        VendingMachine vendingMachine = new VendingMachine(inventory);

        vendingMachine.getState().clickOnInsertCoinButton(vendingMachine);

        List<Coin> coins = new ArrayList<Coin>();
        coins.add(new Coin(10));

        vendingMachine.getState().insertCoin(vendingMachine, coins);

        vendingMachine.getState().selectItem(vendingMachine, "A1");

        vendingMachine.getState().dispenseItem(vendingMachine, "A1");

    }
}
