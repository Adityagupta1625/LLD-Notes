package MediatorPattern;

public class Main {

    public static void main(String[] args) {
        Auction auction = new Auction();

        Bidder bidder1 = new Bidder("Bidder 1", auction);
        Bidder bidder2 = new Bidder("Bidder 2", auction);
        Bidder bidder3 = new Bidder("Bidder 3", auction);

        bidder1.placeBid(100);
        bidder2.placeBid(200);
        bidder3.placeBid(300);
    }
}
