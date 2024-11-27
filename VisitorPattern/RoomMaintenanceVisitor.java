package VisitorPattern;

public class RoomMaintenanceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom room) {
        System.out.println("Single Room maintenance");
    }

    @Override
    public void visit(DoubleRoom room) {
        System.out.println("Double Room maintenance");
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Deluxe Room maintenance");
    }
}
