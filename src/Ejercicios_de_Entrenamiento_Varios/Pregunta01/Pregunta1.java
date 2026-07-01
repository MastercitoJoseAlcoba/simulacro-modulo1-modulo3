package Ejercicios_de_Entrenamiento_Varios.Pregunta01;

public class Pregunta1 {
    public static int calcularEdad(java.time.LocalDate fechaNacimiento, java.time.LocalDate fechaReferencia) {

        // Si la fecha de nacimiento es posterior a la fecha de referencia,
        // no corresponde calcular la edad.
        if (fechaNacimiento.isAfter(fechaReferencia)) {
            return -1;
        }

        // Se calcula una edad inicial restando los años.
        int edad = fechaReferencia.getYear() - fechaNacimiento.getYear();

        // Se obtiene el mes y el día de ambas fechas.
        int mesNacimiento = fechaNacimiento.getMonthValue();
        int diaNacimiento = fechaNacimiento.getDayOfMonth();

        int mesReferencia = fechaReferencia.getMonthValue();
        int diaReferencia = fechaReferencia.getDayOfMonth();

        // Si en el año de referencia la persona todavía no cumplió años,
        // se debe restar 1 a la edad calculada inicialmente.
        /**
         *Significa:
         *
         * Si el mes de referencia todavía no llegó al mes de nacimiento, todavía no cumplió años.
         *
         * O si están en el mismo mes, pero el día de referencia es menor al día de nacimiento, tampoco cumplió todavía.
         *
         * Ejemplo:
         * fechaNacimiento = 2000-07-10
         * fechaReferencia = 2026-07-01
         *
         * Primero calcula:
         * 2026 - 2000 = 26
         *
         * Pero como todavía no llegó al 10 de julio, resta 1:
         * edad = 25
         *
         */
        if (mesReferencia < mesNacimiento) {
            edad--;
        } else if (mesReferencia == mesNacimiento && diaReferencia < diaNacimiento) {
            edad--;
        }

        return edad;
    }

    public static void main(String[] args) {
        java.time.LocalDate nacimiento = java.time.LocalDate.of(2025, 1, 1);
        java.time.LocalDate referencia = java.time.LocalDate.of(2024, 12, 31);

        int edad = calcularEdad(nacimiento, referencia);

        System.out.println(edad);

    }

}
