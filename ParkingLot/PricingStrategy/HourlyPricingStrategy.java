package ParkingLot.PricingStrategy;

import ParkingLot.Ticket;

public class HourlyPricingStrategy extends PricingStrategy {

    public int price(Ticket ticket) {
        long entryTime = ticket.getEntryTime();
        long currentTime = System.currentTimeMillis();
        long duration = currentTime - entryTime;
        int hours = (int) (duration / (1000 * 60 * 60));
        return hours * ticket.getParkingSpot().getPrice();
    }
}
