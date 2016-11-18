package enums;

public enum FlowerType {
    /*Enum stangs for the type of flower*/
    ROMASHKA, MAK, VOLOSHKA, TULPAN, TROYANDA;

    public String toString() {
        switch (this) {
            case ROMASHKA:
                return  "Romashka";
            case MAK:
                return "Mak";
            case VOLOSHKA:
                return "Voloshka";
            case TULPAN:
                return "Tulpan";
            case TROYANDA:
                return "Troyanda";
            default:
                return  "No type";
        }
    }
}