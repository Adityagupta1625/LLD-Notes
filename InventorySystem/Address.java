package InventorySystem;

public class Address {

    private String city;
    private String state;
    private String street;
    private String addressLine;
    private String zip;

    public Address(String city, String state, String street, String zip, String addressLine) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.zip = zip;
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
