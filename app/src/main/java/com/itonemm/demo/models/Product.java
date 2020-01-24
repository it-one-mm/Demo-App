package com.itonemm.demo.models;

public class Product {

    private int color;
    private String name;
    private int stock;
    private int price;

    public Product(int color, String name, int stock, int price) {
        this.color = color;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
