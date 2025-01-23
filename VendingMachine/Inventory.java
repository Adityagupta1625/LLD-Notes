package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<ItemShelf> items;

    public Inventory() {
        this.items = new ArrayList<ItemShelf>();
    }

    public void addItemShelf(ItemShelf itemShelf) {
        this.items.add(itemShelf);
    }

    public List<ItemShelf> getItems() {
        return items;
    }

    public ItemShelf getItemShelfById(String id) {
        for (ItemShelf itemShelf : items) {
            if (itemShelf.getShelfId().equals(id)) {
                return itemShelf;
            }
        }
        return null;
    }

    public void updateItemShelf(String id) {
        for (ItemShelf itemShelf : items) {
            if (itemShelf.getShelfId().equals(id) &&
                    itemShelf.isSoldOut() == true) {
                itemShelf.setSoldOut(false);
            }
        }
    }

}
