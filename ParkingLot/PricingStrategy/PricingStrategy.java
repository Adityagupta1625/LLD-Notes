package ParkingLot.PricingStrategy;

import ParkingLot.Ticket;

public abstract class PricingStrategy {

    public abstract int price(Ticket ticket);
}
