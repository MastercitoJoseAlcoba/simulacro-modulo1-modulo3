package Apoyo_Diciembre2026.VC2P3_ArraySimple;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};

        // Llamamos al método y le pasamos el array como argumento
        mostrarArray(array);

    }

    public static void mostrarArray(int[] array) {
        // Recorremos el array y mostramos cada elemento desde la primera posición
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
