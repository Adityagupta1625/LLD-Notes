package Uber.Strategy;

import java.util.List;

import Uber.Models.Coordinates;
import Uber.Models.Driver;
import Uber.Models.User;

public interface DriverMatchingStrategy {

    Driver findDriverToUser(List<Driver> drivers, Coordinates source, Coordinates destination, User user);
}
