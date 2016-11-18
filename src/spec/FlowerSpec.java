package spec;

import enums.FlowerColor;


/**
 * Created by Arsen on 24-Oct-16.
 */
public class FlowerSpec extends Spec{
    public boolean freshness;


    public FlowerSpec(FlowerColor color, int length, double price, boolean freshness) {
        super(color, length, price);
        this.freshness = freshness;
    }
    @Override
    public String getType(){
        return "Flower";
    }
}
