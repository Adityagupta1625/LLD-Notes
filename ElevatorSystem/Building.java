package ElevatorSystem;

import java.util.List;

public class Building {

    List<Floor> floors;

    public Building(List<Floor> floors) {
        this.floors = floors;
    }

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void removeFloor(Floor floor) {
        this.floors.remove(floor);
    }
}
