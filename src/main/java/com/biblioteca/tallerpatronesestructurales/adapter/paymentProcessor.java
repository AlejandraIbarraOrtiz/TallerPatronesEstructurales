package com.biblioteca.tallerpatronesestructurales.adapter;

public interface paymentProcessor {

    void processPayment(double amount);

    interface PaymentProcessor {
        void processPayment(double amount);
    }
}
