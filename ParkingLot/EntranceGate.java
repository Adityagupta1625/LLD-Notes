package ParkingLot;

import ParkingLot.ParkingManager.ParkingManager;
import ParkingLot.ParkingSpot.ParkingSpot;

public class EntranceGate {

    private ParkingManager parkingManager;
    private ParkingManagerFactory parkingManagerFactory;

    public ParkingManager getParkingManager() {
        return parkingManager;
    }

    public void setParkingManager(VehicleType vehicleType) {
        this.parkingManager = this.parkingManagerFactory.getParkingManager(vehicleType);
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        return this.parkingManager.getParkingSpot(vehicle);
    }

    public Ticket bookSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        parkingSpot.parkVehicle(vehicle);
        return new Ticket(System.currentTimeMillis(), vehicle, parkingSpot, "1234");
    }
}
