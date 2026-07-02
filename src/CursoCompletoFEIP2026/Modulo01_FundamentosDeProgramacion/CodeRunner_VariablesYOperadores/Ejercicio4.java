package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_VariablesYOperadores;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         * Pregunta 4:
         * En este ejercicio, trabájaras con el concepto de concatenación de cadenas en Java.
         * La concatenación consiste en unir dos o más cadenas de texto para formar una nueva cadena. En Java, está
         * operación se realiza mediante el operador +.
         *
         * Ejemplo:
         * String cadena1 = "Hola";
         * String cadena2 = " mundo!";
         * String resultado = cadena1 + cadena2;
         * System.out.println(resultado); // Imprime: "Hola mundo"
         *
         * Consigna:
         * Complete la variable mensaje concatenando correctamente las variables nombre y apellido., de forma que la
         * salida sea exactamente:
         *
         * Hola, Juan Gómez! Bienvenido al mundo de la programación.
         *
         */

        String nombre = "Juan"; // Variable 1
        String apellido = "Gomez"; // Variable 2
        String mensaje = "Hola, " + nombre + " " + apellido + "!" + " Bienvenido al mundo de la programación."; // Concatene las variables
        System.out.println(mensaje); // Imprima el resultado

    }

}
