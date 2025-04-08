package Uber.DTO;

import Uber.Models.Coordinates;
import Uber.Models.User;

public class BookingDAO {

    private Coordinates source;
    private Coordinates destination;
    private User user;

    public BookingDAO(Coordinates source, Coordinates destination, User user) {
        this.user = user;
        this.source = source;
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Coordinates getSource() {
        return source;
    }

    public void setSource(Coordinates source) {
        this.source = source;
    }

    public Coordinates getDestination() {
        return destination;
    }

    public void setDestination(Coordinates destination) {
        this.destination = destination;
    }
}
