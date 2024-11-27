package CarRentalSystem;

import java.sql.Date;

public class Bill {

    private int billId;
    private double amount;
    private Date billDate;
    private Reservation reservation;

    public Bill(int billId, double amount, Date billDate, Reservation reservation) {
        this.billId = billId;
        this.amount = amount;
        this.billDate = billDate;
        this.reservation = reservation;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
