package Uber.Service;

import java.util.ArrayList;
import java.util.List;

import Uber.DTO.BookingDAO;
import Uber.Models.BookingStatus;
import Uber.Models.Bookings;
import Uber.Models.Driver;
import Uber.Strategy.DriverMatchingStrategy;
import Uber.Strategy.PricingStrategy;

public class BookingManager {

    private List<Bookings> bookingsList;
    private PricingStrategy pricingStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;
    private DriverManager driverManager;

    public BookingManager() {
        this.bookingsList = new ArrayList<Bookings>();
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void setDriverMatchingStrategy(DriverMatchingStrategy driverMatchingStrategy) {
        this.driverMatchingStrategy = driverMatchingStrategy;
    }

    public void setDriverManager(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public void createBooking(BookingDAO bookingDAO) {
        Bookings booking = new Bookings();
        String bookingId = java.util.UUID.randomUUID().toString();

        booking.setBookingId(bookingId);
        booking.setSource(bookingDAO.getSource());
        booking.setDestination(bookingDAO.getDestination());
        booking.setUserId(bookingDAO.getUser().getUserId());
        booking.setBookingStatus(BookingStatus.CONFIRMED);

        List<Driver> drivers = driverManager.getDrivers();
        Driver driver = driverMatchingStrategy.findDriverToUser(drivers, bookingDAO.getSource(),
                bookingDAO.getDestination(), bookingDAO.getUser());
        booking.setDriverId(driver.getDriverId());

        double fare = pricingStrategy.calculatePrice(bookingDAO.getSource(), bookingDAO.getDestination());
        booking.setFare(fare);

        bookingsList.add(booking);
    }

    public void endTrip(String driverId) {
        for (Bookings booking : bookingsList) {
            if (booking.getDriverId().equals(driverId) && booking.getBookingStatus() == BookingStatus.CONFIRMED) {
                booking.setBookingStatus(BookingStatus.COMPLETED);
            }
        }
    }

    public List<Bookings> getBookings() {
        return bookingsList;
    }

    public List<Bookings> getBookingsForUser(String userId) {
        List<Bookings> userBookings = new ArrayList<Bookings>();
        for (Bookings booking : bookingsList) {
            if (booking.getUserId().equals(userId)) {
                userBookings.add(booking);
            }
        }
        return userBookings;
    }
}
