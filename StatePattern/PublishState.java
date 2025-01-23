package StatePattern;

public class PublishState extends State {

    @Override
    public void edit() {
        System.out.println("publish to edit");
    }
}
