package spec;

import enums.FlowerColor;
import parent.Spec;

/**
 * Created by Arsen on 24-Oct-16.
 */
public class CactusSpec extends Spec {
    public double  spinesLength;
    public boolean sharpness;

    public CactusSpec(FlowerColor color, double length, double spinesLength, boolean sharpness) {
        super(color, length);
        this.spinesLength = spinesLength;
        this.sharpness = sharpness;
    }
}
