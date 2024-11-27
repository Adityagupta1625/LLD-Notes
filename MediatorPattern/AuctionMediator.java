package MediatorPattern;

public interface AuctionMediator {
    void addBidder(Colleague colleague);

    void placeBid(Colleague colleague, int amount);
}
