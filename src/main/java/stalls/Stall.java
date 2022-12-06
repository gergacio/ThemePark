package stalls;

import behaviours.IReviewed;

public abstract class Stall implements IReviewed{ //all subclass should implement IReviewed ..do it through parent class
    //fields
    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;

    private int rating;//need extra filed to fill up contract

    //contracts coming from interface
    //  int getRating();
    //    String getName();

    //constructor

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;

    }
    //access state through getters

    public String getName() {
        return name;
    }

    public int getRating(){
        return this.rating;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
