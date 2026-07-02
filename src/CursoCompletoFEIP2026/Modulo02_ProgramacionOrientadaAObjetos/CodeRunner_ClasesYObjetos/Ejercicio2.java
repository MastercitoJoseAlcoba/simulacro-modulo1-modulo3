package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_ClasesYObjetos;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Instrucciones:
         * 1. Implemente la clase CuentaBancaria respetando los atributos y métodos indicados.
         * 2. Los atributos deben ser privados.
         * 3. Utilice métodos getters y setters para acceder y modificar los valores de los atributos.
         * 4. Implemente un constructor que inicialice el nombre del cliente y el saldo inicial.
         * 5. Asegurese de validar correctamente las operaciones de déposito y retiro.
         */

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000.0);
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
        System.out.println(cuenta1.toString());

    }
    public static class CuentaBancaria {
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
                System.out.println("Depósito de " + cantidad + " realizado con éxito.");
            }
        }

        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo){
                saldo -= cantidad;
                System.out.println("Retiro de " + cantidad + " realizado con éxito.");
            }
        }

        @Override
        public String toString() {
            return "Cuenta de " + nombreCliente + ", Saldo: " + saldo;

        }
    }

}
