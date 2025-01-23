package InventorySystem;

import java.util.Date;

public class Invoice {

    private User user;
    private String invoiceNo;
    private Date invoiceDate;
    private double taxAmount;
    private double totalAmount;
    private double NetAmount;

    public Invoice(User user, String invoiceNo, Date invoiceDate, double totalAmount) {
        this.user = user;
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.totalAmount = totalAmount;
        this.taxAmount = 0.18 * totalAmount;
        this.NetAmount = totalAmount + taxAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getNetAmount() {
        return NetAmount;
    }

    public void setNetAmount(double NetAmount) {
        this.NetAmount = NetAmount;
    }
}
