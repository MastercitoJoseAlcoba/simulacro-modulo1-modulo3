package Apoyo_Diciembre2026.VC1P7_POO_Interfaz;

public interface Dibujable {
    String dibujar();
}

class Circulo implements Dibujable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String dibujar() {
        return "Dibujando círculo de radio " + radio;
    }
}

class Cuadrado implements Dibujable {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String dibujar() {
        return "Dibujando cuadrado de lado " + lado;
    }
}


