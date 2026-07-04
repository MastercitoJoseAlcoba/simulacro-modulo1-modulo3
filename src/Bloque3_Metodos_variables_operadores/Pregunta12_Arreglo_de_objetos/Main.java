package Bloque3_Metodos_variables_operadores.Pregunta12_Arreglo_de_objetos;

import Bloque2_String_y_fechas.Pregunta9_Herencia_Persona_Profesor_Estudiante.Persona;

public class Main {
    public static void main(String[] args) {
        // Se crea una variable entera llamada total.
        //
        // Primero se calcula 1 * 2.
        // Entonces total empieza valiendo 2.
        int total = 1 * 2;

        // Se crea un arreglo de Personas con 5 posiciones.
        //
        // En este momento el arreglo existe,
        // pero sus posiciones todavía están vacías.
        Persona[] personas = new Persona[5];

        // En la posición 0 guardamos una Persona.
        // Nombre: Carlos
        // Edad: 50
        personas[0] = new Persona("Carlos", 50);

        // En la posición 1 guardamos otra Persona.
        // Edad: 20
        personas[1] = new Persona("Mario", 20);

        // En la posición 2 guardamos otra Persona.
        // Edad: 30
        personas[2] = new Persona("María", 30);

        // En la posición 3 guardamos otra Persona.
        // Edad: 50
        personas[3] = new Persona("José", 50);

        // En la posición 4 guardamos otra Persona.
        // Edad: 40
        personas[4] = new Persona("Sofía", 40);

        // Este es un for-each.
        //
        // Recorre todas las personas del arreglo.
        //
        // En cada vuelta, p representa una Persona distinta.
        for (Persona p : personas) {

            // Se suma la edad de cada persona al total.
            //
            // total empieza en 2.
            //
            // Luego:
            // total = 2 + 50
            // total = 52 + 20
            // total = 72 + 30
            // total = 102 + 50
            // total = 152 + 40
            total += p.getEdad();
        }

        // Imprime el total final.
        System.out.println(total);
    }
}

/*
CÁLCULO COMPLETO:

total inicial:

1 * 2 = 2

Edades:

Carlos -> 50
Mario -> 20
María -> 30
José -> 50
Sofía -> 40

Suma de edades:

50 + 20 + 30 + 50 + 40 = 190

Total final:

2 + 190 = 192

SALIDA:
192

RESPUESTA:
c. 192

IDEA CLAVE:
No hay que olvidarse de que total no empieza en 0.
Empieza en 2.

Ese 1 * 2 parece inocente, pero está ahí para cazar distraídos.
*/


