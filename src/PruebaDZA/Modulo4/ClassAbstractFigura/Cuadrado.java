package PruebaDZA.Modulo4.ClassAbstractFigura;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}
