package StatePattern;

public class Main {

    public static void main(String[] args) {
        State state = new DraftState();

        Context context = new Context(state);

        context.edit();
        context.publish();

        context.setState(new ModerationState());
        context.edit();
        context.publish();

        context.setState(new PublishState());
        context.edit();
        context.publish();
    }
}
