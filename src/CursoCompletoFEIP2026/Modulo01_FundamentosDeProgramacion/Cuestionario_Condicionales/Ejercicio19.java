package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.Cuestionario_Condicionales;

public class Ejercicio19 {
    public static void main(String[] args) {
        String nombre = "Ana Elena Fernandez";
        if (nombre.length()>=30) {
            System.out.println("Este nombre tiene mas de 30 caracteres");
        } else if (nombre.length()>=20) {
            System.out.println("Este nombre tiene mas de 20 caracteres");
        } else {
            System.out.println("Este nombre tiene menos de 20 caracteres");
        }
        System.out.println("La variable nombre tiene " + nombre.length() + " caracteres.");
    }

    /**
     * Pregunta 19:
     * ¿Qué es lo que se muestra por consola al ejecutarse este programa?
     * a. Al ejecutarse este programa no se muestra ningún mensaje.
     * b. Este nombre tiene más de 20 caracteres. / La variable nombré tiene 21 caracteres.
     * c. Este nombre tiene más de 30 caracteres / La variable nombré tiene 32 caracteres.
     * d. Este nombre tiene menos de 20 caracteres / La variable nombré tiene 19 caracteres.
     *
     */
}
