package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MovieController {

    Map<String, List<Movie>> CityVsMovie;
    HashSet<Movie> movies;

    public MovieController() {
        this.CityVsMovie = new HashMap<String, List<Movie>>();
        this.movies = new HashSet<Movie>();
    }

    public void addMovieToCity(String city, Movie movie) {
        this.movies.add(movie);

        if (this.CityVsMovie.containsKey(city)) {
            this.CityVsMovie.get(city).add(movie);
        } else {
            List<Movie> movieList = new ArrayList<Movie>();
            movieList.add(movie);
            this.CityVsMovie.put(city, movieList);
        }
    }

    public Movie getMovieByName(String name) {
        for (Movie movie : this.movies) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMovie(String city) {
        return this.CityVsMovie.get(city);
    }
}
