package ElevatorSystem;

public class Display {
    private int floor;
    private Direction direction;

    public Display(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void printDisplay() {
        System.out.println("Floor: " + this.floor + " Direction: " + this.direction);
    }
}
