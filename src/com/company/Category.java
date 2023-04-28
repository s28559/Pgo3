package com.company;

import java.util.ArrayList;

public class Category {

    String nameOfCategory;
    ArrayList<Product> products;

    public Category(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
        this.products=new ArrayList<>();
    }

    public Category(String nameOfCategory, ArrayList<Product> products) {
        this.nameOfCategory = nameOfCategory;
        this.products = products;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }

    public void addProduct(Product product){
        this.products.add(product);
        System.out.println("Liczba produktów na liście po dodaniu:"+" "+products.size());
    }

    public void removeProduct(Product product){
        this.products.remove(product);
        System.out.println("Liczba produktów na liście po usunięciu:"+" "+products.size());
    }
}