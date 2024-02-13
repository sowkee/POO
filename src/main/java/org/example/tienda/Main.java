package org.example.tienda;

import org.example.tienda.factory.creators.ProductoCreator;
import org.example.tienda.factory.creators.impl.productos.BicicletaCreator;
import org.example.tienda.factory.creators.impl.productos.CamisetaCreator;
import org.example.tienda.factory.creators.impl.productos.PantalonCreator;
import org.example.tienda.factory.creators.impl.productos.ZapatosCreator;
import org.example.tienda.factory.products.Producto;
import org.example.tienda.factory.products.impl.pagos.Paypal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Producto> productos = getProductos();

        CarritoDeCompras carritoDeCompras = new CarritoDeCompras(productos);

        Cliente cliente = new Cliente(
                "Juan",
                "Rod",
                "123456789",
                "calle 45",
                carritoDeCompras);


        CheckIn checkIn = new CheckIn(
                "Pago",
                carritoDeCompras.sumarProductos(),
                new Date(),
                cliente,
                new Paypal());

        checkIn.imprimir();
    }

    private static List<Producto> getProductos() {
        ProductoCreator bicicletaCreator = new BicicletaCreator();
        ProductoCreator camisetaCreator = new CamisetaCreator();
        ProductoCreator pantalonCreator = new PantalonCreator();
        ProductoCreator zapatosCreator = new ZapatosCreator();

        //Productos
        List<Producto> productos = new ArrayList<>();
        Producto bici = bicicletaCreator.crearProducto(30000, new Inventario(30));
        productos.add(bici);
        Producto camiseta = camisetaCreator.crearProducto(28000, new Inventario(25));
        productos.add(camiseta);
        Producto pantalon = pantalonCreator.crearProducto(25000, new Inventario(20));
        productos.add(pantalon);
        Producto zapatos = zapatosCreator.crearProducto(18000, new Inventario(16));
        productos.add(zapatos);
        return productos;
    }
}
