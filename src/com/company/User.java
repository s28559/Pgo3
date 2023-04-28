package com.company;

public class User {
    private String name;
    private String surname;
    private String mail;
    private String password;
    private boolean isGuest;

    public User(String name, String surname, String mail, String password) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        isGuest=false;
    }

    public User(String mail) {
        this.mail = mail;
        isGuest=true;
    }


    public boolean isGuest() {
        if (isGuest) {
            System.out.println("Klient jest gościem");
            return true;
        } else {
            System.out.println("Klient jest zalogowanym klientem");
            return false;
        }
    }

    public boolean accountFromHost (String name, String surname, String password) {
        if (!name.isEmpty() && !surname.isEmpty() && !password.isEmpty()){
            this.name=name;
            this.surname=surname;
            this.password=password;
            System.out.println("Klient poprawnie zarejstrowany a jego passy to imię:"+" "+this.name+","+ "Nazwisko:" +" "+this.surname+","+" "+"mail:"+" "+this.mail+","+" "+"hasło:"+this.password);
            isGuest=false;
            return true;
        } else {
            System.out.println("Proszę wprowadzić poprawnie dane");
            return false;
        }
    }
}