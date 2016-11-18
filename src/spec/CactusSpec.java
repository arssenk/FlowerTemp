package spec;

import enums.FlowerColor;
import enums.FlowerType;

/**
 * Created by Arsen on 24-Oct-16.
 */
public class CactusSpec extends Spec {
    public double  spinesLength;
    public boolean sharpness;


    public CactusSpec(FlowerColor color, int length, double price, double spinesLength, boolean sharpness) {
        super(color, length, price);
        this.sharpness = sharpness;
        this.spinesLength = spinesLength;
    }
    @Override
    public String getType(){
        return "Cactus";
    }
}
