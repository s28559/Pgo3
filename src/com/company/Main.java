package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //klient podaje wszystko
        User user1 = new User("Mateusz","Jamka", "m@gmail.com","Kol123");
        user1.isGuest();
        //klient podaje tylko maila
        User user2 = new User("mail1@.pl");
        user2.isGuest();
        //klient przechodzi z maila do zarejstrowania konta
        user2.accountFromHost("Jan","Kowalski",  "56985");
        user2.isGuest();
        // klinet podaje niepoprawne dane
        User user3 = new User("Krzysiu","Smoke","smoke.op.pl","Smokiop09");
        user3.accountFromHost("","","");

        //zad 2
        Product product1 = new Product("Pmodior",2.00,1);
        Product product2 = new Product("Ziemniak",3.99,2,5);
        product1.setFrequency(5);
        product2.setPrice(5.99);
        System.out.println("Liczba produktu pierwszego: "+product1.getFrequency()+" "+"Cena produktu drugiego: "+product2.getPrice());

        //zad 3
        //stworzenie instancji listy
        ArrayList<Product> list = new ArrayList<>();
        //dodanie produktów do listy z zadania 2
        list.add(product1);
        list.add(product2);
        //stworzenie kategorii i listy
        Category category1 = new Category("Warszywa",list);
        //usunięcie z listy
        category1.removeProduct(product1);
        //stworzenie samej kategorii
        Category category2 = new Category("owoce");
        //dodanie z powrotem do listy
        category2.addProduct(product1);


    }
}