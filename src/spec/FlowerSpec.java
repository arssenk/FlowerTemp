package spec;

import enums.FlowerColor;
import parent.Spec;


/**
 * Created by Arsen on 24-Oct-16.
 */
public class FlowerSpec extends Spec{
    public boolean freshness;
    public FlowerSpec(FlowerColor color, double length, boolean freshness) {
        super(color, length);
        this.freshness = freshness;
    }

}
