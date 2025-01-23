package ParkingLot;

import ParkingLot.ParkingManager.ParkingManager;
import ParkingLot.ParkingManager.ThreeWheelerParkingManager;
import ParkingLot.ParkingManager.TwoWheelerParkingManager;
import ParkingLot.ParkingStrategy.NearToEntranceStrategy;

public class ParkingManagerFactory {

    public ParkingManager getParkingManager(VehicleType vehicleType) {
        if (vehicleType == VehicleType.TWO_WHEELER) {
            return new TwoWheelerParkingManager(new NearToEntranceStrategy(null));
        } else if (vehicleType == VehicleType.FOUR_WHEELER) {
            return new ThreeWheelerParkingManager(new NearToEntranceStrategy(null));
        }
        return null;
    }
}
