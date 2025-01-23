package StatePattern;

public class ModerationState extends State {

    @Override
    public void publish() {
        System.out.println("moderation to publish");
    }

    @Override
    public void edit() {
        System.out.println("moderation to edit");
    }
}
