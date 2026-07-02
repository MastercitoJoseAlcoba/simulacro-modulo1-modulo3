package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Varibales;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
         * Pregunta 10:
         * ¿Qué sucede cuando asignas un valor int a una variable long sin hacer casting explícito?
         * a. Error de compilación debido a la pérdida de precisión.
         * b. Error en tiempo de ejecución.
         * c. Se produce un overflow.
         * d. El valor se asigna correctamente, ya que la conversión es implicitamente segura. ✅
         */

        // Ejemplo:
        int numeroInt = 100;
        long numeroLong = numeroInt;
        System.out.println(numeroLong);
        // Eso funciona porque long puede almacenar valores más grandes que int.

        // Ejemplo contrario:
        long x = 100;
        int y = (int) x;
        System.out.println(x);

        // Overflow es cuando un tipo de dato intenta almacenar un valor que no puede representar y se desborda.
        byte x1 = 127;
        x++;
        System.out.println(x1);

    }
}
