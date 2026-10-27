package PruebaDZA.Modulo2.cuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000.0);
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
        System.out.println(cuenta1.toString());
    }
}
