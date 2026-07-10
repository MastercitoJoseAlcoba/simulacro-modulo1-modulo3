package FIP_PRE_05_JMAC_2026_Guille.Pregunta10;

import Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante.Persona;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * Procedimiento con LinkedList y filtro por edad.
         *
         * ¿Qué hace el siguiente procedimiento?
         *
         * Seleccionar la opción correcta:
         *
         * a. Imprime la consola las personas de la lista que son menores a la edad recibida por argumento.
         * b. No funciona, porque está mal el for.
         * c. No funciona, porque está mal el if.
         * d. Imprime en consola las personas de la lista que son menores a la edad recibida por parámetro.
         *
         * Correcta: d.
         *
         * El procedimiento recorre la lista y filtra por edad.
         *
         * 1. El parámetro edad se recibe en la firma del método
         * 2. El for-each recorre cada objeto Persona de la lista cli.
         * 3. El if evalúa si la edad de a persona es menor que el valor recibio.
         * 4. Si la condición es verdadera, imprime el objeto Persona en consola.
         *
         */
    }

    public static void buscoPersonas(LinkedList<Persona> lista, int edad){
        Persona[] cli = new Persona[0]; // No te lo da el ejercicio.

        for (Persona p : cli){
            if (p.get() < edad)
                System.out.println(p);
            }
        }
    }



