package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta23_Sobrecarga_con_short;

public class Mostrar {

    public void mostrar(int a, int b) {

        // Método que recibe dos int.
        System.out.println("Metodo int: " + (a + b));
    }

    public void mostrar(double a, double b) {

        // Método que recibe dos double.
        System.out.println("Metodo double: " + (a + b));
    }

    public void mostrar(byte a, byte b) {

        // Método que recibe dos byte.
        System.out.println("Metodo byte: " + (a + b));
    }
}

/*
SALIDA:
Metodo int: 12

IDEA CLAVE:

Si no hay método exacto para short,
Java elige int.

short no se convierte automáticamente a byte,
porque podría perder información.
*/