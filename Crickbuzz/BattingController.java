import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BattingController {

    private Player strike;
    private Player nonStrike;
    private Queue<Player> batters;
    private List<Player> dismissedPlayers;

    public BattingController() {
        this.dismissedPlayers = new ArrayList<Player>();
    }

    public Player getStrike() {
        return strike;
    }

    public void setStrike(Player strike) {
        this.strike = strike;
    }

    public Player getNonStrike() {
        return nonStrike;
    }

    public void setNonStrike(Player nonStrike) {
        this.nonStrike = nonStrike;
    }

    public Queue<Player> getBatters() {
        return batters;
    }

    public void setBatters(Queue<Player> batters) {
        this.batters = batters;
    }

    public Player getNextBatter() {
        return batters.poll();
    }

    public void addDismissedPlayer(Player player) {
        dismissedPlayers.add(player);
    }

    public void removeDismissedPlayer(Player player) {
        dismissedPlayers.remove(player);
    }

    public List<Player> getListOfDismissedPlayers() {
        return dismissedPlayers;
    }
}
