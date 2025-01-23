package ObserverPattern;

public class EmailSubscriber implements Subscribers {

    @Override
    public void listen(String message) {
        System.out.println("Email subscriber is notified: " + message);
    }
}
