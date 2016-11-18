package item_decorators;

import interfaces.Item;

/**
 * Created by Arsen on 17-Nov-16.
 */
public abstract class ItemDecorator implements Item{
    protected Item item;

    public ItemDecorator(Item item){
        this.item = item;
    }

    public abstract String getDescription();

}
