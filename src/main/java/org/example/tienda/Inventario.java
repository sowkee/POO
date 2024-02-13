package org.example.tienda;

public class Inventario {
    private int cantidad;

    public Inventario(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void cantidadTotal(int cantidad) {
        int total = this.cantidad - cantidad;
        System.out.println("Quedan: " + total + "disponibles.");
    }

    @Override
    public String toString() {
        return "Inventario {" +
                "cantidad: " + cantidad +
                '}';
    }
}
