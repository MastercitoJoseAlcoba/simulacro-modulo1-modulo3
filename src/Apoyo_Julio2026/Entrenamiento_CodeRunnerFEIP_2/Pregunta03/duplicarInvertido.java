package Apoyo_Julio2026.Entrenamiento_CodeRunnerFEIP_2.Pregunta03;

public class duplicarInvertido {
    public static int[] duplicarInvertido(int[] arreglo) {
        // Creamos un nuevo array del mismo tamaño que el original
        int[] resultado = new int[arreglo.length];

        // Recorremos el arreglo original
        for (int i = 0; i < arreglo.length; i++) {
            // Guardamos los valores duplicados en orden inverso
            resultado[i] = arreglo[arreglo.length - 1 - i] * 2;
        }

        return resultado;
    }

    // Ejemplo con {1,2}:
    // arreglo [1] = 2 -> 2 * 2 = 4
    // arreglo [0] = 1 -> 1 * 2 = 2
    // Resultado: [4,2]

    // La parte importante: arreglo - 1 - i
    // Eso hace que el array se lea desde el último índice hacia el primero.

    public static void main(String[] args) {
        int[] caso = {1, 2};
        System.out.println(java.util.Arrays.toString(duplicarInvertido(caso)));
    }
}
