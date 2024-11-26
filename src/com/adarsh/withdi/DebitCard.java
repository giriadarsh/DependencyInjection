package com.adarsh.withdi;

public class DebitCard implements PaymentMethod {
    @Override
    public void processTransaction() {
        System.out.println("Processing payment with Debit Card (With DI).");
    }
}
