package ParkingLot;

import ParkingLot.ParkingSpot.ParkingSpot;

public class Ticket {
    private Long entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private String id;

    public Ticket(Long entryTime, Vehicle vehicle, ParkingSpot parkingSpot, String id) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.id = id;
    }

    public Long getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public String getId() {
        return id;
    }
}
