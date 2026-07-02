package CursoCompletoFEIP2026.Pre_EvaluacionCodeRunnerPractico;

import java.util.List;

abstract class Auto {
    private double kilometros;
    private double costoPorKilometro;

    public Auto(double kilometros, double costoPorKilometro) {
        this.kilometros = kilometros;
        this.costoPorKilometro = costoPorKilometro;
    }

    public double getKilometros() {
        return kilometros;
    }

    public double getCostoPorKilometro() {
        return costoPorKilometro;
    }

    public abstract double calcularConsumo();
}

class AutoNafta extends Auto {

    public AutoNafta(double kilometros, double costoPorKilometro) {
        super(kilometros, costoPorKilometro);
    }

    @Override
    public double calcularConsumo() {
        return getKilometros() * getCostoPorKilometro();
    }
}

class AutoHibrido extends Auto {

    public AutoHibrido(double kilometros, double costoPorKilometro) {
        super(kilometros, costoPorKilometro);
    }

    @Override
    public double calcularConsumo() {
        double consumoBase = getKilometros() * getCostoPorKilometro();
        return consumoBase * 0.70; // aplica 30% de ahorro
    }
}

class AutoElectrico extends Auto {

    public AutoElectrico(double kilometros, double costoPorKilometro) {
        super(kilometros, costoPorKilometro);
    }

    @Override
    public double calcularConsumo() {
        double consumoBase = getKilometros() * getCostoPorKilometro();
        return consumoBase * 0.50; // aplica 50% de ahorro
    }
}

class Mostrar {

    public static void mostrarDatos(List<Auto> autos) {
        double totalConsumos = 0;

        for (Auto auto : autos) {
            double consumo = auto.calcularConsumo();

            if (auto instanceof AutoNafta) {
                System.out.println("Tipo: AutoNafta");
            } else if (auto instanceof AutoHibrido) {
                System.out.println("Tipo: AutoHibrido");
            } else if (auto instanceof AutoElectrico) {
                System.out.println("Tipo: AutoElectrico");
            }

            System.out.println("Consumo: $" + consumo);
            totalConsumos += consumo;
        }

        System.out.println("Total de consumos: $" + totalConsumos);
    }
}