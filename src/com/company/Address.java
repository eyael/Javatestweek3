package com.company;

import java.util.ArrayList;


public class Address {

    String street;
    int zipcode;
    String state;
    public Address() {
    }
    public Address(String street, int zipcode, String state) {

        this.street = street;
        this.zipcode = zipcode;
        this.state = state;

    }
    public String getStreet() {
        return street;

    }
    public void setStreet(String street) {
        this.street = street;

    }public int getZipcode() {

        return zipcode;

    }
    public void setZipcode(int zipcode) {

        this.zipcode = zipcode;

    }public String getState() {

        return state;

    }public void setState(String state) {

        this.state = state;

    }

}
