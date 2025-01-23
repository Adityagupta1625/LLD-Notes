package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscribers smSubscribers = new SmsSubscriber();
        publisher.addSubscriber(smSubscribers);
        publisher.notifySubscribers("Hello");

        Subscribers emailSubscribers = new EmailSubscriber();
        publisher.addSubscriber(emailSubscribers);
        publisher.notifySubscribers("Hello");

        publisher.removeSubscriber(smSubscribers);
        publisher.notifySubscribers("Hello");

    }
}
