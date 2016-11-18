package spec;

import enums.FlowerColor;
import enums.FlowerType;

/**
 * Created by Arsen on 23-Oct-16.
 */
public abstract class Spec {
    private FlowerColor color;
    private int length;
    private double price;

    public Spec(FlowerColor color, int length, double price) {
        this.color = color;
        this.length = length;
        this.price = price;
    }
    public abstract String getType();
    public FlowerColor getColor() {
        return this.color;
    }

    public double getLength(){
        return this.length;
    }
    public double getPrice(){
        return this.price;
    }
}

