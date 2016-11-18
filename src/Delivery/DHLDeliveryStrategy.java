package Delivery;

import interfaces.IDelivery;
import interfaces.Item;

import java.util.LinkedList;

/**
 * Created by Arsen on 18-Nov-16.
 */
public class DHLDeliveryStrategy implements IDelivery {
    @Override
    public String deliver(LinkedList<Item> items) {
        String finalDHLList = "";
        for (Item item: items){
            finalDHLList += item.getDescription();
        }

        return finalDHLList;
    }
}
