package InventorySystem;

public class Warehouse {

    private Address address;
    private Inventory inventory;

    public Warehouse(Address address, Inventory inventory) {
        this.address = address;
        this.inventory = inventory;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
