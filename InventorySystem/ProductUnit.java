package InventorySystem;

public class ProductUnit {

    private String id;
    private String expiryDate;
    private String serialNumber;

    public ProductUnit(String id, String expiryDate, String serialNumber) {
        this.id = id;
        this.expiryDate = expiryDate;
        this.serialNumber = serialNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
