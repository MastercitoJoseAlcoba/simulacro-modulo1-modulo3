package Bloque3_Metodos_variables_operadores.Pregunta14_Bucle_while_que_no_entra;

public class EjercicioFuncion {

    public static void main(String[] args) {

        // Declaramos dos variables enteras.
        int numero1 = 2, numero2 = 8;

        // Declaramos una variable double.
        // Empieza valiendo 0.
        double resultado = 0;

        // Condición del while:
        //
        // numero1 > 10
        //
        // Pero numero1 vale 2.
        //
        // Entonces:
        // 2 > 10 es false.
        //
        // Como la condición es falsa desde el principio,
        // el while NO se ejecuta ni una sola vez.
        while (numero1 > 10) {

            // Esta línea nunca se ejecuta.
            resultado = calcular(numero1, numero2);

            // Esta línea tampoco se ejecuta.
            break;
        }

        // Como el while no entró,
        // resultado sigue valiendo 0.
        //
        // Como resultado es double, se imprime 0.0.
        System.out.println(resultado);
    }

    private static double calcular(int num2, int num1) {

        // Este método tampoco se llega a ejecutar
        // porque el while nunca entra.
        double resultado = num1 * 2 - num2;

        return resultado;
    }
}

/*
PREGUNTA:
¿Qué imprime por consola?

Opciones:
a. No hay un resultado correcto.
b. 14.0
c. -4.0
d. -14.0

ANÁLISIS:

numero1 = 2

Condición:

while (numero1 > 10)

Reemplazamos:

while (2 > 10)

Eso es false.

Entonces el while se saltea.

resultado nunca cambia.

resultado era:

double resultado = 0;

Por ser double se imprime:

0.0

Pero 0.0 no aparece en las opciones.

RESPUESTA:
a. No hay un resultado correcto.

IDEA CLAVE:
Antes de calcular lo que hay dentro del while,
primero verifica si el while entra.

Si la condición arranca falsa, el cuerpo no se ejecuta.
Ni una vuelta. Ni media. Nada.
*/