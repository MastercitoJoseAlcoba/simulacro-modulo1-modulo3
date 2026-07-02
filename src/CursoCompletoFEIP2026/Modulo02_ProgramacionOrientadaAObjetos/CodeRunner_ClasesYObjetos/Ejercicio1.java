package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_ClasesYObjetos;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Instrucciones:
         * 1. Implemente la clase Biblioteca respetando los atributos y métodos indicados.
         * 2. Los atributos deben ser privados.
         * 3. Utilice métodos getters para acceder a los valores de los atributos.
         * 4. Implemente un constructor que inicialice el nombre y la cantidad de libros disponibles.
         * 5. Inicialice la cantidad de libros prestados en 0.
         * 6. Asegúrese de que las operaciones respeten las condiciones indicadas.
         */

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Central", 100);
        biblioteca1.prestarLibro();
        biblioteca1.devolverLibro();
        System.out.println(biblioteca1.toString());

    }

    public static class Biblioteca {

        private final String nombre; // Atributo final para evitar cambios, en code runner no se puede modificar.
        private int librosDisponibles;
        private int librosPrestados;

        public Biblioteca(String nombre, int librosDisponibles) {
            this.nombre = nombre;
            this.librosDisponibles = librosDisponibles;
            this.librosPrestados = 0;
        }

        public String getNombre() {
            return nombre;
        }

        public int getLibrosDisponibles() {
            return librosDisponibles;
        }

        public int getLibrosPrestados() {
            return librosPrestados;
        }

        public void prestarLibro() {
            if (librosDisponibles > 0) {
                librosDisponibles--;
                librosPrestados++;
            }
        }

        public void devolverLibro() {
            if (librosPrestados > 0) {
                librosDisponibles++;
                librosPrestados--;
            }
        }

        @Override
        public String toString() {
            return "Biblioteca: " + nombre + ", Libros Disponibles: " + librosDisponibles + ", Libros Prestados: " + librosPrestados;
        }
    }
}