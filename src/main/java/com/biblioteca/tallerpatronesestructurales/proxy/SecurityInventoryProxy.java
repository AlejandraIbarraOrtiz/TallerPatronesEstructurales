package com.biblioteca.tallerpatronesestructurales.proxy;

public class SecurityInventoryProxy implements InventoryService{
    private RealInventoryService realInventoryService;
    private boolean hasAccess;

    public SecurityInventoryProxy(boolean hasAccess) {
        this.realInventoryService = new RealInventoryService();
        this.hasAccess = hasAccess;
    }

    @Override
    public boolean checkStock(String product) {
        System.out.println("  -> [Proxy] Verificando permisos de acceso al inventario...");
        if (!hasAccess) {
            System.out.println("  -> [Proxy] ACCESO DENEGADO: No tienes permisos.");
            return false;
        }
        return realInventoryService.checkStock(product);
    }
}
