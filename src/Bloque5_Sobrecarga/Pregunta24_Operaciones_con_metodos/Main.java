package Bloque5_Sobrecarga.Pregunta24_Operaciones_con_metodos;

public class Main {

    public static void main(String[] args) {

        // ================================
        // PREGUNTA 24 — OPERACIONES CON MÉTODOS
        // ================================
        //
        // Este ejercicio trabaja con llamadas a métodos.
        //
        // La idea es seguir el flujo paso a paso.
        //
        // No hay que resolverlo de memoria.
        //
        // Hay que mirar qué método se llama primero,
        // qué devuelve,
        // y cómo ese valor se usa en el siguiente paso.

        int a = 5;
        int b = 10;
        int c = 15;

        // Valores:
        //
        // a = 5
        // b = 10
        // c = 15

        // Llamamos al método complexOperation.
        //
        // Le pasamos:
        //
        // a, b, c
        //
        // Entonces dentro del método:
        //
        // x = 5
        // y = 10
        // z = 15
        int result = complexOperation(a, b, c);

        // Imprime el resultado final.
        System.out.println(result);
    }

    public static int complexOperation(int x, int y, int z) {

        // Al entrar acá:
        //
        // x = 5
        // y = 10
        // z = 15

        // --------------------------------
        // PASO 1
        // --------------------------------
        //
        // Se llama al método add(x, y).
        //
        // Como:
        //
        // x = 5
        // y = 10
        //
        // Entonces:
        //
        // add(5, 10)
        //
        // El método add devuelve:
        //
        // 5 + 10 = 15
        //
        // Por eso:
        //
        // step1 = 15
        int step1 = add(x, y);

        // --------------------------------
        // PASO 2
        // --------------------------------
        //
        // Se llama al método multiply(step1, z).
        //
        // Como:
        //
        // step1 = 15
        // z = 15
        //
        // Entonces:
        //
        // multiply(15, 15)
        //
        // El método multiply devuelve:
        //
        // 15 * 15 = 225
        //
        // Por eso:
        //
        // step2 = 225
        int step2 = multiply(step1, z);

        // --------------------------------
        // PASO 3
        // --------------------------------
        //
        // Se llama al método subtract(step2, x).
        //
        // Como:
        //
        // step2 = 225
        // x = 5
        //
        // Entonces:
        //
        // subtract(225, 5)
        //
        // El método subtract devuelve:
        //
        // 225 - 5 = 220
        //
        // Por eso:
        //
        // step3 = 220
        int step3 = subtract(step2, x);

        // Se devuelve el resultado final.
        return step3;
    }

    public static int add(int a, int b) {

        // Este método recibe dos números
        // y devuelve la suma.
        //
        // Ejemplo:
        //
        // add(5, 10)
        //
        // devuelve:
        //
        // 15
        return a + b;
    }

    public static int multiply(int a, int b) {

        // Este método recibe dos números
        // y devuelve la multiplicación.
        //
        // Ejemplo:
        //
        // multiply(15, 15)
        //
        // devuelve:
        //
        // 225
        return a * b;
    }

    public static int subtract(int a, int b) {

        // Este método recibe dos números
        // y devuelve la resta.
        //
        // OJO:
        //
        // Devuelve a - b.
        //
        // El orden importa.
        //
        // subtract(225, 5)
        //
        // devuelve:
        //
        // 220
        return a - b;
    }
}

/*
================================================
CÁLCULO COMPLETO
================================================

a = 5
b = 10
c = 15

Se llama:

complexOperation(a, b, c)

Entonces:

x = 5
y = 10
z = 15


--------------------------------
PASO 1
--------------------------------

step1 = add(x, y)

step1 = add(5, 10)

step1 = 15


--------------------------------
PASO 2
--------------------------------

step2 = multiply(step1, z)

step2 = multiply(15, 15)

step2 = 225


--------------------------------
PASO 3
--------------------------------

step3 = subtract(step2, x)

step3 = subtract(225, 5)

step3 = 220


================================================
SALIDA
================================================

220


================================================
RESPUESTA
================================================

c. 220


================================================
IDEA CLAVE
================================================

Este ejercicio se resuelve siguiendo el orden de llamadas:

1) add
2) multiply
3) subtract

No se mezclan los pasos.

Cada método devuelve un valor,
y ese valor se usa en el siguiente paso.

Es como una receta:
si ponés primero el horno y después la masa,
algo raro estás cocinando.
*/