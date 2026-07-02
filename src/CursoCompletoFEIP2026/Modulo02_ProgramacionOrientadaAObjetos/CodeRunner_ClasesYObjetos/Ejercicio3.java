package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_ClasesYObjetos;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Instrucciones:
         * 1. Implemente la clase Estudiante respetando los atributos y métodos indicados.
         * 2. Los atributos deben ser privados.
         * 3. Utilice métodos getters y setters para acceder y modificar los valores de los atributos.
         * 4. Puede incluir un constructor si lo considera necesario.
         */

        Estudiante estudiante1 = new Estudiante("Juan", 20, 85.5);
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(20);
        estudiante1.setNota(85.5);
        System.out.println(estudiante1.toString());

        Estudiante estudiante2 = new Estudiante("Pedro", 20, 75.5);
        estudiante1.setNombre("Pedro");
        estudiante1.setEdad(20);
        estudiante1.setNota(75.5);
        System.out.println(estudiante1.toString());

    }
    public static class Estudiante { // En el CodeRunner no se usa static porque no precisamos el main, solo lógica
        // Atributos
        private String nombre;
        private int edad;
        private double nota;

        // Constructor
        public Estudiante(String nombre, int edad, double nota) {
            this.nombre = nombre;
            this.edad = edad;
            this.nota = nota;
        }

        // Métodos: Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public double getNota() {
            return nota;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        // toString
        @Override
        public String toString() {
            return "Estudiante{" + "Nombre: " + nombre + ", Edad: " + edad + ", Nota: " + nota + '}';
        }

    }
}

