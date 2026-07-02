package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 32;
        boolean existe = false;
        boolean resultado = (a==b); // false

        // !false -> true
        // true && true -> true
        if ((b % a == 0) && !existe) {
            resultado = false;
        } else {
            // Esta parte no se ejecuta
            if ((b>a) || existe) {
                resultado = true;
            }
        }
        // !! false -> false
        System.out.println(!!resultado); // Imprime: true
    }
}
