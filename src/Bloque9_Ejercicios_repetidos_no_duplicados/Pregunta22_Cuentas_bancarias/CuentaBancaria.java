package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta22_Cuentas_bancarias;

class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double calcularInteres(int meses) {

        // La clase base no define interés real.
        // Las hijas lo sobrescriben.
        return 0;
    }

    public double calcularSaldoFinal(int meses) {

        // Saldo final = saldo + interés.
        return saldo + calcularInteres(meses);
    }
}

class CajaAhorro extends CuentaBancaria {

    public CajaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularInteres(int meses) {

        // Caja de ahorro:
        // 2% mensual.
        return getSaldo() * 0.02 * meses;
    }
}

class PlazoFijo extends CuentaBancaria {

    public PlazoFijo(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularInteres(int meses) {

        // Plazo fijo:
        // 5% mensual.
        return getSaldo() * 0.05 * meses;
    }
}

/*
EJEMPLO:

CajaAhorro:
saldo = 1000
meses = 3

interés = 1000 * 0.02 * 3 = 60
saldo final = 1060

PlazoFijo:
interés = 1000 * 0.05 * 3 = 150
saldo final = 1150

IDEA CLAVE:

CuentaBancaria es la clase padre.
CajaAhorro y PlazoFijo heredan.
Cada hija sobrescribe calcularInteres().
*/