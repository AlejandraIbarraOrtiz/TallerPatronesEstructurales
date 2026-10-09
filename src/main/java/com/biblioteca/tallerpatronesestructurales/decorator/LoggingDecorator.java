package com.biblioteca.tallerpatronesestructurales.decorator;


//Decorador de loggin

public class LoggingDecorator extends NotificationDecorator{
    public LoggingDecorator(NotificationService decoratedService) {
        super(decoratedService);
    }

    @Override
    public void send(String message) {
        System.out.println("  -> [Log] Registrando envío de notificación...");
        super.send(message);
    }
}
