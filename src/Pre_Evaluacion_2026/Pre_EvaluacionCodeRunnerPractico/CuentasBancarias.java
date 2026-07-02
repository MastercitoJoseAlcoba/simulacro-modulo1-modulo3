package Pre_Evaluacion_2026.Pre_EvaluacionCodeRunnerPractico;

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
        return 0;
    }

    public double calcularSaldoFinal(int meses) {
        return saldo + calcularInteres(meses);
    }
}

class CajaAhorro extends CuentaBancaria {

    public CajaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularInteres(int meses) {
        double tasa = 0.02;
        return getSaldo() * tasa * meses;
    }
}

class PlazoFijo extends CuentaBancaria {

    public PlazoFijo(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularInteres(int meses) {
        double tasa = 0.05;
        return getSaldo() * tasa * meses;
    }
}