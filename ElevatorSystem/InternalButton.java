package ElevatorSystem;

public class InternalButton {
    private InternalButtonDispatcher dispatcher;

    public InternalButton(InternalButtonDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void pressButton(int floor, int elevatorId) {
        dispatcher.submitRequest(floor, elevatorId);
    }

}
