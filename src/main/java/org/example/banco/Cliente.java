package org.example.banco;

public class Cliente {
    private String nombre;
    private String apellido;
    private String identificacion;
    private CuentaBancaria cuentaBancaria;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String identificacion, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.cuentaBancaria = cuentaBancaria;
    }

    public void mostrarInformacion() {
        String res = "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", cuentaBancaria=" + cuentaBancaria.toString() +
                '}';
        System.out.println(res);
    }
}
