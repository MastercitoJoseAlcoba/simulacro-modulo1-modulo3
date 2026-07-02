package Espacio_De_Practicas.CodeRunner02.Pregunta02;

public class Main {
    public static void main(String[] args) {

        Vuelo v1 = new Vuelo("UY123", "Montevideo", "Buenos Aires", 15000.0, 120);
        System.out.println(v1.toString());

        Vuelo v2 = new Vuelo("UY124", "Durazno", "Salto", 100);
        v2.agregarPasajero();
        v2.agregarPasajero();
        System.out.println(v2.toString());

        Vuelo v3 = new Vuelo("UY125", "Colonia", "Rivera", 18000.0);
        System.out.println(v3.toString());
    }
}
