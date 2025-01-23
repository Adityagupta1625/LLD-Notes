package ParkingLot.ParkingSpot;

import ParkingLot.Vehicle;

public class ThreeWheelerParkingSpot extends ParkingSpot {

    public ThreeWheelerParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, price);
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
