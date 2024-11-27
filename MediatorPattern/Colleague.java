package MediatorPattern;

public interface Colleague {

    String getName();

    void placeBid(int amount);

    void receiveNotification(int amount);
}
