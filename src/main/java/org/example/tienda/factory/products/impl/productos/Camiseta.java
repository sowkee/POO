package org.example.tienda.factory.products.impl.productos;

import org.example.tienda.Inventario;
import org.example.tienda.factory.products.Producto;

public class Camiseta implements Producto {
    private String nombreProducto = "Camiseta";
    private int precio;
    private Inventario inventario;

    public Camiseta(int precio, Inventario inventario) {
        this.precio = precio;
        this.inventario = inventario;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Inventario getInventario() {
        return inventario;
    }

    @Override
    public String imprimirProducto() {
        return "Camiseta{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", inventario=" + inventario +
                '}';
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "   nombreProducto='" + nombreProducto + '\'' + "\n" +
                "   precio=" + precio + "\n" +
                "   inventario=" + inventario + "\n" +
                '}';
    }
}
