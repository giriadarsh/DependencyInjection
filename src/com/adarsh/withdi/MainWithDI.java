package com.adarsh.withdi;

import com.adarsh.withdi.PaymentProcessor;
import com.adarsh.withdi.DebitCard;
import com.adarsh.withdi.CreditCard;

public class MainWithDI {
    public static void main(String[] args) {
        // Using dependency injection to pass the payment method
        PaymentProcessor paymentProcessor = new PaymentProcessor(new DebitCard());
        paymentProcessor.processPayment();

        // Switch to CreditCard without changing PaymentProcessor logic
        paymentProcessor = new PaymentProcessor(new CreditCard());
        paymentProcessor.processPayment();
    }
}
