import java.util.ArrayList;
import java.util.List;

public abstract class Match {

    private Team tossWinner;
    private Team teamA;
    private Team teamB;
    private List<Innings> innings;
    private int noOfOvers;
    private int noOfInnings;
    private MatchType matchType;
    private int currentInnings;

    public Match(MatchType matchType, int noOfOvers, int noOfInnings) {
        this.matchType = matchType;
        this.noOfOvers = noOfOvers;
        this.noOfInnings = noOfInnings;
        this.innings = new ArrayList<Innings>();
    }

    public Team getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(Team tossWinner) {
        this.tossWinner = tossWinner;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public List<Innings> getInnings() {
        return innings;
    }

    public void setInnings(List<Innings> innings) {
        this.innings = innings;
    }

    public int getNoOfOvers() {
        return noOfOvers;
    }

    public void setNoOfOvers(int noOfOvers) {
        this.noOfOvers = noOfOvers;
    }

    public int getNoOfInnings() {
        return noOfInnings;
    }

    public void setNoOfInnings(int noOfInnings) {
        this.noOfInnings = noOfInnings;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public void setCurrentInnings(int value) {
        this.currentInnings = value;
    }

    public int getCurrentInnings() {
        return this.currentInnings;
    }
}
