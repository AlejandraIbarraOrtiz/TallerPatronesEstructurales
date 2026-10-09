package com.biblioteca.tallerpatronesestructurales.adapter;

public class PaymentAdapter implements paymentProcessor{
    private ExternalPaymentService externalService;

    public PaymentAdapter(ExternalPaymentService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void processPayment(double amount) {
        externalService.makeTransaction(amount);
    }
}
