package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio2 {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Gabriela", LocalDate.of(1990, 5, 15));

        System.out.println("Edad : " + est.calcularEdad(2020));

    }
    public static class Estudiante {
        private String nombre;
        private LocalDate fechaNacimiento;

        public Estudiante(String nombre, LocalDate fechaNacimiento) {
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getNombre() {
            return nombre;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public int calcularEdad() {
            return Period.between(fechaNacimiento, LocalDate.now()).getYears();
        }

        public int calcularEdad(LocalDate fechaNacimiento) {
            return Period.between(fechaNacimiento, LocalDate.now()).getYears();
        }

        public int calcularEdad(int anioActual) {
            LocalDate fechaEnAño = LocalDate.of(
                    anioActual,
                    this.fechaNacimiento.getMonth(),
                    this.fechaNacimiento.getDayOfMonth()
            );

            return Period.between(this.fechaNacimiento, fechaEnAño).getYears();
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento);
        }
    }
}


