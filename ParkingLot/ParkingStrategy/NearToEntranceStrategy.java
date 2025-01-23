package ParkingLot.ParkingStrategy;

import java.util.List;

import ParkingLot.Vehicle;
import ParkingLot.ParkingSpot.ParkingSpot;

public class NearToEntranceStrategy extends ParkingStrategy {

    public NearToEntranceStrategy(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }

    public ParkingSpot find(Vehicle vehicle) {
        System.out.println("Finding Parking Spot");
        return null;
    }
}
