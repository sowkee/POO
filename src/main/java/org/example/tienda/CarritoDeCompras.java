package org.example.tienda;

import org.example.tienda.factory.products.Producto;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos;

    public CarritoDeCompras(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void eliminarProductor() {
        this.productos.clear();
        System.out.println("Se limpio el carrito.");
    }

    public int sumarProductos() {
        return productos.stream().mapToInt(Producto::getPrecio).sum();
    }

    @Override
    public String toString() {
        return "CarritoDeCompras{" +
                "productos=" + productos +
                '}';
    }
}
