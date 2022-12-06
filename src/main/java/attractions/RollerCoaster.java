package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {
    //get name and rating from parent

    //contract from ITicked
    //   double defaultPrice();
    //    double priceFor(Visitor visitor);

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean isAllowed = false;
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            return isAllowed = true;
        }
        return isAllowed;
    }
    //getter
    public double getPrice(){
        return this.price;
    }
//    double priceFor(Visitor visitor){
//
//        if(visitor.getHeight() > 200){
//            this.price *= 2;
//        }
//        return this.price;
//    }
}
