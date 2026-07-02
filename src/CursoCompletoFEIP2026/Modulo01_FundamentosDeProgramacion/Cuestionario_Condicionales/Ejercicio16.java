package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio16 {
    public static void main(String[] args) {
        int variable = 34;
        int resultado = 0;
        if (variable == 2) { // variable + 2 te da el ejercicio y genera un error de sintaxis.
            resultado=55;
        } else {
            resultado=-55;
        }
        System.out.println(resultado);
        /**
         * a. La condición del if debe ser un valor booleano y no lo es. ✅
         * b. No puedo utilizar la misma variable en el bloque if y en el bloque else.
         * c. En la condición del if debo cambiar el signo de + por un signo de igual =, o sea quedaríá variable = 2.
         * d. No puedo sumar en la condición del if.
         *
         */
    }
}
