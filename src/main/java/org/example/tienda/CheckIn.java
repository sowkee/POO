package org.example.tienda;

import org.example.tienda.factory.products.Pago;

import java.util.Date;

public class CheckIn {
    private String estado;
    private int precioTotal;
    private Date fechaPago;
    private Cliente cliente;

    private Pago metodoDePago;

    public CheckIn(String estado, int precioTotal, Date fechaPago, Cliente cliente, Pago metodoDePago) {
        this.estado = estado;
        this.precioTotal = precioTotal;
        this.fechaPago = fechaPago;
        this.cliente = cliente;
        this.metodoDePago = metodoDePago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Pago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(Pago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CheckIn {" +
                "   estado='" + estado + '\'' + "\n" +
                "   precioTotal=" + precioTotal + "\n" +
                "   fechaPago=" + fechaPago + "\n" +
                "   cliente=" + cliente + "\n" +
                '}';
    }


}
