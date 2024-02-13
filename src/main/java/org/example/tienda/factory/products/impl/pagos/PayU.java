package org.example.tienda.factory.products.impl.pagos;

import org.example.tienda.factory.products.Pago;

public class PayU implements Pago {
    @Override
    public void crearMetodoDePago(int dinero) {
        System.out.println("Pago por: " + dinero + " realizado con exito por PayU.");
    }
}
