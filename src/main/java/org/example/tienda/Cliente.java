package org.example.tienda;

public class Cliente {
    private String nombre;
    private String apellido;
    private String identificacion;
    private String direccion;
    private CarritoDeCompras productos;

    public Cliente(String nombre, String apellido, String identificacion, String direccion, CarritoDeCompras productos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.productos = productos;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CarritoDeCompras getProductos() {
        return productos;
    }

    public void setProductos(CarritoDeCompras productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "   nombre='" + nombre + '\'' + "\n" +
                "   apellido='" + apellido + '\'' + "\n" +
                "   identificacion='" + identificacion + '\'' + "\n" +
                "   direccion='" + direccion + '\'' + "\n" +
                "   productos=" + productos + "\n" +
                '}';
    }
}
