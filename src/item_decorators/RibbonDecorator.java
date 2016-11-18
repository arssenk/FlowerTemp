package item_decorators;

import interfaces.Item;

/**
 * Created by Arsen on 17-Nov-16.
 */
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }


    public double getPrice() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return "Decorated with ribbon";
    }

    @Override
    public double price() {
        return item.price();
    }
}
