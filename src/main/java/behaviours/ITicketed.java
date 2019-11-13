package behaviours;

import people.Visitor;

public interface ITicketed {
    //ITicketed promises double defaultPrice() and double priceFor(Visitor)

    public double defaultPrice();
    public double priceFor(Visitor visitor);
}
