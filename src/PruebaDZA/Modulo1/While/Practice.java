package PruebaDZA.Modulo1.While;

public class Practice {
    public static void main(String[] args) {
        int indice = 1; // Variable para almacenar el número actual en el bucle
        int suma = 0; // Variable para almacenar la suma de los números del 1 al 10 (Acumulador)

        while (indice <= 10) {
            System.out.println("Iteración " + indice);
            if (indice % 2 == 0) { // Si el número es par
                suma += indice; // suma = suma + indice
                System.out.println("Estoy en la iteración 5");
            }
            indice++; // Si no pones esto, el bucle se ejecutará infinitamente
        }
        System.out.println("Sali del while");
        System.out.println("La suma es: " + suma);
    }
}
