package org.example.tienda.factory.creators.impl.productos;

import org.example.tienda.Inventario;
import org.example.tienda.factory.creators.ProductoCreator;
import org.example.tienda.factory.products.Producto;
import org.example.tienda.factory.products.impl.productos.Zapatos;

public class ZapatosCreator implements ProductoCreator {
    @Override
    public Producto crearProducto(int precio, Inventario inventario) {
        return new Zapatos(precio, inventario);
    }
}
