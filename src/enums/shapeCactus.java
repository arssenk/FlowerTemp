package enums;

/**
 * Created by Arsen on 24-Oct-16.
 */
public enum shapeCactus {
    ROUND, STRAIGHT,RECTANGLE;
    public String toString(){
        switch (this){
            case ROUND:
                return "Round";
            case STRAIGHT:
                return "Strainght";
            case RECTANGLE:
                return "Recyangle";
            default:
                return "No shape";
        }
    }
}
