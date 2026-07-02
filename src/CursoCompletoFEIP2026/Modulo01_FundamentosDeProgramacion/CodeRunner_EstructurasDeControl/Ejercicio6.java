package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Pregunta 6:
         * En este ejercicio, deberás trabajar con la estructura repetitiva do-while, la cual garantiza que el bloque de
         * código se ejecute al menos una vez.
         * La función deberá multiplicar por dos un valor inicial hasta superar un límite dado.
         *
         * Instrucciones:
         * 1. Inicialice la variable valorInicial en 1. (int valorInicial = 1)
         * 2. Utilice una variable resultado para almacenar el valor obtenido en cada multiplicación. (int resultado = 0)
         * 3. Utilice un bucle do-while para:
         *    ○ Multiplicar valorInicial por 2. (resultado = valorInicial * 2)
         *    ○ Guardar el resultado en la variable resultado. (valorInicial++)
         *    ○ Actualizar el valor de valorInicial con el nuevo resultado. (valorInicial = resultado)
         * 4. El bucle debe ejecutarse mientras el resultado sea menor o igual a limite.
         * 5. Finalmente, retorne el último valor calculado que supera el límite. (return resultado)
         *
         */
    }
    public int multiplicarPorDosHasta(int limite) {
        int valorInicial = 1; // Inicializa valorInicial en 1
        int resultado = 0; // Inicializa resultado en 0

        do {
            resultado = valorInicial * 2; // Multiplica valorInicial por 2
            valorInicial = resultado; // Actualiza valorInicial con el nuevo resultado
        } while (resultado <= limite); // Mientras valorInicial sea menor o igual a límite, ejecuta el bucle

        return resultado; // Retorna el resultado
    }
}
