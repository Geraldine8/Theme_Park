package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    private Dodgems dodgems;
    private Visitor youngVisitor;
    private Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        youngVisitor = new Visitor(10, 130, 60);
        oldVisitor = new Visitor(16, 165, 40);
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
    public void canGetTicketHalfPrice(){
        assertEquals(4.20, dodgems.getHalfPrice(youngVisitor),0.01);
    }

    @Test
    public void cantGetTicketHalfPrice(){
        assertEquals(8.40, dodgems.getHalfPrice(oldVisitor),0.01);
    }
}
