import java.util.ArrayList;
import java.util.List;

public class BowlingScorecard {

    private List<Over> overs;
    private Player player;

    public BowlingScorecard(Player player) {
        this.player = player;
        this.overs = new ArrayList<Over>();
    }

    public List<Over> getOvers() {
        return overs;
    }

    public void addOver(Over over) {
        this.overs.add(over);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
