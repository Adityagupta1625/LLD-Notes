package ElevatorSystem;

import java.util.List;

public class ElevatorController {

    private List<ElevatorCar> elevatorCars;

    public void addElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCars.add(elevatorCar);
    }

    public List<ElevatorCar> getElevatorCars() {
        return elevatorCars;
    }

    public void removeElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCars.remove(elevatorCar);
    }

    public void submitInternalRequest(int floor) {

    }

    public void submitExternalRequest(int floor, Direction direction) {

    }

    public void moveElevator() {

    }
}
