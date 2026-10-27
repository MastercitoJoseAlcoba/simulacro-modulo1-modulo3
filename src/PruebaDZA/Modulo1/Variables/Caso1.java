package PruebaDZA.Modulo1.Variables;

public class Caso1 {
    // Atajo IntelliJ - psvm
    public static void main(String[] args) {
        // Variables Ejemplos:
        // 1. enteros, short, int, long.
        // 2. decimales, float, double.
        // 3. booleanos, (true, false).
        // 4. char, 1 carácter se usa con comillas simples.
        // 5. String, (clase) cadena de caracteres se usa con comillas dobles.
        // 6. Comentarios.

        // 1. Enteros
        // Short:
        short g = 3;
        // Int:
        int a; // Sin valor asignado
        int b = 3; // Con valor asignado, guarda en memoria el valor 3.
        int c, d = 3; // Dos variables, una sin valor asignado y otra con valor asignado.
        System.out.println("El valor de d es: " + d); // Concatenación de texto y variable
        // Long:
        long e = 1000000000000000000L;

        // 2. Decimales:
        // Float:
        float dec2;
        dec2 = 10.25f;
        // Double:
        double dec1;
        dec1 = 10.25;

        // 3. Booleanos:
        boolean bool1;
        bool1 = true;

        // 4. Char:
        char h = 'a'; // char se le pone comillas simples

        // 5. String:
        String nombre = "Ana", apellido = "Garcia";

        // 6. Comentarios
        // Este es un comentario en una sola línea
        /*
        Este es un comentario en varias líneas para dejar como guía.
         */

        // Operadores
        int k = 0;
        k = k + 1; // Incrementamos en 1 el valor de k
        System.out.println(k);

        k = 0;
        k++; // Incrementamos en 1 el valor de k
        System.out.println(k);

        k = 0;
        k = k + 2; // Incrementamos en 2 el valor de k
        System.out.println(k);

        k = k * b; // Multiplico el valor de k por b (2 * 3) = 6
        System.out.println(k);

        k *= b; // Multiplico el valor de k por b (6 * 3) = 18
        System.out.println(k);

        // Incremento posterior y anterior
        System.out.println("-------------------------------------");
        System.out.println("Incremento posterior y anterior");
        System.out.println("---------------------------------------");

        a = 1;
        System.out.println("a = " + a); //
        System.out.println("a++ =" + a++); // Muestra después incrementa
        System.out.println("a =" + a);
        System.out.println("++a =" + ++a);
        System.out.println("a =" + a);

        // Operadores Matemáticos y Lógicos
        b = 10/5; // Dividir
        System.out.println("b = 110/5 = " + b);

        b = 155%3; // El operador % es el resto de la división
        System.out.println("El resto de dividir 155/3 es: " + b);

        // Dividir
        int f = 7/5;
        System.out.println("El resultado de dividir 7/5 es: " + f);
        // Modulo (Resto)
        double i = 7%5;
        System.out.println("El resultado de dividir 7%5 es: " + i);


        // Casteo de double a int, por defecto esta función devuelve un double
        c = (int) Math.pow(2, 3);
        System.out.println("El resultado de elevar 2 a la 3 es: " + c);

        boolean oper = a > b;
        System.out.println("El boolean oper es: " + oper);
        oper = b > 35;
        System.out.println("El boolean oper es: " + oper);

        boolean otro = oper && a > b; // AND &&
        System.out.println("El boolean otro es: " + otro);

        otro = a > b || oper; // el operador OR ||
        System.out.println("El boolean otro es: " + otro);

        otro = !oper; // Negación !
        System.out.println("El boolean otro es: " + otro);
        System.out.println("Contenido b = 2 ? " + (b == 2));
        System.out.println("Contenido b == 5 ? " + (b == 5));
        System.out.println("Contenido b >= 2 ? " + (b >= 2));
        System.out.println("Contenido b <= 2 ? " + (b <= 2));
        System.out.println("Contenido b distinto de 2 ? " + (b != 2));
        System.out.println("Contenido b distinto de 5 ? " + (b != 5));

    }
}
