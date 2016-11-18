import Delivery.DHLDeliveryStrategy;
import Payments.PayPalPaymentStrategy;
import enums.FlowerColor;
import item_decorators.BasketDecorator;
import item_decorators.PaperDecorator;
import item_decorators.RibbonDecorator;
import order.Order;
import spec.CactusSpec;
import spec.FlowerSpec;

import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();

        CactusFlower cactus_1 = new CactusFlower(new CactusSpec(FlowerColor.GREEN, 7, 15, 3, true));
        RomashkaFlower romashka_1 = new RomashkaFlower(new FlowerSpec(FlowerColor.BLUE, 5, 15, false));
        bucket.addFlower(cactus_1);
        bucket.addFlower(romashka_1);
        RibbonDecorator ribbon = new RibbonDecorator(bucket);
        PaperDecorator paper = new PaperDecorator(bucket);
        BasketDecorator basket = new BasketDecorator(bucket);
        Order order = new Order();
        order.addItem(ribbon);
        order.addItem(paper);
        order.addItem(basket);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        order.processOrder();


    }
}
