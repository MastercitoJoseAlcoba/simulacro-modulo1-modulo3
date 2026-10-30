package PruebaDZA.Modulo4.ClassAbstractFigura;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double radio;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
