package org.example.tienda.factory.products.impl.productos;

import org.example.tienda.Inventario;
import org.example.tienda.factory.products.Producto;

public class Pantalon implements Producto {
    private String nombreProducto = "Pantalon";
    private int precio;
    private Inventario inventario;

    public Pantalon(int precio, Inventario inventario) {
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

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String imprimirProducto() {
        return "Pantalon{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", inventario=" + inventario +
                '}';
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "   nombreProducto='" + nombreProducto + '\'' + "\n" +
                "   precio=" + precio + "\n" +
                "   inventario=" + inventario + "\n" +
                '}';
    }
}
