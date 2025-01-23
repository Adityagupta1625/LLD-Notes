package VendingMachine;

public class ItemShelf {

    private Item item;
    private String shelfId;
    private boolean soldOut;

    public ItemShelf(Item item, String shelfId, boolean soldOut) {
        this.item = item;
        this.shelfId = shelfId;
        this.soldOut = soldOut;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
