package ElevatorSystem;

public class ElevatorCar {

    private Direction direction;
    private int currentFloor;
    private Display display;
    private ElevatorState state;
    private InternalButton internalButton;
    private ElevatorDoor elevatorDoor;

    public ElevatorCar() {
        this.state = ElevatorState.IDLE;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public ElevatorState getState() {
        return state;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public ElevatorDoor getElevatorDoor() {
        return elevatorDoor;
    }

    public void addElevatorDoor(ElevatorDoor elevatorDoor) {
        this.elevatorDoor = elevatorDoor;
    }

    public void openDoor() {
        this.elevatorDoor.openDoor();
    }

    public void closeDoor() {
        this.elevatorDoor.closeDoor();
    }

    public void showDisplay() {
        this.display.printDisplay();
    }

    public boolean move(Direction direction, int destinationFloor) {

        int currentFloor = this.currentFloor;

        if (direction == Direction.UP) {
            for (int i = currentFloor; i <= destinationFloor; i++) {
                this.currentFloor = i;
                this.display.setFloor(i);
                this.display.setDirection(direction);
                this.showDisplay();
                if (i == destinationFloor) {
                    return true;
                }
            }
        } else if (direction == Direction.DOWN) {
            for (int i = currentFloor; i >= destinationFloor; i--) {
                this.currentFloor = i;
                this.display.setFloor(i);
                this.display.setDirection(direction);
                this.showDisplay();
                if (i == destinationFloor) {
                    return true;
                }
            }
        }

        return false;

    }

}
