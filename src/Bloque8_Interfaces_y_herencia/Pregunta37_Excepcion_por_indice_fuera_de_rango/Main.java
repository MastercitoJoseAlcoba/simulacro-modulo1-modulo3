package Bloque8_Interfaces_y_herencia.Pregunta37_Excepcion_por_indice_fuera_de_rango;
/*
PREGUNTA 37 — EXCEPCIÓN POR ÍNDICE FUERA DE RANGO

Tema:
- Arreglos
- Índices
- Excepciones
- try/catch
- ArrayIndexOutOfBoundsException

Pregunta:
¿Qué imprime por consola?

a. Imprime 0.
b. Imprime null.
c. Imprime Error: índice fuera de los límites del array.
d. El programa no compila.

Respuesta correcta:
c. Imprime Error: índice fuera de los límites del array.
*/

public class Main {
    public static void main(String[] args) {
        // try contiene código que puede producir una excepción.
        //
        // En este caso, el riesgo está en acceder a una posición
        // inexistente del arreglo.
        try {

            // Creamos un arreglo de enteros con tamaño 3.
            //
            // Como tiene tamaño 3, sus índices válidos son:
            //
            // 0, 1, 2
            //
            // No existe la posición 3.
            // No existe la posición 4.
            // No existe la posición 5.
            int[] nums = new int[3];

            // ERROR EN TIEMPO DE EJECUCIÓN:
            //
            // Se intenta acceder a nums[5].
            //
            // Pero nums solo tiene:
            //
            // nums[0]
            // nums[1]
            // nums[2]
            //
            // Entonces Java lanza:
            //
            // ArrayIndexOutOfBoundsException
            System.out.println(nums[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Este catch captura específicamente el error
            // de índice fuera del rango del arreglo.
            //
            // Como nums[5] no existe, se ejecuta este bloque.
            System.out.println("Error: índice fuera de los límites del array");
        }
    }
}

/*
EXPLICACIÓN:

int[] nums = new int[3];

Crea un arreglo así:

nums[0] = 0
nums[1] = 0
nums[2] = 0

Los valores son 0 porque un arreglo de int se inicializa con ceros.

Pero el código pide:

nums[5]

Esa posición no existe.

Entonces:

- No imprime 0.
- No imprime null.
- El programa sí compila.
- El error ocurre al ejecutar.

Como hay un catch para ArrayIndexOutOfBoundsException,
el programa no se rompe.

Imprime el mensaje del catch:

Error: índice fuera de los límites del array

IDEA CLAVE:

Error de compilación:
Java ni siquiera deja ejecutar.

Excepción:
El programa compila, pero falla durante la ejecución.

Acá es una excepción controlada con try/catch.

El try/catch funciona como red de seguridad:
si el código se cae, al menos no se rompe toda la fiesta.
*/


