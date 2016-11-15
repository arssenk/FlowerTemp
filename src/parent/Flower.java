package parent;

import enums.FlowerColor;

/**
 * Created by matt on 10/3/16.
 */
public abstract class Flower {

    protected boolean fresh;
    protected double price;
    protected Spec spec;

    public Flower(Spec spec, boolean fresh, double price) {
        this.spec = spec;
        this.fresh = fresh;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
    public double getLength() {
        return this.spec.getLength();
    }
    public FlowerColor getColor() {
        return this.spec.getColor();
    }
    public boolean isFresh() {
        return fresh;
    }


    public String toString() {
        return "Price:  " + String.valueOf(getPrice()) + ", Color is " + getColor() + ", Freshness level is " +
                String.valueOf(isFresh()) + ", Height: " + String.valueOf(getLength());
    }

}
