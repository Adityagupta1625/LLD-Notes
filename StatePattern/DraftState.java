package StatePattern;

public class DraftState extends State {

    @Override
    public void edit() {
        System.out.println("draft to edit");
    }

    @Override
    public void publish() {
        System.out.println("draft to publish");
    }
}
