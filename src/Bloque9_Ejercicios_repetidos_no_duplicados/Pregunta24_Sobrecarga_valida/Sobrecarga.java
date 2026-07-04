package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta24_Sobrecarga_valida;

public class Sobrecarga {

    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }
}

/*
IDEA CLAVE:

Sobrecarga válida:
mismo nombre, distintos parámetros.

Esto sí es sobrecarga:

sumar(int a, int b)
sumar(double a, double b)

Esto NO es sobrecarga:

sumar(int a, int b)
sumar(int x, int y)

Porque para Java tienen la misma firma.

Java mira:
tipo de datos y orden.

No mira:
nombre interno de las variables.
*/