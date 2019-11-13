package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    private Playground playground;
    private Visitor youngVisitor;
    private Visitor oldVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        youngVisitor = new Visitor(5, 100, 20);
        oldVisitor = new Visitor(16, 180, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canAllowVisitor(){
        assertTrue(playground.isAllowedTo(youngVisitor));
    }

    @Test
    public void cantAllowVisitor(){
        assertFalse(playground.isAllowedTo(oldVisitor));
    }
}
