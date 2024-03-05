package com;

public class Address {

    private String hNo;
    private String city;
    private String state;

    public Address(String hNo, String city, String state) {
        this.hNo = hNo;
        this.city = city;
        this.state = state;
    }

    public Address() {

    }

    public String gethNo() {
        return hNo;
    }

    public void sethNo(String hNo) {
        this.hNo = hNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
