package BookMyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    MovieController movieController;
    TheaterController theaterController;

    BookMyShow() {
        this.movieController = new MovieController();
        this.theaterController = new TheaterController();
    }

    private void intialize() {
        createMovies();

        createTheater();
    }

    private void createTheater() {
        Movie avengers = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAHUBALI");

        Address bangaloreAddress = new Address("Bangalore", "Karnataka", "Bengaluru", "560001");

        List<Screen> screens = getScreens();

        Theater bangaloreTheater = new Theater();
        bangaloreTheater.setId("1");
        bangaloreTheater.setName("Bangalore Theater");
        bangaloreTheater.setAddress(bangaloreAddress);
        bangaloreTheater.setScreens(screens);

        Theater delhiTheater = new Theater();
        delhiTheater.setId("2");
        delhiTheater.setName("Delhi Theater");
        delhiTheater.setAddress(bangaloreAddress);
        delhiTheater.setScreens(screens);

        Show avengersMorningShow = new Show();
        avengersMorningShow.setId("1");
        avengersMorningShow.setMovie(avengers);
        avengersMorningShow.setScreen(screens.get(0));
        avengersMorningShow.setStartTime(10);

        Show avengersEveningShow = new Show();
        avengersEveningShow.setId("2");
        avengersEveningShow.setMovie(avengers);
        avengersEveningShow.setScreen(screens.get(1));
        avengersEveningShow.setStartTime(18);

        Show baahubaliMorningShow = new Show();
        baahubaliMorningShow.setId("3");
        baahubaliMorningShow.setMovie(baahubali);
        baahubaliMorningShow.setScreen(screens.get(0));
        baahubaliMorningShow.setStartTime(10);

        Show baahubaliEveningShow = new Show();
        baahubaliEveningShow.setId("4");
        baahubaliEveningShow.setMovie(baahubali);
        baahubaliEveningShow.setScreen(screens.get(1));
        baahubaliEveningShow.setStartTime(18);

        bangaloreTheater.addShow(avengersMorningShow);
        bangaloreTheater.addShow(baahubaliEveningShow);

        delhiTheater.addShow(avengersEveningShow);
        delhiTheater.addShow(baahubaliMorningShow);

        theaterController.addTheater(bangaloreTheater, City.Bangalore.toString());
        theaterController.addTheater(delhiTheater, City.Delhi.toString());
    }

    public List<Seat> getSeats() {
        List<Seat> seats = new ArrayList<>();
        int row = 0;

        for (int i = 0; i < 40; i++) {
            if (i % 10 == 0) {
                row++;
            }
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatType(SeatType.PLATINUM);
            seat.setPrice(300);
            seat.setRow(row);
            seats.add(seat);
        }

        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatType(SeatType.GOLD);
            seat.setPrice(200);
            seats.add(seat);
        }

        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatType(SeatType.SILVER);
            seat.setPrice(100);
            seats.add(seat);
        }

        return seats;

    }

    public List<Screen> getScreens() {
        List<Screen> screens = new ArrayList<>();

        Screen screen1 = new Screen();
        screen1.setId("1");
        screen1.setName("Screen1");
        screen1.setSeatList(getSeats());

        Screen screen2 = new Screen();
        screen2.setId("2");
        screen2.setName("Screen2");
        screen2.setSeatList(getSeats());

        screens.add(screen1);
        screens.add(screen2);

        return screens;
    }

    private void createMovies() {

        // create Movies1
        Movie avengers = new Movie();
        avengers.setId("1");
        avengers.setName("AVENGERS");
        avengers.setDuration(128);

        // create Movies2
        Movie baahubali = new Movie();
        baahubali.setId("2");
        baahubali.setName("BAHUBALI");
        baahubali.setDuration(150);

        // add movies against the cities
        movieController.addMovieToCity(City.Bangalore.toString(), avengers);
        movieController.addMovieToCity(City.Delhi.toString(), baahubali);
        movieController.addMovieToCity(City.Bangalore.toString(), baahubali);
        movieController.addMovieToCity(City.Delhi.toString(), baahubali);
    }

    private void createBooking(String city, String movieName) {

        List<Movie> movies = movieController.getMovie(city);

        Movie interestedMovie = null;

        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                interestedMovie = movie;
                break;
            }
        }

        if (interestedMovie == null) {
            System.out.println("No movie found");
            return;
        }

        Map<Theater, List<Show>> showsTheaterWise = theaterController.getShows(city, interestedMovie);

        Theater interestedTheater = showsTheaterWise.keySet().iterator().next();

        Show interestedShows = showsTheaterWise.get(interestedTheater).get(0);

        // 5. select the seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShows.getBookedSeats();
        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);
            // startPayment
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat screenSeat : interestedShows.getScreen().getSeatList()) {
                if (screenSeat.getId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setSeats(myBookedSeats);
            booking.setShow(interestedShows);
            booking.setId("1");
            interestedShows.addBookedSeat(seatNumber);
        } else {
            // throw exception
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");

    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.intialize();

        bookMyShow.createBooking(City.Bangalore.toString(), "BAHUBALI");

        bookMyShow.createBooking(City.Delhi.toString(), "BAHUBALI");

    }
}
