
public class BattingScorecard {
    private Player player;
    private int runs;
    private int ballsPlayed;
    private int fours;
    private int sixes;
    private double strikeRate;
    private boolean playing;
    private Wicket wicket;

    public BattingScorecard(Player player) {
        this.player = player;
        this.runs = 0;
        this.sixes = 0;
        this.ballsPlayed = 0;
        this.strikeRate = 0.0;
        this.fours = 0;

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void setBallsPlayed(int ballsPlayed) {
        this.ballsPlayed = ballsPlayed;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void setWicket(Wicket wicket) {
        this.wicket = wicket;
    }

    public Wicket getWicket() {
        return wicket;
    }
}
