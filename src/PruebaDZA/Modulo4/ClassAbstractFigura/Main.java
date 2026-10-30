package PruebaDZA.Modulo4.ClassAbstractFigura;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Rojo", 3, 4);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        Cuadrado cuadrado = new Cuadrado("Azul", 5);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        ArrayList<Object> listaFiguras = new ArrayList<>();
        listaFiguras.add(triangulo);
        listaFiguras.add(cuadrado);
        System.out.println("Lista de figuras: " + listaFiguras);

        for (Object f : listaFiguras) {
            System.out.println(f);

            System.out.println("Área de la figura: " + ((Figura)f).calcularArea());
            System.out.println("Perímetro de la figura: " + ((Figura)f).calcularPerimetro());

            System.out.println(triangulo instanceof Figura); // true
            System.out.println(cuadrado instanceof Figura); // true

        }

        listaFiguras.remove(triangulo);
        System.out.println(listaFiguras);

    }
}
