package ParkingLot;

import ParkingLot.CostComputation.CostComputation;
import ParkingLot.CostComputation.CostComputationFactory;

public class ExitGate {

    private CostComputation costComputation;
    private CostComputationFactory costComputationFactory;
    private Payment payment;

    public ExitGate(Payment payment) {
        this.payment = payment;
    }

    public void exitSpot(Ticket ticket) {
        ticket.getParkingSpot().removeVehicle();
    }

    public void setCostComputation(VehicleType vehicleType) {
        this.costComputation = this.costComputationFactory.geCostComputation(vehicleType);
    }

    public int getParkingCost(Ticket ticket) {
        return this.costComputation.price(ticket);
    }

    public void performPayment(Ticket ticket) {
        this.payment.processPayment();
    }

}
