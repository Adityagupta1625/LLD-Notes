package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TheaterController {

    Map<String, List<Theater>> theaterMap;
    Set<Theater> theaters;

    public TheaterController() {
        this.theaterMap = new HashMap<String, List<Theater>>();
        this.theaters = new HashSet<Theater>();
    }

    public void addTheater(Theater theater, String city) {
        this.theaters.add(theater);
        if (this.theaterMap.containsKey(city)) {
            this.theaterMap.get(city).add(theater);
        } else {
            List<Theater> theaters = new ArrayList<Theater>();
            theaters.add(theater);
            this.theaterMap.put(city, theaters);
        }
    }

    public List<Theater> getTheater(String city) {
        return this.theaterMap.get(city);
    }

    public Map<Theater, List<Show>> getShows(String city, Movie movie) {
        Map<Theater, List<Show>> theatreVsShows = new HashMap<>();

        List<Theater> theaters = this.theaterMap.get(city);

        for (Theater theater : theaters) {
            List<Show> shows = theater.getShows();
            List<Show> givenMovieShow = new ArrayList<>();

            for (Show show : shows) {
                if (show.getMovie().getName().equals(movie.getName())) {
                    givenMovieShow.add(show);
                }
            }

            if (!givenMovieShow.isEmpty()) {
                theatreVsShows.put(theater, givenMovieShow);
            }
        }

        return theatreVsShows;
    }

}
