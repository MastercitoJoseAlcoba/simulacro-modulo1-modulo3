package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta15_Nombres_de_variables;

public class Variables {

    public static void main(String[] args) {

        // Correcto.
        int edad = 42;

        // Correcto.
        int edadAlumno = 20;

        // Correcto.
        int edad_alumno = 20;

        // Correcto, aunque no es lo más usado.
        int $precio = 100;

        // Incorrecto:
        //
        // int class = 5;
        //
        // class es palabra reservada.

        // Incorrecto:
        //
        // int 1numero = 10;
        //
        // No puede empezar con número.

        // Incorrecto:
        //
        // int mi-variable = 5;
        //
        // No puede tener guion medio.
    }
}

/*
IDEA CLAVE:

Una variable puede tener:
letras
números
_
$

No puede:
empezar con número
usar palabras reservadas
tener guion medio
tener espacios
*/