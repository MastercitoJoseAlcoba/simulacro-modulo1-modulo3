package PruebaDZA.Modulo2.figuraGeometrica;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Sobreescribir el método calcularArea() de la clase base
    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangulo{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

}
