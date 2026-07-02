package Espacio_De_Practicas.CodeRunner04.Pregunta02;

public class Main {
    public static void ejecutarCalculo(String texto, int divisor) {
        try {
            int numero = Integer.parseInt(texto);
            int resultado = numero / divisor;

            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Formato numérico invalido");

        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
    }

    public static void main(String[] args) {

        ejecutarCalculo("100", 5);
        ejecutarCalculo("abc", 2);
        ejecutarCalculo("50", 0);
        ejecutarCalculo(null, 10);
        ejecutarCalculo("40", 4);

    }
}
