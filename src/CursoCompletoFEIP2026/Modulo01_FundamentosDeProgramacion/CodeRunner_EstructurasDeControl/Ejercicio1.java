package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Pregunta 1:
         * En este ejercicio, deberás implementar una función que permita evaluar un número entero y determinar si es
         * positivo, negativo o igual a cero.
         * La función recibirá un número entero como parámetro y deberá retornar un mensaje descriptivo según corresponda.
         *
         * Firma del método:
         * public String evaluarNumero (int numero) {}
         *
         * Instrucciones:
         * 1. Analice el valor del parámetro numero.
         * 2. Si el número es mayor que cero, retorne el mensaje: "El número es positivo".
         * 3. Si el número es menor que cero, retorne el mensaje: "El número es negativo".
         * 4. Si el número es igual a cero, retorne el mensaje: "El número es cero".
         *
         */

        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println(ejercicio1.evaluarNumero(10));


    }
    public String evaluarNumero(int numero) {
        if (numero > 0) {
            return "El número es positivo";
        } else if (numero < 0) {
            return "El número es negativo";
        } else {
            return "El número es cero";
        }
    }
}
