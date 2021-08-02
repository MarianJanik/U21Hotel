package com.engeto.examples;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    Guests AdelaMalikova = new Guests("Adéla","Malíková", LocalDate.of(1993,3,13));
	    Guests JanDvoracek = new Guests("Jan","Dvořáček",LocalDate.of(1995,5,5));

        System.out.println();
        System.out.println("---------- Seznam hostů:");
	    AdelaMalikova.getDescription();
        JanDvoracek.getDescription();

        HotelRoom hotelRoom1 = new HotelRoom(1,1,true,true, BigDecimal.valueOf(1000));
        HotelRoom hotelRoom2 = new HotelRoom(2,1,true,true, BigDecimal.valueOf(1000));
        HotelRoom hotelRoom3 = new HotelRoom(3,3,false,true, BigDecimal.valueOf(2400));

        System.out.println();
        System.out.println("---------- Naše pokoje:");
        hotelRoom1.getDescription();
        hotelRoom2.getDescription();
        hotelRoom3.getDescription();

        ListReservation ourReservation = new ListReservation();

        ourReservation.addReservation(new Reservation(hotelRoom1,AdelaMalikova,Stay.WORKING,
                LocalDate.of(2021,7,19),LocalDate.of(2021,7,26)));
        ourReservation.addReservation(new Reservation(hotelRoom3,AdelaMalikova,Stay.REKREATIONAL,
                LocalDate.of(2021,9,1),LocalDate.of(2021,9,14)));
        ourReservation.addReservation(new Reservation(hotelRoom3,JanDvoracek,Stay.REKREATIONAL,
                LocalDate.of(2021,9,1),LocalDate.of(2021,9,14)));

        ourReservation.printAllReservation();


        /* Tento kód jsem měl původně - bez třídy ListReservation

        Reservation reservation1 = new Reservation(hotelRoom1,AdelaMalikova,Stay.WORKING,
                LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
        Reservation reservation2 = new Reservation(hotelRoom3,AdelaMalikova,Stay.REKREATIONAL,
                LocalDate.of(2021,9,1),LocalDate.of(2021,9,14));
        Reservation reservation3 = new Reservation(hotelRoom3,JanDvoracek,Stay.REKREATIONAL,
                LocalDate.of(2021,9,1),LocalDate.of(2021,9,14));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------- Rezervace:");
        reservation1.getDescription();
        reservation2.getDescription();
        reservation3.getDescription();

         */
    }
}
