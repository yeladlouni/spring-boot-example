package com.example.demo;

public class Product {
    private final int id;
    private String label;
    private double price;
    private String category;
    private String description;

    public Product(int id, String label, String category, String description, double price) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
