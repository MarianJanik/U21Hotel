package com.engeto.examples;

import java.time.LocalDate;

public class Guests {
    private String name;
    private String surname;
    private LocalDate birthDate;

    public Guests(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void getDescription(){
        System.out.println("Host: "+this.getName()+" "+this.getSurname()+", datum narození: "
                +MyDate.czechDate(getBirthDate(),2));
    }
}

