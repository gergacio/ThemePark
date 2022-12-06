package behaviours;
import people.Visitor;

public interface ITicketed {
    //provide method signature
    double defaultPrice();
    double priceFor(Visitor visitor);
}
