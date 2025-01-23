package ObserverPattern;

public class SmsSubscriber implements Subscribers {

    @Override
    public void listen(String message) {
        System.out.println("Sms subscriber is notified: " + message);
    }

}
