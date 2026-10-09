package com.biblioteca.tallerpatronesestructurales.adapter;

public class ExternalPaymentService {

    public void makeTransaction(double value) {
        System.out.println("  -> [Pago] Transacción externa completada por: $" + value);
    }
}
