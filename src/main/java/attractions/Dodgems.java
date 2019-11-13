package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 16.80;
    }


    public double getHalfPrice(Visitor visitor) {
        if(visitor.getAge() <= 12 ){
            return defaultPrice() / 2;
        }
        return defaultPrice();
    }
}
