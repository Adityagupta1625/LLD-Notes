import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BowlingController {
    private Deque<Player> bowlers;
    private Player currentBowler;
    private Map<Player, Integer> bowlerVsOverCount;

    public BowlingController(List<Player> bowlers) {
        this.setBowlersList(bowlers);
    }

    public void setBowlersList(List<Player> bowlers) {
        this.bowlers = new LinkedList<>();
        this.bowlerVsOverCount = new HashMap<>();

        for (Player player : bowlers) {
            this.bowlers.addLast(player);
            this.bowlerVsOverCount.put(player, 0);
        }
    }

    public void nextBowler(int maxOverCount) {
        Player bowler = this.bowlers.pollFirst();
        this.currentBowler = bowler;

        if (this.bowlerVsOverCount.get(currentBowler) + 1 < maxOverCount) {
            this.bowlers.addLast(bowler);
            this.bowlerVsOverCount.put(bowler, this.bowlerVsOverCount.get(bowler) + 1);

        }
    }

    public Player getCurrentPlayer() {
        return currentBowler;
    }

}
