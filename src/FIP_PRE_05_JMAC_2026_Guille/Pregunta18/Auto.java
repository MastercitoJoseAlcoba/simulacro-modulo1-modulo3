package FIP_PRE_05_JMAC_2026_Guille.Pregunta18;

public class Auto {
    String marca;
    String color;

    Auto(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    Auto() {
        this("Sin marca", "Sin color");
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    void acelerar() {
        System.out.println("Acelerando");
    }

    void frenar() {
        System.out.println("Frenando");
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
    }
}