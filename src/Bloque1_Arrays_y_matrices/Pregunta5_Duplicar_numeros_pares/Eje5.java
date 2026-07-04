package Bloque1_Arrays_y_matrices.Pregunta5_Duplicar_numeros_pares;

public class Eje5 {
    public static int[] duplicarPares(int[] arr) {

        // Creamos un nuevo arreglo llamado resultado.
        //
        // Tiene el mismo largo que el arreglo original.
        //
        // Si arr tiene 5 elementos,
        // resultado también tendrá 5 elementos.
        //
        // Esto es importante porque el ejercicio dice:
        // NO modificar el arreglo original.
        int[] resultado = new int[arr.length];

        // Recorremos el arreglo desde la posición 0
        // hasta la última posición.
        //
        // i representa el índice actual.
        for (int i = 0; i < arr.length; i++) {

            // arr[i] representa el valor actual del arreglo.
            //
            // Para saber si un número es par usamos el operador %.
            //
            // % devuelve el resto de una división.
            //
            // Ejemplo:
            //
            // 4 % 2 = 0
            // entonces 4 es par.
            //
            // 5 % 2 = 1
            // entonces 5 es impar.
            //
            // Si arr[i] % 2 == 0,
            // significa que el número es par.
            if (arr[i] % 2 == 0) {

                // Si el número es par,
                // guardamos el doble en la misma posición
                // del arreglo resultado.
                //
                // Ejemplo:
                //
                // arr[i] = 4
                // resultado[i] = 4 * 2
                // resultado[i] = 8
                resultado[i] = arr[i] * 2;

            } else {

                // Si el número es impar,
                // lo copiamos igual.
                //
                // Ejemplo:
                //
                // arr[i] = 3
                // resultado[i] = 3
                resultado[i] = arr[i];
            }
        }

        // Devolvemos el nuevo arreglo.
        //
        // El arreglo original arr queda intacto.
        return resultado;
    }

/*
EJEMPLO:

int[] arr = {1, 2, 3, 4, 5};

RECORRIDO:

i = 0
arr[0] = 1
1 % 2 = 1
Es impar.
resultado[0] = 1

i = 1
arr[1] = 2
2 % 2 = 0
Es par.
resultado[1] = 2 * 2
resultado[1] = 4

i = 2
arr[2] = 3
3 % 2 = 1
Es impar.
resultado[2] = 3

i = 3
arr[3] = 4
4 % 2 = 0
Es par.
resultado[3] = 4 * 2
resultado[3] = 8

i = 4
arr[4] = 5
5 % 2 = 1
Es impar.
resultado[4] = 5

RESULTADO FINAL:

arr original:
{1, 2, 3, 4, 5}

resultado:
{1, 4, 3, 8, 5}

RESPUESTA:
[1, 4, 3, 8, 5]

IDEA CLAVE:

Si es par:
se duplica.

Si es impar:
queda igual.

Se usa un arreglo nuevo para no modificar el original.

La línea clave es:

resultado[i] = arr[i] * 2;

pero solo cuando:

arr[i] % 2 == 0
*/
}
