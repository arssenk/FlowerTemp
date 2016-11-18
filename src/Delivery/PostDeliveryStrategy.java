package Delivery;

import interfaces.IDelivery;
import interfaces.Item;

import java.util.LinkedList;

/**
 * Created by Arsen on 18-Nov-16.
 */
public class PostDeliveryStrategy implements IDelivery {

    @Override
    public String deliver(LinkedList<Item> items) {
        String finalList = "";
        for (Item item: items){
            finalList += item.getDescription();
        }

        return finalList;
    }
}
