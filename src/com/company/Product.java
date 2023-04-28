package com.company;

public class Product {

    String name;
    double price;
    int id;
    int frequency=0;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(String name, double price, int id, int frequency) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        if (frequency<0){
            throw new IllegalArgumentException("Liczba sztuk nie może być mniejsza od 0");
        } else {
            this.frequency = frequency;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }
}