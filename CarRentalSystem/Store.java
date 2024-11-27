package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private int storeId;
    private String storeName;
    private String storeLocation;
    private VehicleInventory vehicleInventory;
    private List<Reservation> reservationList;

    public Store() {
        this.reservationList = new ArrayList<Reservation>();
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void addReservation(Reservation reservation) {
        this.reservationList.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        this.reservationList.remove(reservation);
    }

    public void updateReservation(Reservation reservation) {
        this.reservationList.set(reservationList.indexOf(reservation), reservation);
    }
}
