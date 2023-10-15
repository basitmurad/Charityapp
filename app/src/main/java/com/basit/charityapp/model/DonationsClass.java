package com.basit.charityapp.model;

import java.util.Date;

public class DonationsClass {
    private String itemName, quantity,time;
    private Date date;


    public DonationsClass(String itemName, String quantity, String time, Date date) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.time = time;
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
