package Bloque1_Arrays_y_matrices.Pregunta2_Nombre_mas_largo_en_un_arreglo;

public class Eje2 {
    private static String masLargo(String[] nombres) {

        // Creamos una variable llamada mayor.
        //
        // Esta variable va a guardar el nombre más largo encontrado hasta el momento.
        //
        // Empieza como String vacío porque todavía no recorrimos ningún nombre.
        String mayor = "";

        // Recorremos el arreglo completo.
        //
        // i empieza en 0 porque los arreglos en Java arrancan en índice 0.
        //
        // nombres.length devuelve la cantidad de elementos del arreglo.
        for (int i = 0; i < nombres.length; i++) {

            // nombres[i] representa el nombre actual.
            //
            // nombres[i].length() devuelve la cantidad de letras del nombre actual.
            //
            // mayor.length() devuelve la cantidad de letras del nombre más largo
            // guardado hasta ahora.
            //
            // Si el nombre actual tiene más letras que mayor,
            // entonces encontramos un nuevo nombre más largo.
            if (nombres[i].length() > mayor.length()) {

                // Guardamos el nombre actual como el más largo.
                mayor = nombres[i];
            }
        }

        // Cuando termina el for, ya revisamos todos los nombres.
        //
        // La variable mayor contiene el nombre con más letras.
        return mayor;
    }
}

/*
EJEMPLO:

String[] nombres = {"Ana", "Lucia", "Eduardo", "Juan", "Alejandro"};

RECORRIDO:

Inicio:
mayor = ""

i = 0
nombres[0] = "Ana"
"Ana".length() = 3
"".length() = 0
Como 3 > 0:
mayor = "Ana"

i = 1
nombres[1] = "Lucia"
"Lucia".length() = 5
"Ana".length() = 3
Como 5 > 3:
mayor = "Lucia"

i = 2
nombres[2] = "Eduardo"
"Eduardo".length() = 7
"Lucia".length() = 5
Como 7 > 5:
mayor = "Eduardo"

i = 3
nombres[3] = "Juan"
"Juan".length() = 4
"Eduardo".length() = 7
Como 4 > 7 es falso:
mayor sigue siendo "Eduardo"

i = 4
nombres[4] = "Alejandro"
"Alejandro".length() = 9
"Eduardo".length() = 7
Como 9 > 7:
mayor = "Alejandro"

RESULTADO:
Alejandro

IDEA CLAVE:
Se usa una variable auxiliar para guardar el mejor resultado encontrado hasta ahora.

*/
