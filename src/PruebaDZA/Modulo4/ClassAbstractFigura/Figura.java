package PruebaDZA.Modulo4.ClassAbstractFigura;

public abstract class Figura {
    // Atributo
    private String color;

    // Constructor
    public Figura(String color) {
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Métodos abstractos
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    // Método para imprimir información
    public void imprimirInformacion() {
        System.out.println("Color: " + color);
    }

    // Métodos para imprimir área y perímetro
    public void imprimirArea() {
        System.out.println("Área: " + calcularArea());
    }

    // Método para imprimir perímetro
    public void imprimirPerimetro() {
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
