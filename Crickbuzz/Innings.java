import java.util.ArrayList;
import java.util.List;

public class Innings {

    private List<BowlingScorecard> battingScorecard;
    private List<BattingScorecard> bowlingScorecard;

    public Innings() {
        bowlingScorecard = new ArrayList<BattingScorecard>();
        battingScorecard = new ArrayList<BowlingScorecard>();
    }

    public List<BowlingScorecard> getBattingScorecard() {
        return battingScorecard;
    }

    public void setBattingScorecard(List<BowlingScorecard> battingScorecard) {
        this.battingScorecard = battingScorecard;
    }

    public List<BattingScorecard> getBowlingScorecard() {
        return bowlingScorecard;
    }

    public void setBowlingScorecard(List<BattingScorecard> bowlingScorecard) {
        this.bowlingScorecard = bowlingScorecard;
    }
}
