package ParkingLot.PricingStrategy;

import ParkingLot.Ticket;

public class MinutesPricingStrategy extends PricingStrategy {

    @Override
    public int price(Ticket ticket) {
        long entryTime = ticket.getEntryTime();
        long currentTime = System.currentTimeMillis();
        long duration = currentTime - entryTime;
        int minutes = (int) (duration / (1000 * 60));
        return minutes * ticket.getParkingSpot().getPrice();
    }
}
