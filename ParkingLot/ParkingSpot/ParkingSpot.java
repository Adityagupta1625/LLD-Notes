package ParkingLot.ParkingSpot;

import ParkingLot.Vehicle;

public class ParkingSpot {

    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private int price;

    public ParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

}
