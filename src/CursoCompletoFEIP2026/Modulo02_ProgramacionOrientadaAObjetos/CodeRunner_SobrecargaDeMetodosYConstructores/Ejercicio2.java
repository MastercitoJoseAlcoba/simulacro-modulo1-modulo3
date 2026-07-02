package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_SobrecargaDeMetodosYConstructores;

public class Ejercicio2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alice");
        Persona persona2 = new Persona("Bob", 25);
        Persona persona3 = new Persona("Charlie", 30, "123 Main St");
        Persona persona4 = new Persona("David", "456 Oak St");
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        persona3.mostrarInformacion();
        persona4.mostrarInformacion();


    }
    public static class Persona {
        private final String nombre;
        private int edad;
        private String direccion;

        // Constructor que toma solo el nombre
        public Persona(String nombre) {
            this.nombre = nombre;
        }

        // Constructor que toma el nombre y la edad
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Constructor que toma el nombre, la edad y la dirección
        public Persona(String nombre, int edad, String direccion) {
            this.nombre = nombre;
            this.edad = edad;
            this.direccion = direccion;
        }

        // Constructor que toma el nombre y la dirección
        public Persona(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getDireccion() {
            return direccion;
        }

        // Método para mostrar la información de la persona
        public void mostrarInformacion(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Dirección: " + direccion);
            System.out.println("-".repeat(50));
        }
    }
}
