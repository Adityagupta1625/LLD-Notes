package ParkingLot.CostComputation;

import ParkingLot.Ticket;
import ParkingLot.PricingStrategy.PricingStrategy;

public class CostComputation {

    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public int price(Ticket ticket) {
        return pricingStrategy.price(ticket);
    }
}
