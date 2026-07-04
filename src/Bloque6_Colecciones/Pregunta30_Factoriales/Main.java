package Bloque6_Colecciones.Pregunta30_Factoriales;

public class Main {
    public static int[] factoriales(int n) {

        // ================================
        // PREGUNTA 30 — FACTORIALES
        // ================================
        //
        // Este ejercicio trabaja con:
        //
        // - arreglos
        // - acumulación
        // - factorial
        // - recorrido con for
        //
        // El método debe devolver un arreglo con los factoriales
        // desde 0! hasta n!.
        //
        // Ejemplo:
        //
        // factoriales(5)
        //
        // debe devolver:
        //
        // [1, 1, 2, 6, 24, 120]
        //
        // Porque:
        //
        // 0! = 1
        // 1! = 1
        // 2! = 2
        // 3! = 6
        // 4! = 24
        // 5! = 120

        int[] fact = new int[n + 1];

        // Creamos un arreglo de tamaño n + 1.
        //
        // ¿Por qué n + 1?
        //
        // Porque queremos guardar desde 0 hasta n.
        //
        // Ejemplo:
        //
        // Si n = 5,
        // necesitamos estas posiciones:
        //
        // fact[0] -> 0!
        // fact[1] -> 1!
        // fact[2] -> 2!
        // fact[3] -> 3!
        // fact[4] -> 4!
        // fact[5] -> 5!
        //
        // Son 6 posiciones.
        //
        // Por eso:
        //
        // n + 1

        fact[0] = 1;

        // Por definición matemática:
        //
        // 0! = 1
        //
        // Entonces la posición 0 siempre vale 1.
        //
        // Esto es la base del cálculo.
        //
        // Sin esta línea, no podríamos calcular bien
        // los factoriales siguientes usando el anterior.

        for (int i = 1; i <= n; i++) {

            // Recorremos desde 1 hasta n inclusive.
            //
            // Si n = 5:
            //
            // i toma estos valores:
            //
            // 1, 2, 3, 4, 5

            // Fórmula acumulativa:
            //
            // i! = (i - 1)! * i
            //
            // En el arreglo:
            //
            // fact[i] = fact[i - 1] * i;
            //
            // Esto significa:
            //
            // El factorial actual se calcula usando
            // el factorial anterior.
            //
            // Ejemplo:
            //
            // 4! = 3! * 4
            //
            // Si ya sabemos que:
            //
            // 3! = 6
            //
            // Entonces:
            //
            // 4! = 6 * 4 = 24
            fact[i] = fact[i - 1] * i;
        }

        // Devolvemos el arreglo completo.
        return fact;
    }

/*
================================================
EJEMPLO
================================================

int[] resultado = factoriales(5);


================================================
TAMAÑO DEL ARREGLO
================================================

n = 5

n + 1 = 6

Entonces el arreglo tiene 6 posiciones:

fact[0]
fact[1]
fact[2]
fact[3]
fact[4]
fact[5]


================================================
INICIO
================================================

fact[0] = 1

Porque:

0! = 1


================================================
RECORRIDO DEL FOR
================================================

--------------------------------
i = 1
--------------------------------

fact[1] = fact[0] * 1

fact[1] = 1 * 1

fact[1] = 1


--------------------------------
i = 2
--------------------------------

fact[2] = fact[1] * 2

fact[2] = 1 * 2

fact[2] = 2


--------------------------------
i = 3
--------------------------------

fact[3] = fact[2] * 3

fact[3] = 2 * 3

fact[3] = 6


--------------------------------
i = 4
--------------------------------

fact[4] = fact[3] * 4

fact[4] = 6 * 4

fact[4] = 24


--------------------------------
i = 5
--------------------------------

fact[5] = fact[4] * 5

fact[5] = 24 * 5

fact[5] = 120


================================================
RESULTADO FINAL
================================================

[1, 1, 2, 6, 24, 120]


================================================
EXPLICACIÓN MATEMÁTICA
================================================

0! = 1

1! = 1

2! = 2 * 1 = 2

3! = 3 * 2 * 1 = 6

4! = 4 * 3 * 2 * 1 = 24

5! = 5 * 4 * 3 * 2 * 1 = 120


================================================
IDEA CLAVE
================================================

No recalculamos cada factorial desde cero.

Usamos el factorial anterior.

La línea más importante es:

fact[i] = fact[i - 1] * i;

Eso permite construir el arreglo paso a paso.

Es acumulación.

Como estudiar para Java:
primero una base,
después iterás,
y cuando mirás para atrás ya tenés el parcial bastante menos monstruo.
*/
}
