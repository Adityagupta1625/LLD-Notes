public class Balls {

    private BallType ballType;
    private int id;
    private Player playedBy;
    private Player bowledBy;
    private RunType runs;

    public Balls(int id, Player playedBy, RunType runs, BallType ballType,
            Player bowledBy) {
        this.id = id;
        this.playedBy = playedBy;
        this.runs = runs;
        this.ballType = ballType;
        this.bowledBy = bowledBy;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayedBy() {
        return playedBy;
    }

    public void setPlayedBy(Player playedBy) {
        this.playedBy = playedBy;
    }

    public Player getBowledBy() {
        return bowledBy;
    }

    public void setBowledBy(Player bowledBy) {
        this.bowledBy = bowledBy;
    }

    public RunType getRuns() {
        return runs;
    }

    public void setRuns(RunType runs) {
        this.runs = runs;
    }
}
