package Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta02;

public class Pregunta2 {
    public static void main(String[] args) {
        /**
         * Enunciado de la pregunta:
         * a. Contar la cantidad de letras "a" en un texto.
         * b. Crea un método que reciba un texto como parámetro y devuelva la cantidad de veces que aparece la letra "a",
         * dentro de ese texto.
         *
         * El método debe llamarse exactamente:
         * public int contarLetraA(String texto)
         *
         * Requisitos del método:
         * 1. Debe recibir un parámetro de tipo String llamado texto.
         * 2. Debe recorrer el texto carácter por carácter.
         * 3. Debe contar cuántas veces aparece la letra minúscula "a".
         * 4. Debe devolver un valor de tipo int.
         * 5. No debe imprimir nada en pantalla.
         * 6. No es necesario crear el método main.
         *
         * Ejemplos:
         * A. Si el método recibe: "casa",         -> debe devolver: 2
         *                         "programación", -> debe devolver: 1
         *                         "perro",        -> debe devolver: 0
         *
         * Importante:
         * 1. El método debe contar únicamente la letra minúscula "a".
         * 2. No debe contar la letra mayúscula "A".
         * 3. El método debe retornar el resultado, no mostrarlo con System.out.println().
         * 4. Consejo: Puedes utilizar un ciclo for para recorrer el texto y el método charAt(i) para obtener cada carácter
         * del String.
         *
         * Por ejemplo:
         *
         * Prueba: System.out.pritnln(contarLetraA("casa"));
         *         2
         *         System.out.println(contarLetraA("perro"));
         *         0
         *
         */

        // No forma parte del ejercicio que pide el CodeRunner

        // Ejemplo en "casa":
        // c a s a
        // 0 1 2 3
        // En índice 1 hay una a -> cuenta 1.
        // En índice 3 hay otra a -> cuenta 2.

        // Resultado final: return contador;
        //                  Devuelve 2.

        System.out.println(contarLetraA("casa"));
        System.out.println(contarLetraA("programación"));
        System.out.println(contarLetraA("perro"));



    }
    // Forma parte del ejercicio que pide el CodeRunner

    public static int contarLetraA(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) { // (texto.length(), dice cuántos caracteres tiene el texto)
            if (texto.charAt(i) == 'a') { // agarra el carácter que está en la posición i.
                contador++; // Entonces, si el carácter es 'a', incrementa el contador.
            }
        }
        return contador;
    }
}
