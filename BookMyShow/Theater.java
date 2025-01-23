package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    private String name;
    private String id;
    private List<Show> shows;
    private List<Screen> screens;
    private Address address;

    public Theater() {
        this.shows = new ArrayList<Show>();
        this.screens = new ArrayList<Screen>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }

    public void removeShow(Show show) {
        this.shows.remove(show);
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void addScreen(Screen screen) {
        this.screens.add(screen);
    }

    public void removeScreen(Screen screen) {
        this.screens.remove(screen);
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
