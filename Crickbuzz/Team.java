import java.util.List;

public class Team {

    private String name;
    private List<Player> players;
    private BattingController battingController;
    private BowlingController bowlingController;

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public BattingController getBattingController() {
        return battingController;
    }

    public void setBattingController(BattingController battingController) {
        this.battingController = battingController;
    }

    public BowlingController getBowlingController() {
        return bowlingController;
    }

    public void setBowlingController(BowlingController bowlingController) {
        this.bowlingController = bowlingController;
    }
}
