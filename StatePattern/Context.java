package StatePattern;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish() {
        state.publish();
    }

    public void edit() {
        state.edit();
    }
}
