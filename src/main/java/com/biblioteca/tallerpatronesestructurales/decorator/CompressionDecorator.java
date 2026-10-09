package com.biblioteca.tallerpatronesestructurales.decorator;


// Decorador de comprensión
public class CompressionDecorator extends NotificationDecorator{
    public CompressionDecorator(NotificationService decoratedService) {
        super(decoratedService);
    }

    @Override
    public void send(String message) {
        String compressed = "[Comprimido](" + message + ")";
        super.send(compressed);
    }
}
