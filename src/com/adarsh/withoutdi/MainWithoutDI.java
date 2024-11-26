package com.adarsh.withoutdi;

public class MainWithoutDI {
    public static void main(String[] args) {
        PaymentServiceWithoutDI paymentService = new PaymentServiceWithoutDI();
        paymentService.makePaymentUsingDebitCard();
        paymentService.makePaymentUsingCreditCard();
    }
}
