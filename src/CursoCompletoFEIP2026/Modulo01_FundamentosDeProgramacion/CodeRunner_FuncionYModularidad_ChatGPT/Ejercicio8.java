package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_FuncionYModularidad_ChatGPT;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Ejercicio 8: verificar si un número es capicúa
         *
         * Enunciado de la pregunta:
         * En este ejercicio, deberás implementar una función que determine si un número entero se lee igual de izquierda
         * a derecha y de derecha a izquierda.
         *
         * Firma del método:
         * public boolean esCapicua(int numero) {}
         *
         * Instrucciones:
         * 1. Implemente el método esCapicua.
         * 2. Invierta el número utilizando un proceso similar al de recorrer sus dígitos.
         * 3. Compare el número original con el número invertido.
         * 4. Si son iguales, retorne true.
         * 5. En caso contrario, retorne false.
         *
         */

        Ejercicio8 ejercicio8 = new Ejercicio8();
        int numero = 1221;

        if (ejercicio8.esCapicua(1221)) {
            System.out.println(numero + " es capicúa");
        } else {
            System.out.println(numero + " no es capicúa");
        }


    }
    public boolean esCapicua(int numero) {
        int original = 1221; // guarda el número original
        int invertido = 0; // se arma al revés

        while (numero > 0) {
            int ultimoDigito = numero % 10;
            invertido = invertido * 10 + ultimoDigito;
            numero /= 10;
        }
        return original == invertido; // true o false
    }
}
