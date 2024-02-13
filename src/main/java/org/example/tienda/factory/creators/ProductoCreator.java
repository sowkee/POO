package org.example.tienda.factory.creators;

import org.example.tienda.Inventario;
import org.example.tienda.factory.products.Producto;

public interface ProductoCreator {
    Producto crearProducto(int precio, Inventario inventario);
}
