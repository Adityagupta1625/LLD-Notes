package ParkingLot.CostComputation;

import ParkingLot.VehicleType;
import ParkingLot.PricingStrategy.HourlyPricingStrategy;
import ParkingLot.PricingStrategy.MinutesPricingStrategy;

public class CostComputationFactory {

    public CostComputation geCostComputation(VehicleType vehicleType) {
        if (vehicleType == VehicleType.TWO_WHEELER) {
            return new TwoWheelerCostComputation(new MinutesPricingStrategy());
        } else if (vehicleType == VehicleType.FOUR_WHEELER) {
            return new ThreeWheelerCostComputation(new HourlyPricingStrategy());
        }
        return null;
    }
}
