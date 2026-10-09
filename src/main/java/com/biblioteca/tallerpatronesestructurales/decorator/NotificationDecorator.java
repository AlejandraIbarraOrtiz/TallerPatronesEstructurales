package com.biblioteca.tallerpatronesestructurales.decorator;

// Decorador abstracto
public abstract class NotificationDecorator implements NotificationService{
    protected NotificationService decoratedService;

    public NotificationDecorator(NotificationService decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public void send(String message) {
        decoratedService.send(message);
    }
}
