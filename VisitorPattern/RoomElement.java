package VisitorPattern;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
