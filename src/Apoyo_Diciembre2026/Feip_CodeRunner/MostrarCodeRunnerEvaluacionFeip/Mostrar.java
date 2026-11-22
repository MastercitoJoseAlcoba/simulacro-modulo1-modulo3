package Apoyo_Diciembre2026.Feip_CodeRunner.MostrarCodeRunnerEvaluacionFeip;

import java.util.List;

abstract class Figura {
    String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularArea();
}

class Rectangulo extends Figura {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super("Rectangulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}

public class Mostrar {
    public static void mostrarDatos(List<Figura> figuras) {
        double sumaAreas = 0.0;

        for (Figura figura : figuras) {
            System.out.println(figura.tipo);
            sumaAreas += figura.calcularArea();
        }

        System.out.println(sumaAreas);
    }
}
