package ElevatorSystem;

public class Floor {

    private ExternalButtonDispatcher externalButtonDispatcher;
    private int floorId;

    public Floor(ExternalButtonDispatcher externalButtonDispatcher, int floorId) {
        this.externalButtonDispatcher = externalButtonDispatcher;
        this.floorId = floorId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public void setExternalButtonDispatcher(ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public ExternalButtonDispatcher getExternalButtonDispatcher() {
        return externalButtonDispatcher;
    }

    public void pressExternalButton(int floor, Direction direction) {
        this.externalButtonDispatcher.submitRequest(floor, direction);
    }
}
