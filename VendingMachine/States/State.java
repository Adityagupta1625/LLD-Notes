package VendingMachine.States;

import java.util.List;

import VendingMachine.Coin;
import VendingMachine.Item;

public interface State {

    public void clickOnInsertCoinButton() throws Exception;

    public void clickOnSelectItemButton() throws Exception;

    public void insertCoin(Coin coin) throws Exception;

    public Item dispense() throws Exception;

    public void selectItem(int id) throws Exception;

    public List<Coin> cancel() throws Exception;

    public List<Coin> getChange() throws Exception;

    public void updateInventory(int id, Item item) throws Exception;

}
