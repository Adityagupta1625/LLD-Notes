package VisitorPattern;

public class Main {

    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        singleRoom.accept(new RoomPriceVisitor());
        singleRoom.accept(new RoomMaintenanceVisitor());

        DoubleRoom doubleRoom = new DoubleRoom();
        doubleRoom.accept(new RoomPriceVisitor());
        doubleRoom.accept(new RoomMaintenanceVisitor());

        DeluxeRoom deluxeRoom = new DeluxeRoom();
        deluxeRoom.accept(new RoomPriceVisitor());
        deluxeRoom.accept(new RoomMaintenanceVisitor());

    }
}
