package ElevatorSystem;

import java.util.List;

public class ExternalButtonDispatcher {
    private List<ElevatorController> elevatorControllers;

    public void addElevatorController(ElevatorController elevatorController) {
        this.elevatorControllers.add(elevatorController);
    }

    public List<ElevatorController> getElevatorControllers() {
        return elevatorControllers;
    }

    public void removeElevatorController(ElevatorController elevatorController) {
        this.elevatorControllers.remove(elevatorController);
    }

    public void submitRequest(int floor, Direction direction) {
        for (int i = 0; i < this.elevatorControllers.size(); i++) {
            this.elevatorControllers.get(i).submitExternalRequest(floor, direction);
        }
    }
}
