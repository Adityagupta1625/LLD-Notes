package ElevatorSystem;

import java.util.List;

public class InternalButtonDispatcher {

    private List<ElevatorController> elevatorControllers;

    public void addElevatorController(ElevatorController elevatorController) {
        this.elevatorControllers.add(elevatorController);
    }

    public void submitRequest(int floor, int elevatorId) {
        for (int i = 0; i < this.elevatorControllers.size(); i++) {
            this.elevatorControllers.get(i).submitInternalRequest(floor);
        }
    }

}
