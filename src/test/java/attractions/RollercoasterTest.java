package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    private RollerCoaster rollerCoaster;
    private Visitor youngVisitor;
    private Visitor oldVisitor;
    private Visitor shortVisitor;
    private Visitor tallVisitor;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        youngVisitor = new Visitor(13, 130, 60);
        oldVisitor = new Visitor(16, 165, 40);
        shortVisitor = new Visitor(18, 179, 20);
        tallVisitor = new Visitor(25, 205, 50);
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
    public void canAllowVisitor(){
        assertTrue(rollerCoaster.isAllowedTo(oldVisitor));
    }


    @Test
    public void cantAllowVisitor(){
        assertTrue(rollerCoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void getPriceShortVisitor(){
        assertEquals(8.40, rollerCoaster.priceFor(shortVisitor),0.01);
    }

    @Test
    public void getPriceTallVisitor(){
        assertEquals(16.80, rollerCoaster.priceFor(tallVisitor),0.01);
    }

}
