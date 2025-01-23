import java.util.ArrayList;
import java.util.List;

public class Over {

    private List<Balls> balls;
    private int id;

    public Over(int id) {
        this.id = id;
        this.balls = new ArrayList<Balls>();
    }

    public List<Balls> getBalls() {
        return balls;
    }

    public void setBalls(List<Balls> balls) {
        this.balls = balls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
