package ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Floor> floors = new ArrayList<Floor>();

        Floor floor1 = new Floor(new ExternalButtonDispatcher(), 1);
        Floor floor2 = new Floor(new ExternalButtonDispatcher(), 2);
        Floor floor3 = new Floor(new ExternalButtonDispatcher(), 3);
        Floor floor4 = new Floor(new ExternalButtonDispatcher(), 4);
        Floor floor5 = new Floor(new ExternalButtonDispatcher(), 5);
        Floor floor6 = new Floor(new ExternalButtonDispatcher(), 6);
        Floor floor7 = new Floor(new ExternalButtonDispatcher(), 7);
        Floor floor8 = new Floor(new ExternalButtonDispatcher(), 8);
        Floor floor9 = new Floor(new ExternalButtonDispatcher(), 9);
        Floor floor10 = new Floor(new ExternalButtonDispatcher(), 10);

        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        floors.add(floor4);
        floors.add(floor5);
        floors.add(floor6);
        floors.add(floor7);
        floors.add(floor8);
        floors.add(floor9);
        floors.add(floor10);

        Building building = new Building(floors);
        System.out.println(building.getFloors());
    }
}
