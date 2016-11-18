package order;

import interfaces.IDelivery;
import interfaces.IPayment;
import interfaces.Item;

import java.util.LinkedList;

/**
 * Created by Arsen on 18-Nov-16.
 */
public class Order {
    LinkedList<Item> items = new LinkedList<>();
    IPayment payment;
    IDelivery delivery;

    public void setPaymentStrategy(IPayment currPayment){
        this.payment = currPayment;
    }
    public void setDeliveryStrategy(IDelivery currDelivery){
        this.delivery = currDelivery;
    }
    public double calculateTotalPrice(){
        double sum = 0;
        for (Item item: this.items){
            sum += item.price();
        }
        System.out.println("Total price of order: " + sum);
        return sum;
    }
    public void processOrder(){
        payment.pay(this.calculateTotalPrice());
        delivery.deliver(this.items);
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

}
