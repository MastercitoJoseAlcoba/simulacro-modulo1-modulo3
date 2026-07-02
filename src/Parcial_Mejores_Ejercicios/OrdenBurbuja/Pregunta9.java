package Parcial_Mejores_Ejercicios.OrdenBurbuja;

public class Pregunta9 {
    public static class Solucion {

        public static int[] ordenarBurbuja(int[] numeros) {
            // Primera parte inicio.
            // El ejercicio dice que no se debe modificar el array original).
            int[] resultado = new int[numeros.length];

            for (int i = 0; i < numeros.length; i++) {
                resultado[i] = numeros[i];
            }
            // Primera parte cierre.

            // Segunda parte inicio.
            // Después viene Bubble Sort:
            for (int i = 0; i < resultado.length - 1; i++) {

                // El j compara cada número con el de al lado:
                for (int j = 0; j < resultado.length - 1 - i; j++) {

                    if (resultado[j] > resultado[j + 1]) {
                        // Si están mal ordenados, los intercambia:
                        int aux = resultado[j];
                        resultado[j] = resultado[j + 1];
                        resultado[j + 1] = aux;
                    }

                }
            }

            return resultado;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 4}; // [3, 5, 8, 1, 4]
                                         // Así la burbuja va empujando los mayores hacia el final.
        System.out.println(java.util.Arrays.toString(Solucion.ordenarBurbuja(numeros)));
    }
}
