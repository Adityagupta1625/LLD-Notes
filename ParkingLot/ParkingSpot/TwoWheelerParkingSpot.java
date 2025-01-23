package ParkingLot.ParkingSpot;

import ParkingLot.Vehicle;

public class TwoWheelerParkingSpot extends ParkingSpot {

    public TwoWheelerParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, price);
    }

    @Override
    public int getPrice() {
        return 50;
    }

}
