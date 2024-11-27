package MediatorPattern;

public class Bidder implements Colleague {

    private String name;
    private AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this, amount);
    }

    @Override
    public void receiveNotification(int amount) {
        System.out.println("A bid of " + amount + " has been placed");
    }

}
