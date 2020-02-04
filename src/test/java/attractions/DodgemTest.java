package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(13, 150, 5.00);
        visitor2 = new Visitor(10, 150, 5.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void paysFullPrice(){
        double result = dodgems.priceFor(visitor1);
        assertEquals(4.50, result, 0.1);
    }

    @Test
    public void paysHalfPrice(){
        double result = dodgems.priceFor(visitor2);
        assertEquals(2.25, result, 0.1);
    }
}
