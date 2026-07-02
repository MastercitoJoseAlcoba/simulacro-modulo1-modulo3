package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio12 {
    public static void main(String[] args) {
        int variable = 34;
        int resultado = 0;
        if (++variable > 34) // Incrementa en 1 (35>34) true
            resultado=55;
        else
            resultado=-55;
        System.out.println(resultado);
        /**
         * ¿Que se imprime por la consola?
         * a. 0
         * b. 34
         * c. 55 ✅
         * d. -55
         *
         */


    }
}
