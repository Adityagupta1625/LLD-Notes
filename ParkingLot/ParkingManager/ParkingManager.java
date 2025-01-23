package ParkingLot.ParkingManager;

import java.util.ArrayList;
import java.util.List;

import ParkingLot.Vehicle;
import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.ParkingStrategy.ParkingStrategy;

public class ParkingManager {

    private List<ParkingSpot> parkingSpotList;
    private ParkingStrategy parkingStrategy;

    public ParkingManager(ParkingStrategy parkingStrategy) {
        this.parkingSpotList = new ArrayList<ParkingSpot>();
        this.parkingStrategy = parkingStrategy;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.add(parkingSpot);
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.remove(parkingSpot);
    }

    public ParkingSpot getParkingSpot(Vehicle vehicle) {
        return this.parkingStrategy.find(vehicle);
    }

}
