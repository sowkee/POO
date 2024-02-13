package org.example.banco;

import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        String numCuenta = String.valueOf(generarNumeroAleatorio());
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numCuenta, 0);
        Cliente cliente = new Cliente("Juan", "Rodriguez", "123456789", cuentaBancaria);
        cuentaBancaria.depositar(2000);
        cuentaBancaria.retirar(300);
        cliente.mostrarInformacion();
        cuentaBancaria.consultarSaldo();
    }

    private static int generarNumeroAleatorio() {
        return random.nextInt();
    }
}
