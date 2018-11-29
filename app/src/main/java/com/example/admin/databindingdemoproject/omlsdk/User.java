package com.example.admin.databindingdemoproject.omlsdk;

public class User {
    private String name;
    private String address;
    private String phone;
    private String desig;

    public User(String name, String address, String phone, String desig) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.desig = desig;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getDesig() {
        return desig;
    }
}
