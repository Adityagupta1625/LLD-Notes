package Uber.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Uber.DTO.DriverDAO;
import Uber.Models.Coordinates;
import Uber.Models.Driver;

public class DriverManager {

    private List<Driver> drivers;
    private Map<String, Integer> driverMap;

    public DriverManager() {
        this.drivers = new ArrayList<Driver>();
        this.driverMap = new HashMap<String, Integer>();
    }

    public void addDriver(DriverDAO driver) {
        Driver newDriver = new Driver();
        String driverId = java.util.UUID.randomUUID().toString();

        newDriver.setName(driver.getName());
        newDriver.setEmail(driver.getEmail());
        newDriver.setVehicleNo(driver.getVehicleNo());
        newDriver.setLicenseNo(driver.getLicenseNo());
        newDriver.setDriverId(driverId);

        drivers.add(newDriver);
        driverMap.put(driverId, drivers.size() - 1);
    }

    public Driver getDriver(String driverId) {
        int index = driverMap.get(driverId);
        return drivers.get(index);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDriverLocation(String driverId, Coordinates location) {
        int index = driverMap.get(driverId);
        Driver driver = drivers.get(index);
        driver.setLocation(location);
    }

    public void setUnavailability(String driverId) {
        int index = driverMap.get(driverId);
        Driver driver = drivers.get(index);
        driver.setIsAvailable(false);
    }

    public void setAvailability(String driverId) {
        int index = driverMap.get(driverId);
        Driver driver = drivers.get(index);
        driver.setIsAvailable(true);
    }

}
