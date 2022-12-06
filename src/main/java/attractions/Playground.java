package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {
    //get name and rating from parent

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean isAllowed = false;
        if(visitor.getAge() <= 15){
            isAllowed = true;
        }
        return isAllowed;
    }
}
