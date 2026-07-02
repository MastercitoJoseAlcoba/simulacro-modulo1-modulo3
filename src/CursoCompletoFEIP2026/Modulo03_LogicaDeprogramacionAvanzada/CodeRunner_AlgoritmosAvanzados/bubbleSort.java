package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_AlgoritmosAvanzados;

public class bubbleSort {
    public static void main(String[] args) {
        /**
         * Requisitos:
         * 1. Crear una clase llamada OrdenamientoBurbuja.
         * 2. Implementar un método estático ordenarSeleccion.
         *
         * Instrucciones:
         * 1. El método debe recibir un array de números enteros.
         * 2. Ordene el array de menro a mayor utilizando el algoritmo de selección.
         * 3. Para cada posición del array.
         *    a. Busque el elemento más pequeño en la parte no ordenada.
         *    b. Intercámbielo con el elemento actual.
         * 4. Utilice bucles y comparaciones para realizar el ordenamiento.
         */

        int[] array = {1, 5, 2, 4, 3};
        bubbleSort(array);
        System.out.println(array);
    }
    public static void bubbleSort(int[] array){
        int n = array.length;

        /** Recorre el array desde la primera posición hasta la penúltima. */
        for (int i = 0; i < n-1; i++) {

            /** Supongamos que el mínimo está en la posición i */
            int indiceMinimo = i;

            /** Busca el número más chico desde i + 1 hasta el final del array. */
            for (int j = 0; j < n-i-1; j++) {

                /** Si encuentra un número menor, guarda si índice */
                if (array[j] > array[j+1]) {

                    /** Intercambia los elementos */
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


}
