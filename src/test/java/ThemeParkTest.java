import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;


public class ThemeParkTest {

    private ThemePark themePark;
    private RollerCoaster rollerCoaster;
    private Dodgems dodgems;
    private Playground playground;
    private Visitor visitor;
    private IceCreamStall iceCreamStall;
    private CandyflossStall candyflossStall;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Blue Ridge", 9);
        dodgems = new Dodgems("Bumper Cars", 6);
        playground = new Playground("Fun Zone", 5);
        visitor = new Visitor(18, 180, 40);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 9);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 7);
        themePark = new ThemePark();


    }

    @Test
    public void addAttraction() {
        themePark.addAttractions(rollerCoaster);
        themePark.addAttractions(dodgems);
        assertEquals(2, themePark.getAttractions().size());
    }

    @Test
    public void addStall(){
        themePark.addStall(iceCreamStall);
        themePark.addStall(candyflossStall);
        assertEquals(2, themePark.getStalls().size());
    }

    @Test
    public void getAllReviewed(){
        themePark.addAttractions(rollerCoaster);
        themePark.addAttractions(playground);
        themePark.addStall(candyflossStall);
        assertEquals(2, themePark.getAllReviewed().size());
    }




//    @Test
//    public void canGetReviewAttractions(){
//        IReviewed = new ThemePark();
//
//    }
}
