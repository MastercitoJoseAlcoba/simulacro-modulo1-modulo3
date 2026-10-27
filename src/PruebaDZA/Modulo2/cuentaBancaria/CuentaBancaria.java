package PruebaDZA.Modulo2.cuentaBancaria;

public class CuentaBancaria {
    private String nombreCliente;
    private double saldo;

    public CuentaBancaria(String nombreCliente, double saldo) {
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Déposito de " + cantidad + " realizado on éxito.");
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado on éxito.");
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero y no puede ser mayor que el saldo disponible.");
        }
    }

    public String toString() {
        return "Cuenta de " + nombreCliente + ", Saldo: " + saldo;
    }
}
