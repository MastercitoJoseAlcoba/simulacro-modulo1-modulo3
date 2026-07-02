package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_Arrays;

public class EncontrarMayorMenorArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Mayor elemento: " + encontrarMayor(array));
        System.out.println("Menor elemento: " + encontrarMenor(array));

    }

    public static int encontrarMayor(int[] array) {
        // Verifica si el array no está vacío
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        // Inicializa el mayor elemento como el primer elemento del array
        int mayor = array[0];

        // Itera sobre los elementos del array para encontrar el mayor
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        // Devuelve el mayor elemento encontrado
        return mayor;
    }

    public static int encontrarMenor(int[] array) {
// Verifica si el array no está vacío
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        // Inicializa el menor con el primer elemento del array
        int menor = array[0];

        // Utiliza un bucle para encontrar el valor menor
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        // Devuelve el valor menor encontrado
        return menor;
    }

}




