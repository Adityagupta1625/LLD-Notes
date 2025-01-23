package ATM;

import ATM.ATMStates.ATMState;
import ATM.ATMStates.IdleState;

public class ATM {

    private int atmBalance;
    private int noOfThousandNotes;
    private int noOfHundredNotes;
    private int noOfFiveHundredNotes;
    private ATMState atmState;

    public ATM() {
        this.atmState = new IdleState();
    }

    public void setAtmBalance(int atmBalance, int noOfThousandNotes, int noOfHundredNotes, int noOfFiveHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfThousandNotes = noOfThousandNotes;
        this.noOfHundredNotes = noOfHundredNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public int getNoOfThousandNotes() {
        return noOfThousandNotes;
    }

    public void setNoOfThousandNotes(int noOfThousandNotes) {
        this.noOfThousandNotes = noOfThousandNotes;
    }

    public int getNoOfHundredNotes() {
        return noOfHundredNotes;
    }

    public void setNoOfHundredNotes(int noOfHundredNotes) {
        this.noOfHundredNotes = noOfHundredNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public void setState(ATMState atmState) {
        this.atmState = atmState;
    }

    public ATMState getState() {
        return atmState;
    }

    public void deductOneHundredNotes(int noOfHundredNotes) {
        this.noOfHundredNotes -= noOfHundredNotes;
    }

    public void deductOneThousandNotes(int noOfThousandNotes) {
        this.noOfThousandNotes -= noOfThousandNotes;
    }

    public void deductFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes -= noOfFiveHundredNotes;
    }

    public void getCurrentStatus() {
        System.out.println("Current Balance: " + atmBalance + "\nNo of Thousand Notes: " + noOfThousandNotes
                + "\nNo of Hundred Notes: " + noOfHundredNotes + "\nNo of Five Hundred Notes: " + noOfFiveHundredNotes);
    }

}
