package BookMyShow;

public class Seat {

    private int id;
    private int row;
    private int price;
    private SeatType seatType;

    public int getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
}
