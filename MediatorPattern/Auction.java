package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void addBidder(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void placeBid(Colleague colleague, int amount) {
        for (Colleague c : colleagues) {
            if (!c.getName().equals(colleague.getName())) {
                c.receiveNotification(amount);
            }
        }
    }
}
