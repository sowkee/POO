package org.example.tienda.factory.creators.impl.pagos;

import org.example.tienda.factory.creators.PagoCreator;
import org.example.tienda.factory.products.Pago;
import org.example.tienda.factory.products.impl.pagos.Paypal;

public class MercadoPagoCreator implements PagoCreator {
    @Override
    public Pago crearPago() {
        return new Paypal();
    }
}
