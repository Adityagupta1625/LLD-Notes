package TicToe;

public class Player {
    private String name;
    private PlayingPiece piece;
    private int score;

    public Player(String name, PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
        this.score = 0;
    }

    public void incrementScore() {
        this.score++;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public PlayingPiece getPiece() {
        return piece;
    }
}
