package com.engeto.examples;

import java.util.ArrayList;

public class ListReservation {
    ArrayList<Reservation> ourReservation = new ArrayList<>();

    public void addReservation(Reservation newReservation) {
        ourReservation.add(newReservation);
    }

    public void removeReservation(Reservation removeReservation){
        ourReservation.remove(removeReservation);
    }

    public void printAllReservation(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------- Rezervace na našem hotelu ----------");
        for (Reservation oneReservation:ourReservation){
            oneReservation.getDescription();
        }
    }
}
