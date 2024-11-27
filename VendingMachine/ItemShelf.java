package VendingMachine;

public class ItemShelf {

    private Item item;
    private int id;
    private boolean soldOut;

    public ItemShelf(int id, Item item) {
        this.id = id;
        this.item = item;
        this.soldOut = false;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
