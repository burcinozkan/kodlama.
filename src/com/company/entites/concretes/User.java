package com.company.entites.concretes;

public class User {
    private String name;
    private String surname;
    private int parola;
    private String email;

    public User(String name, String surname, int parola, String email) {
        this.name = name;
        this.surname = surname;
        this.parola = parola;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getParola() {
        return parola;
    }

    public void setParola(int parola) {
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
