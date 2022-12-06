package attractions;

import behaviours.IReviewed;

public abstract class Attraction implements IReviewed {
    //fields
    private String name;
    private int rating;
    private int visitCount;
    //constructor

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }
    //getters - access state
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

}
