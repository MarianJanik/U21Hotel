package com.engeto.examples;

import java.math.BigDecimal;

public class HotelRoom {
    private int roomNumber;
    private int numberOfBeds;
    private boolean isBalcony;
    private boolean isSeaViews;
    private BigDecimal price;

    public HotelRoom(int roomNumber, int numberOfBeds, boolean isBalcony, boolean isSeaViews, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSeaViews = isSeaViews;
        this.price = price;
    }

    public HotelRoom(int roomNumber, int numberOfBeds, boolean isBalcony, boolean isSeaViews) {
        this(roomNumber,numberOfBeds, isBalcony,isSeaViews, BigDecimal.valueOf(0) );
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeaViews() {
        return isSeaViews;
    }

    public void setSeaViews(boolean seaViews) {
        isSeaViews = seaViews;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void getDescription(){
        System.out.println("Hotelový pokoj č."+this.getRoomNumber()+":\n- počet lůžek: "+this.getNumberOfBeds()+"\n- balkon: "
                +this.isBalcony()+"\n- výhled na moře: "+this.isSeaViews()+"\n- cenu: "+this.getPrice());
        System.out.println("----------------------");
    }
}
