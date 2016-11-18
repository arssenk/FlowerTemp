package item_decorators;

import interfaces.Item;

/**
 * Created by Arsen on 17-Nov-16.
 */
public class PaperDecorator extends ItemDecorator{

    public PaperDecorator(Item item) {
        super(item);
    }
    @Override
    public String getDescription(){
        return "Item with paper " + this.getPrice()+ " " + item.toString();
    }

    @Override
    public double price() {
        return item.price();
    }

    double getPrice(){
        return 13 + item.price();
    }
}