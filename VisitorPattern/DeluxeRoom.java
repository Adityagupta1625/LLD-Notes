package VisitorPattern;

public class DeluxeRoom implements RoomElement {

    int price = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }

}
