package Apoyo_Diciembre2026.VC1P2_POO;

public class CuentaBancaria {
    // Atributos
    private double saldo;

    // Constructor
    public CuentaBancaria () {
        this.saldo = 0.0;
    }
    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    // Métodos
    public double getSaldo() {
        return saldo;
    }

    // Método depositar
    public void depositar(double monto) {
        saldo += monto; // saldo = saldo + monto
    }

    // Método retirar
    public void retirar(double monto) {
        // Se usa un && porque deben cumplirse ambas condiciones
        if (monto >= 0 && monto <= saldo) { // (si el monto es mayor que 0.0 y menor o igual al saldo actual)
            saldo -= monto; // saldo = saldo - monto
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
