package com.biblioteca.tallerpatronesestructurales.decorator;

// Implementación base
public class BasicNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("  -> [Notificación] Enviando: " + message);
    }
}
