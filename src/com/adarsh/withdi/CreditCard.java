package com.adarsh.withdi;

public class CreditCard implements PaymentMethod {
    @Override
    public void processTransaction() {
        System.out.println("Processing payment with Credit Card (With DI).");
    }
}
