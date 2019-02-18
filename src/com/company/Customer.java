package com.company;
import java.util.ArrayList;
public class Customer {
    private String customername;
    private String address;
    private String date;
    private String accountnumber;

    public Customer(String customername, String address, String date, String accountnumber) {
        this.customername = customername;
        this.address = address;
        this.date = date;
        this.accountnumber = accountnumber;
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
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public Customer() {

        }


    }
