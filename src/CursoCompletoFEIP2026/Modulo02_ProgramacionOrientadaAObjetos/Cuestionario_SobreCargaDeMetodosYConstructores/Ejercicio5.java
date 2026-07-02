package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio5 {
    public static void main(String[] args) {

    }
    public class Calculadora {
        public void sumar(int a, int b) {
            System.out.println("Suma int: " + (a + b));
        }

        public void sumar(double a, double b) {
            System.out.println("Suma double: " + (a + b));
        }

        public void sumar(int a, int b, int c) {
            System.out.println("Suma int con tres argumentos: " + (a + b + c));
        }
    }
}
/**
 * ¿Que salida producirán las siguientes llamadas al método sumar?
 * Calculadora calc = new Calculadora();
 * calc.sumar(5,7);     // int
 * calc.sumar(3.5,2.5;  // double
 * calc.sumar(1,2,3);   // int
 *
 * a. Suma int: 12
 *    Suma double: 6.0
 *    Suma int con tres argumentos: 6
 *
 */
