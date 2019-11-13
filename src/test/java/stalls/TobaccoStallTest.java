package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;
    private Visitor youngVisitor;
    private Visitor oldVisitor;


    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,6);
        youngVisitor = new Visitor(13, 140, 50);
        oldVisitor = new Visitor (20, 179, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canAllowVisitor(){
        assertTrue(tobaccoStall.isAllowedTo(oldVisitor));
    }

}
