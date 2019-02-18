package com.company;

import java.util.ArrayList;


public class Invoice {

    private String itemname;
    private double price;
    private int quantity;
    private boolean taxable;

    public Invoice(String itemname, double price, int quantity, boolean taxable) {
        this.itemname = itemname;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public Invoice() {
    }


}
