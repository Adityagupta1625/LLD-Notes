package VendingMachine;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<ItemShelf> itemShelf;

    public Inventory() {
        this.itemShelf = new ArrayList<ItemShelf>();
    }

    public Item getItem(int id) throws Exception {
        ItemShelf item = this.itemShelf.get(id);

        if (item.isSoldOut()) {
            throw new Exception("Item is sold out");
        }

        return item.getItem();
    }

    public void addItem(Item item, int id) throws Exception {
        for (ItemShelf itemShelf : this.itemShelf) {
            if (itemShelf.getId() == id) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setSoldOut(false);
                    itemShelf.setItem(item);
                } else {
                    throw new Exception("Item already exists");
                }
            }
        }
    }

    public void setSoldOut(int id) {
        this.itemShelf.get(id).setSoldOut(true);
    }

}
