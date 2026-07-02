package CursoCompletoFEIP2026.Modulo03_LogicaDeprogramacionAvanzada.CodeRunner_AlgoritmosAvanzados;

public class ordenamientoBurbuja {
    public static void main(String[] args) {
        /**
         * Pregunta 1
         * Requisitos:
         * 1. Crear una clase llamada OrdenamientoBurbuja.
         * 2. implementar un método estático ordenarBurbuja.
         *
         * Instrucciones:
         * 1. El método debe recibir un array de números enteros.
         * 2. Ordene el array de menor a mayor utilizando el algoritmo de burbuja.
         * 3. Compare elementos adyacentes del array para verificar el orden.
         * 4. Si un elemento es mayor que el siguiente, intercambie los elementos.
         * 5. Repita el proceso hasta que no se haya realizado un intercambio.
         *
         * Consideraciones:
         * 1. Utilice una variable auxiliar para realizar los intercambios.
         * 2. Puede utilizar una variable booleana para controlar si se realizaron cambios en cada iteración.
         * 3. El ordenamiento se realiza en el array original.(in-place).
         * 4. El método no debe retorna ningún valor.
         */

        int[] miArray = {64, 32, 25, 12, 22, 11, 90};

        ordenarBurbuja(miArray);

        System.out.println(java.util.Arrays.toString(miArray));
    }

    public static void ordenarBurbuja(int[] miArray) {
        boolean intercambio;

        // Itera sobre el array para ordenarlo
        for (int i = 0; i < miArray.length - 1; i++) {
            intercambio = false;

            for (int j = 0; j < miArray.length - i - 1; j++) {
                if (miArray[j] > miArray[j + 1]) {
                    /** Intercambia los elementos si el orden es incorrecto */
                    int aux = miArray[j];
                    miArray[j] = miArray[j + 1];
                    miArray[j + 1] = aux;
                    // Indica que se ha realizado un intercambio
                    intercambio = true;
                }
            }

            if (!intercambio) {
                break;
            }
        }
    }
}