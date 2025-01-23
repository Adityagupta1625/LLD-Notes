package ParkingLot.ParkingStrategy;

import java.util.List;

import ParkingLot.Vehicle;
import ParkingLot.ParkingSpot.ParkingSpot;

public class ParkingStrategy {

    private List<ParkingSpot> parkingSpotList;

    public ParkingStrategy(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot find(Vehicle vehicle) {
        System.out.println("Finding Parking Spot");
        return parkingSpotList.get(0);
    }
}
