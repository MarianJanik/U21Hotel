package com.engeto.examples;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Reservation {
    HotelRoom room;
    Guests guest;
    Stay stay;
    LocalDate startDate;
    LocalDate endDate;

    public Reservation(HotelRoom room, Guests guest, Stay stay, LocalDate startDate, LocalDate endDate) {
        this.room = room;
        this.guest = guest;
        this.stay = stay;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }

    public Guests getGuest() {
        return guest;
    }

    public void setGuest(Guests guest) {
        this.guest = guest;
    }

    public Stay getStay() {
        return stay;
    }

    public void setStay(Stay stay) {
        this.stay = stay;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void getDescription() {
        System.out.println();
        guest.getDescription();
        System.out.println("bude ubytován/a na");
        room.getDescription();

        System.out.println("Od "+MyDate.czechDate(startDate,3)+" do "+MyDate.czechDate(endDate,2)
                + " jako pobyt " + this.stay+ ".");

        System.out.println("-----------------------------------------------");
    }
}
