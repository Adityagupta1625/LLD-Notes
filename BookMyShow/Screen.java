package BookMyShow;

import java.util.List;

public class Screen {
    private String id;
    private String name;
    private List<Seat> seatList;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSeat(Seat seat) {
        this.seatList.add(seat);
    }

    public void removeSeat(Seat seat) {
        this.seatList.remove(seat);
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
