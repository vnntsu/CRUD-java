package com.example.service.domain;

public class Product {
    private Long id;
    private String name;
    private Long price;

    public Long getId() {
        return id;
    }

    public Product() { }

    public Product(String name, Long price) {

        this.name = name;
        this.price = price;
    }

    public Product(Long id, String name, Long price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
