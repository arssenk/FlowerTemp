package parent;

import enums.FlowerColor;
import spec.Spec;

/**
 * Created by matt on 10/3/16.
 */
public abstract class Flower {


    protected Spec spec;

    public Flower(Spec spec) {
        this.spec = spec;
    }

    double price(){
        return spec.getPrice();
    }
    public double getPrice() {
        return this.price();
    }
    public double getLength() {
        return this.spec.getLength();
    }
    public FlowerColor getColor() {
        return this.spec.getColor();
    }

    public String getType(){
        return this.spec.getType();
    }


    public String toString() {
        return "Price:  " + String.valueOf(getPrice()) + ", Type is: " +  this.spec.getType()+ ", Color is " + getColor() + ", Height: " + String.valueOf(getLength());
    }

}
