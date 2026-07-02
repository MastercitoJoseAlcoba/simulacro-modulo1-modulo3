package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_Arrays;

public class SumarElementosArray {
    public static int sumarElementos(int[] array) {
        // Inicializa la suma en cero
        int suma = 0;

        // Recorre el array y suma sus elementos
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }

        // Devuelve la suma calculada
        return suma;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int suma = sumarElementos(array);
        System.out.println("La suma de los elementos del array es: " + suma);
    }
}


