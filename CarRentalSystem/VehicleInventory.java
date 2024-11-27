package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {

    private List<Vehicle> vehicleList;

    public VehicleInventory() {
        this.vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void removeVehicle(String id) {
        this.vehicleList.removeIf(vehicle -> vehicle.getVehicleId() == Integer.parseInt(id));
    }
}
