package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta10_Excepciones_con_String;

public class Main {
    public void prueba(String dato) {

        try {

            // charAt(3) intenta acceder al carácter en posición 3.
            //
            // Si dato es null:
            // NullPointerException.
            //
            // Si dato tiene menos de 4 caracteres:
            // StringIndexOutOfBoundsException.
            System.out.println(dato.charAt(3));

            // substring(0, 5) intenta tomar desde índice 0 hasta 5,
            // sin incluir el índice 5.
            //
            // Necesita que el String tenga al menos 5 caracteres.
            System.out.println(dato.substring(0, 5));

            // Solo se imprime si todo salió bien.
            System.out.println("Proceso correcto");

        } catch (NullPointerException e) {

            // Se ejecuta si dato es null.
            System.out.println("String null");

        } catch (StringIndexOutOfBoundsException e) {

            // Se ejecuta si el índice no existe.
            System.out.println("Indice fuera de rango");

        } catch (Exception e) {

            // Captura cualquier otro error.
            System.out.println("Error general");
        }
    }

/*
EJEMPLO 1:

dato = null

Resultado:
String null

EJEMPLO 2:

dato = "abc"

Resultado:
Indice fuera de rango

EJEMPLO 3:

dato = "Programacion"

Resultado:
g
Progr
Proceso correcto

IDEA CLAVE:

Primero van los catch específicos.
Al final va el catch general.
*/
}
