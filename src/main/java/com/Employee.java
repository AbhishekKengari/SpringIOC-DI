package com;

public class Employee {

    private String eName;
    private int eAge;
    // the emp is dependent on address 
    //we will need to create a address and then create employee
    private Address eAddress;
    public Employee(){}
    public Employee(String eName, int eAge, Address eAddress) {
        this.eName = eName;
        this.eAge = eAge;
        this.eAddress = eAddress;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public Address geteAddress() {
        return eAddress;
    }

    public void seteAddress(Address eAddress) {
        this.eAddress = eAddress;
    }
}
