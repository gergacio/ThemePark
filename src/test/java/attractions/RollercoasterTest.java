package attractions;

import behaviours.ISecurity;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void gasALowed(){
        Visitor visitor = new Visitor(25,190,100);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
//    @Test
//    public void hasPrice(){
//        Visitor visitor = new Visitor(22,201,200);
//        rollerCoaster.priceFor(visitor);
//        assertEquals(8.40, rollerCoaster.getPrice());
//    }
//    @Test
//    public void haspriceForVisitor(){
//        Visitor visitor = new Visitor(22,201,200);
//        assertEquals(16.80, rollerCoaster.priceFor(visitor),0);
//
//    }

}
