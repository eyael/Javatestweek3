package com.company;


import java.util.ArrayList;



public class Customer {
    private String customername;
    private String address;
    private String date;
    private String accountnumber;
    private String Name;
    private double price;
    private int quantity;
    private boolean taxable;


    public Customer(String customername, String address, String date, String accountnumber, String name, double price, int quantity, boolean taxable) {
        this.customername = customername;
        this.address = address;
        this.date = date;

        this.accountnumber = accountnumber;
        Name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;

    }

    public Customer() {

    }
    public String getCustomername() {
        return customername;

    }

    public void setCustomername(String customername) {
        this.customername = customername;

    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;

    }
    public String getDate() {
        return date;

    }

    public void setDate(String date) {
        this.date = date;

    }public String getAccountnumber() {

        return accountnumber;

    }public void setAccountnumber(String accountnumber) {

        this.accountnumber = accountnumber;

    }public String getName() {

        return Name;

    }
    public void setName(String name) {

        Name = name;

    }public double getPrice() {

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







}