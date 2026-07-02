package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio17 {
    public static void main(String[] args) {
        int a = 5, b = 3, c = -12;
        String mensaje = "";
        boolean esta = a + b + c == 4 && !(a % 3 == 0) || a + b > 7 && b * a == 15;
        if (esta) {
            mensaje = "Podemos entrar";
        } else {
            mensaje = "Denegado";
        }
        System.out.println(mensaje); // Imprime: "Podemos entrar"

        /**
         * Pregunta 17:
         * ¿Qué sucede si queremos ejecutar este programa?
         * a. Muestra un mensaje vacío.
         * b. No podemos ejecutarlo tenemos problema con la sintaxis.
         * c. Muestra el mensaje en consola Denegado.
         * d. Muestra el mensaje en consola "Podemos entrar". ✅
         *
         */

    }
}
