package com.adarsh.withoutdi;

public class PaymentServiceWithoutDI {
    private DebitCard debitCard = new DebitCard();
    private CreditCard creditCard = new CreditCard();

    public void makePaymentUsingDebitCard() {
        debitCard.processTransaction();
    }

    public void makePaymentUsingCreditCard() {
        creditCard.processTransaction();
    }
}
