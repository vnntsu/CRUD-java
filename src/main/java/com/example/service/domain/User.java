package com.example.service.domain;

public class User {
    private long id;
    private String username;
    private String address;

    public User() {
        super();
    }

    public User(long id, String username, String address) {
        super();
        this.id = id;
        this.username = username;
        this.address = address;
    }

    public User(String username, String address) {
        super();
        this.username = username;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
