package com.biblioteca.tallerpatronesestructurales.proxy;

public class RealInventoryService implements InventoryService{
    @Override
    public boolean checkStock(String product) {
        System.out.println("  -> [Inventario] Verificando stock real para: " + product);
        return true; // Simula que siempre hay stock
    }
}
