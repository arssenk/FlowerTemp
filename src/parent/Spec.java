package parent;

import enums.FlowerColor;

/**
 * Created by Arsen on 23-Oct-16.
 */
public abstract class Spec {
    protected FlowerColor color;

    protected double length;

    public Spec(FlowerColor color, double length) {
        this.color = color;
        this.length = length;
    }

    protected FlowerColor getColor() {
        return this.color;
    }
    protected double getLength(){
        return this.length;
    }
}
