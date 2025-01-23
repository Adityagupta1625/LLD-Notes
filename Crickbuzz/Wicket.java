public class Wicket {

    private Player takenBy;
    private WicketType wicketType;
    private int over;
    private int ball;

    public Wicket(Player takenBy, WicketType wicketType, int over, int ball) {
        this.takenBy = takenBy;
        this.wicketType = wicketType;
        this.over = over;
        this.ball = ball;
    }

}
