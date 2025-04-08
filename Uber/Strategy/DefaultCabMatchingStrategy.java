package Uber.Strategy;

import java.util.List;

import Uber.Models.Coordinates;
import Uber.Models.Driver;
import Uber.Models.User;

public class DefaultCabMatchingStrategy implements DriverMatchingStrategy {

    @Override
    public Driver findDriverToUser(List<Driver> drivers, Coordinates source, Coordinates destination, User user) {
        double minDistance = Double.MAX_VALUE;
        Driver nearestDriver = null;

        for (Driver driver : drivers) {
            if (driver.getIsAvailable()) {
                double distance = Math.sqrt(Math.pow(driver.getLocation().getX() - source.getX(), 2)
                        + Math.pow(driver.getLocation().getY() - source.getY(), 2));

                if (distance < minDistance) {
                    minDistance = distance;
                    nearestDriver = driver;
                }
            }
        }

        return nearestDriver;
    }
}
