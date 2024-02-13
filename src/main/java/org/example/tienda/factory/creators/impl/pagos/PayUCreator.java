package org.example.tienda.factory.creators.impl.pagos;

import org.example.tienda.factory.creators.PagoCreator;
import org.example.tienda.factory.products.Pago;
import org.example.tienda.factory.products.impl.pagos.PayU;

public class PayUCreator implements PagoCreator {
    @Override
    public Pago crearPago() {
        return new PayU();
    }
}
