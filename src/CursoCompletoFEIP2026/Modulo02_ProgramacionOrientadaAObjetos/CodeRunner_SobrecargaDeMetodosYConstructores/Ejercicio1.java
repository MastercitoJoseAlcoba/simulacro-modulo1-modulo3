package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_SobrecargaDeMetodosYConstructores;

public class Ejercicio1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Suma de dos enteros: " + calculadora.sumar(5, 7));
        System.out.println("Suma de tres enteros: " + calculadora.sumar(5, 7, 10));

        System.out.println("Suma de dos doubles: " + calculadora.sumar(2.5, 3.7));
        System.out.println("Suma de tres doubles: " + calculadora.sumar(2.5, 3.7, 1.2));

        System.out.println("Multiplicación de dos enteros: " + calculadora.multiplicar(3, 4));
        System.out.println("Multiplicación de tres enteros: " + calculadora.multiplicar(3, 4, 2));

        System.out.println("Multiplicación de dos doubles: " + calculadora.multiplicar(2.5, 3.7));
        System.out.println("Multiplicación de tres doubles: " + calculadora.multiplicar(2.5, 3.7, 1.2));

    }
    public static class Calculadora {
        // Suma:
        // Método sumar que reciba dos números enteros y devuelva su suma.
        public int sumar(int a, int b) {
            return a + b;
        }

        // Una sobrecarga de sumar que reciba tres números enteros
        public int sumar(int a, int b, int c){
            return a + b + c;
        }

        // Una sobrecarga de sumar que reciba dos números de tipo double
        public double sumar(double a, double b){
            return a + b;
        }

        // Una sobrecarga de sumar que reciba tres números de tipo dobule
        public double sumar(double a, double b, double c){
            return a + b + c;
        }

        // Multiplicación:
        public int multiplicar(int a, int b) {
            return a * b;
        }

        // Una sobrecarga de multiplicar que reciba tres números enteros
        public int multiplicar(int a, int b, int c) {
            return a * b * c;
        }

        // Una sobrecarga de multiplicar que reciba dos números double
        public double multiplicar(double a, double b) {
            return a * b;
        }

        // Una sobrecarga de multiplicar que reciba tres números de tipo double
        public double multiplicar(double a, double b, double c) {
            return a * b * c;
        }
    }

}







