package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta01_Arrays_arreglo_completo_con_ArraystoString;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        // Creamos un arreglo de enteros.
        int[] numeros = {10, 20, 30, 40};

        // Si imprimimos directamente el arreglo:
        //
        // System.out.println(numeros);
        //
        // Java NO muestra el contenido del arreglo.
        // Muestra una referencia rara de memoria.

        // Para mostrar el contenido completo del arreglo,
        // usamos Arrays.toString().
        System.out.println(Arrays.toString(numeros));
    }
}

/*
RESPUESTA CORRECTA:
System.out.println(Arrays.toString(numeros));

SALIDA:
[10, 20, 30, 40]

IDEA CLAVE:

Para arreglos:
Arrays.toString(arreglo)

No usar:
System.out.println(numeros);

Eso no imprime los valores.
*/