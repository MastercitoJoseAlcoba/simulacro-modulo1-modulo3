package Apoyo_Diciembre2026.VC2P2_Array02_Ayando_MayorYMenor;

public class Array02 {

    public static void main(String[] args) {
        int[] numeros = {4, -2, 9, 1};

        // Probamos los dos métodos.
        System.out.println("Mayor: " + encontrarMayor(numeros)
                + "\nMenor: " + encontrarMenor(numeros));
    }

    public static int encontrarMayor(int[] array) {
        // Validamos antes de acceder a la posición 0.
        if (array.length == 0) {
            throw new IllegalArgumentException("El array está vacío");
        }

        int mayor = array[0];

        // Empezamos en 1 porque ya usamos el primer elemento.
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        // Devolvemos el mayor después de recorrer todo el array.
        return mayor;
    }

    public static int encontrarMenor(int[] array) {
        // Validamos antes de acceder a la posición 0.
        if (array.length == 0) {
            throw new IllegalArgumentException("El array está vacío");
        }

        int menor = array[0];

        // Actualizamos el menor cada vez que encontramos uno más chico.
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        return menor;
    }
}