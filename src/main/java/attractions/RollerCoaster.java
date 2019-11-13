package attractions;


import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }



    @Override
    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            return this.defaultPrice() * 2;
        }
        return this.defaultPrice();
    }

    public boolean isAllowedTo (Visitor visitor) {
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        }
        return false;
    }
}




