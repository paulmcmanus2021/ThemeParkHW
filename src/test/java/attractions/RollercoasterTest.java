package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(20,150.00, 20.00);
        visitor2 = new Visitor(20,210.00, 20.00);
        visitor3 = new Visitor(20,140.00, 20.00);
        visitor4 = new Visitor(10,210.00, 20.00);
        visitor5 = new Visitor(20,210.00, 20.00);
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
    public void payFullPrice(){
        double result = rollerCoaster.priceFor(visitor1);
        assertEquals(8.40, result, 0.1);
    }

    @Test
    public void payDoublePrice(){
        double result = rollerCoaster.priceFor(visitor2);
        assertEquals(16.80, result, 0.1);
    }

    @Test
    public void tooShort(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void tooYoung(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void isTallEnoughAndOldEnough(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor5));

    }
}
