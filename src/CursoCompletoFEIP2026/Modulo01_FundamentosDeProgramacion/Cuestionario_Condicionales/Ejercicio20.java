package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio20 {
    public static void main(String[] args) {
        int a = 15;
        int b = 41;
        double c = 45.5;
        boolean esta = false;

        // Operador ternario compuesto o anidado
        int resultado = (a + b) % 7 == 0 && c * 2 > 90 && esta? 50 : a % 2 == 0? 100 : 150;
        System.out.println(resultado);
    }
    /**
     * ¿Cuál es el resultado que se muestra por la consola?
     * a. 150 ✅
     * b. 50
     * c. 0
     * d. 100
     *
     *
     *
     */
}
