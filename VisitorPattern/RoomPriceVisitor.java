package VisitorPattern;

public class RoomPriceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom room) {
        room.price = 100;
        System.out.println("Single Room Price: " + room.price);
    }

    @Override
    public void visit(DoubleRoom room) {
        room.price = 200;
        System.out.println("Double Room Price: " + room.price);
    }

    @Override
    public void visit(DeluxeRoom room) {
        room.price = 300;
        System.out.println("Deluxe Room Price: " + room.price);
    }
}
