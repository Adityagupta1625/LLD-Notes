package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    List<Subscribers> subscribers = new ArrayList<Subscribers>();

    public void addSubscriber(Subscribers subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(String message) {
        for (Subscribers subscriber : subscribers) {
            subscriber.listen(message);
        }
    }

    public void removeSubscriber(Subscribers subscriber) {
        subscribers.remove(subscriber);
    }
}
