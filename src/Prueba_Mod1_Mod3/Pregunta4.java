package Prueba_Mod1_Mod3;

public class Pregunta4 {
    public static void main(String[] args) {
        int numero = 8;
        int resultado = 0;

        numero = numero + 2;

        if (++numero > 10) {        // ++numero es preincremento. Primero aumenta y después compara.
                                    // Entonces hace esto numero = 11;
                                    // Y recién pregunta: 11 > 10 Eso es true, entonces entra al if.
            resultado = numero * 2; // resultado 11 * 2 = 22
        } else {
            resultado = numero + 5;
        }

        System.out.println(resultado);
    }
}

/**
 * ¿Qué valor se muestra en la consola al ejecutar el programa?
 * a. 26
 * b. 10
 * c. 11
 * d. 22
 *
 * La respuesta correcta es: d. 22
 *
 */
