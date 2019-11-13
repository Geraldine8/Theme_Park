import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;


import java.util.ArrayList;


public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;


    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void addAttractions(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList allReviewed = new ArrayList();
        for(Attraction attraction : attractions ){
            if(attraction instanceof IReviewed){
                allReviewed.add(attraction);
            }
        }

        for(Stall stall : stalls ){
            if(stall instanceof IReviewed){
                allReviewed.add(stall);
            }
        }

        return allReviewed;
    }




}
