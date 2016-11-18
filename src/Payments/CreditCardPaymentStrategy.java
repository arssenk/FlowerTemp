package Payments;

import interfaces.IPayment;

/**
 * Created by Arsen on 18-Nov-16.
 */
public class CreditCardPaymentStrategy implements IPayment {

    @Override
    public double pay(double price) {
        return price;
    }
}
