package Uber;

import Uber.DTO.BookingDAO;
import Uber.DTO.DriverDAO;
import Uber.DTO.UserDAO;
import Uber.Models.Coordinates;
import Uber.Service.BookingManager;
import Uber.Service.DriverManager;
import Uber.Service.UserManager;
import Uber.Strategy.DefaultCabMatchingStrategy;
import Uber.Strategy.DefaultPricingStrategy;

public class App {

    private static void createUsers(UserManager userManager) {
        UserDAO user1DAO = new UserDAO("Aditya", "guptaaditya2512@gmail.com");

        UserDAO user2DAO = new UserDAO("Rahul", "rahul2512@gmail.com");

        userManager.addUser(user1DAO);
        userManager.addUser(user2DAO);
    }

    private static void createDrivers(DriverManager driverManager) {
        DriverDAO driver1DAO = new DriverDAO("Aditya", "aditya2512@gmail.com", "MH 12 AB 1234", "MH123456");

        DriverDAO driver2DAO = new DriverDAO("Rahul", "rahul2512@gmail.com", "MH 12 AB 1234", "MH123456");

        driverManager.addDriver(driver1DAO);
        driverManager.addDriver(driver2DAO);

        driverManager.getDrivers().forEach(driver -> {
            driver.setLocation(new Coordinates(35, 15));
        });
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        createUsers(userManager);

        DriverManager driverManager = new DriverManager();
        createDrivers(driverManager);

        BookingManager bookingManager = new BookingManager();
        bookingManager.setDriverManager(driverManager);
        bookingManager.setDriverMatchingStrategy(new DefaultCabMatchingStrategy());
        bookingManager.setPricingStrategy(new DefaultPricingStrategy());

        Coordinates source = new Coordinates(35, 56);
        Coordinates destination = new Coordinates(45, 56);

        BookingDAO book1 = new BookingDAO(source, destination, userManager.getUserByEmail("guptaaditya2512@gmail.com"));

        bookingManager.createBooking(book1);

        bookingManager.getBookings().forEach(bookings -> {
            System.out.println(bookings.getBookingId());
        });
    }
}
