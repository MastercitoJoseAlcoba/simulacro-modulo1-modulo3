package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta06_Promedio_de_numeros_pares;

public class Main {
    public static double calcularPromedioPares(int[] array) {

        // Acumulador para sumar solo los números pares.
        int suma = 0;

        // Contador para saber cuántos pares encontramos.
        int contador = 0;

        // Recorremos el arreglo completo.
        for (int i = 0; i < array.length; i++) {

            // Un número es par si el resto de dividir entre 2 es 0.
            if (array[i] % 2 == 0) {

                // Sumamos el número par.
                suma += array[i];

                // Contamos un par más.
                contador++;
            }
        }

        // Si no hay pares, no se puede dividir entre 0.
        if (contador == 0) {
            return 0;
        }

        // Calculamos el promedio.
        // Convertimos suma a double para obtener resultado decimal.
        return (double) suma / contador;
    }

/*
EJEMPLO:

int[] numeros = {2, 4, 6, 8};

Suma:
2 + 4 + 6 + 8 = 20

Cantidad:
4

Promedio:
20 / 4 = 5.0

IDEA CLAVE:

Promedio = suma / cantidad

Siempre controlar que cantidad no sea 0.
*/
}
