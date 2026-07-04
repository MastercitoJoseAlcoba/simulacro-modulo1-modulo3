package Bloque8_Interfaces_y_herencia.Pregunta39_switch_avanzado;
/*
PREGUNTA 39 — SWITCH AVANZADO

Tema:
- for descendente
- compareTo()
- operador ternario
- switch
- break
- fall-through
- acumulador

Pregunta:
¿Qué imprime el programa?

Respuesta correcta:
a. 3
*/

public class Main {
    public static void main(String[] args) {
        // Acumulador.
        //
        // Va a ir cambiando dentro del for según el switch.
        int msuma = 0;

        // Bucle descendente.
        //
        // i empieza en 3.
        // Se ejecuta mientras i > 0.
        // En cada vuelta i disminuye en 1.
        //
        // Valores de i:
        // 3, 2, 1
        for (int i = 3; i > 0; i--) {

            // compareTo compara Strings lexicográficamente.
            //
            // "Gato".compareTo("Perro")
            //
            // Compara la primera letra distinta:
            //
            // G contra P.
            //
            // En el orden alfabético, G viene antes que P.
            //
            // Por eso el resultado es negativo.
            int diferencia = "Gato".compareTo("Perro");

            // Operador ternario:
            //
            // condicion ? valorSiTrue : valorSiFalse
            //
            // diferencia > 0 ? 1 : 0
            //
            // Como diferencia es negativa,
            // diferencia > 0 es false.
            //
            // Entonces opcion vale 0.
            int opcion = diferencia > 0 ? 1 : 0;

            // Como opcion vale 0,
            // switch(i - opcion) es lo mismo que:
            //
            // switch(i)
            //
            // Entonces el switch evalúa:
            //
            // cuando i = 3 -> switch(3)
            // cuando i = 2 -> switch(2)
            // cuando i = 1 -> switch(1)
            switch (i - opcion) {

                case 0:

                    // Este caso nunca se ejecuta,
                    // porque i toma 3, 2 y 1.
                    //
                    // Nunca toma 0.
                    msuma += i;
                    break;

                case 1:

                    // Se ejecuta cuando i = 1.
                    //
                    // Hace:
                    // msuma -= i;
                    //
                    // Como i vale 1,
                    // resta 1.
                    msuma -= i;
                    break;

                case 2:

                    // Se ejecuta cuando i = 2.
                    //
                    // Hace:
                    // msuma += i;
                    //
                    // Como i vale 2,
                    // suma 2.
                    msuma += i;

                    // ATENCIÓN:
                    //
                    // Acá NO hay break.
                    //
                    // Entonces después de case 2,
                    // Java sigue ejecutando default.
                    //
                    // Esto se llama fall-through.

                default:

                    // Se ejecuta:
                    //
                    // 1) cuando i = 3, porque no hay case 3.
                    // 2) cuando i = 2, porque cae desde case 2
                    //    al no tener break.
                    //
                    // Suma 1 a msuma.
                    msuma++;
            }
        }

        // Imprime el acumulador final.
        System.out.println(msuma);
    }
}

/*
RECORRIDO COMPLETO:

Dato clave:

"Gato".compareTo("Perro") es negativo.

Entonces:

opcion = 0

Por eso:

switch(i - opcion) = switch(i)

--------------------------------------------------

INICIO:

msuma = 0

--------------------------------------------------

VUELTA 1:

i = 3

switch(3)

No existe case 3.
Va a default.

default:
msuma++

msuma = 1

--------------------------------------------------

VUELTA 2:

i = 2

switch(2)

Entra en case 2:

msuma += i
msuma = 1 + 2
msuma = 3

Pero no hay break.

Entonces sigue a default:

msuma++
msuma = 4

--------------------------------------------------

VUELTA 3:

i = 1

switch(1)

Entra en case 1:

msuma -= i
msuma = 4 - 1
msuma = 3

Hay break.
Sale del switch.

--------------------------------------------------

RESULTADO FINAL:

msuma = 3

SALIDA:

3

IDEA CLAVE:

Dos trampas importantes:

1) compareTo puede dar negativo, cero o positivo.
   Acá da negativo porque "Gato" viene antes que "Perro".

2) En switch, si no hay break,
   Java sigue ejecutando el siguiente bloque.

Eso se llama fall-through.

case 2 no tiene break,
por eso también ejecuta default.

El break en switch no es decoración:
es el freno de mano.
*/
