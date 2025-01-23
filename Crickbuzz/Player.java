public class Player {

    private PlayerType playerType;
    private Person person;
    private boolean isCaptain;

    public Player(Person person, PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean isCaptain) {
        this.isCaptain = isCaptain;
    }
}
