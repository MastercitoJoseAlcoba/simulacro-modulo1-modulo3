package Apoyo_Diciembre2026.VC1P2_POO;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(1000.0);
        c1.depositar(500);
        c1.retirar(200);
        System.out.println("Saldo actual: " + c1.getSaldo());

        CuentaBancaria c2 = new CuentaBancaria(500.0);
        c2.depositar(300);
        c2.retirar(100);
        System.out.println("Saldo actual: " + c2.getSaldo());

        CuentaBancaria c3 = new CuentaBancaria(200.0);
        c3.depositar(100);
        c3.retirar(600); // Intento de retiro invalido por saldo insuficiente
        System.out.println("Saldo actual: " + c3.getSaldo());

        CuentaBancaria c4 = new CuentaBancaria(1000.0);
        c4.depositar(-500); // Intento de depósito invalido por monto negativo
        System.out.println("Saldo actual: " + c4.getSaldo());
    }
}
