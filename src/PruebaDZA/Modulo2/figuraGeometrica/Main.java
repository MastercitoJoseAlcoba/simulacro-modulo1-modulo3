package PruebaDZA.Modulo2.figuraGeometrica;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Calcular Área ---");
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "Rojo", 5, 10);
        System.out.println(rectangulo);
        System.out.println("Área: " + rectangulo.calcularArea());

        System.out.println("-".repeat(20));

        Circulo circulo = new Circulo("Circulo", "Azul", 3);
        System.out.println(circulo);
        System.out.println("Área: " + circulo.calcularArea());
    }
}
