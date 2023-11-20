package com.telran.org.homeworktwelve;

public class UserRequest {
    private final Ansver ansver;
    private String address;

    public UserRequest(Ansver ansver, String address) {
        this.ansver = ansver;
        this.address = address;
    }

    public Ansver getAnsver() {
        return ansver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "ansver=" + ansver +
                ", address='" + address + '\'' +
                '}';
    }
}
