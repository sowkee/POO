package org.example.tienda.factory.creators.impl.productos;

import org.example.tienda.Inventario;
import org.example.tienda.factory.creators.ProductoCreator;
import org.example.tienda.factory.products.Producto;
import org.example.tienda.factory.products.impl.productos.Bicicleta;

public class BicicletaCreator implements ProductoCreator {
    @Override
    public Producto crearProducto(int precio, Inventario inventario) {
        return new Bicicleta(precio, inventario);
    }
}
