package ElevatorSystem;

public class ExternalButton {

    private ExternalButtonDispatcher dispatcher;

    public ExternalButton(ExternalButtonDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void pressButton(int floor, Direction direction) {
        dispatcher.submitRequest(floor, direction);
    }
}
