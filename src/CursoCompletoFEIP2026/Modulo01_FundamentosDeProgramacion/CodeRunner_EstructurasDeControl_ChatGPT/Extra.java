package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl_ChatGPT;

public class Extra {
    public static void main(String[] args) {
        /**
         * Extra 3: más para practicar sin piedad, pero con cariño
         *
         * 6. Método esPar
         * Crear un método que reciba un entero y retorne true si es par o false si es impar.
         *
         * 7. Método Promedio
         * Crear un método que reciba tres double y retorne el promedio de ellos.
         *
         * 8. Mensaje de usuario
         * Dadas las variables usuario = "Carlos" y puntos = 150, construir el mensaje: El usuario Carlos tienen 150 puntos.
         *
         */

        // Método esPar
        Extra extra = new Extra();
        System.out.println(extra.esPar(10));
        System.out.println(extra.esPar(11));
        System.out.println(extra.esPar(0));
        System.out.println(extra.esPar(1));
        System.out.println("-".repeat(100));

        // Promedio
        System.out.println(extra.Promedio(10, 20, 40 ));
        System.out.println("-".repeat(100));

        // Mensaje de usuario
        System.out.println(extra.mensajeDeUsuario("Carlos", 150));


    }
    public static boolean esPar (int number){
        if (number % 2 == 0) {
            return true;
        }
       return false;
    }
    public static double Promedio (double a, double b, double c){
        return (a + b + c) / 3;
    }
    public static String mensajeDeUsuario (String nombre, int puntos){
        return "El usuario " + nombre + " " + "tiene " + puntos + " puntos.";
    }
}
