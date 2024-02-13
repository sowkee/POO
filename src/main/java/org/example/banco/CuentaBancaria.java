package org.example.banco;

public class CuentaBancaria {

    private String numeroCuenta;
    private int balance;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, int balance) {
        this.numeroCuenta = numeroCuenta;
        this.balance = balance;
    }

    public void depositar(int dinero) {
        this.balance += dinero;
        System.out.println("El dinero fue depositado.");
    }

    public void retirar(int dinero) {
        this.balance -= dinero;
        System.out.println("El dinero fue retirado.");
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es: " + this.balance);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", balance=" + balance +
                '}';
    }
}
