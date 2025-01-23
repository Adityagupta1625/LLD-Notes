package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {

    private String id;
    private Movie movie;
    private Screen screen;
    private int startTime;
    private List<Integer> bookedSeats;

    public Show() {
        bookedSeats = new ArrayList<Integer>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void addBookedSeat(int seatId) {
        this.bookedSeats.add(seatId);
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

}
