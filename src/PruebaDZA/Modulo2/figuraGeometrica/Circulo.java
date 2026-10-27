package PruebaDZA.Modulo2.figuraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    // Sobreescribir el método calcularArea() de la clase base
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circulo{");
        sb.append("radio=").append(radio);
        sb.append('}');
        return sb.toString();
    }
}
