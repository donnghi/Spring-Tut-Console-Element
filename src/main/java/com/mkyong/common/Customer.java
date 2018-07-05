package com.mkyong.common;

public class Customer
{
    private int custID;
    private String name;
    private int age;

    public Customer(int custID, String name, int age) {
        this.custID = custID;
        this.name = name;
        this.age = age;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
