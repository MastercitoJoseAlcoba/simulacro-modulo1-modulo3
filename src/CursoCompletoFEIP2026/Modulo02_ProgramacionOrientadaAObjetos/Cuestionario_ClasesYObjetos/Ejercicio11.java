package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_ClasesYObjetos;

public class Ejercicio11 {
    public static void main(String[] args) {
        Asignatura a = new Asignatura("Programación", "001", 2024);
        System.out.println(a.toString());
    }
    public static class Asignatura {
        private String nombre;
        private String codigo;
        private int anio;

        public Asignatura(String nombre, String codigo, int anio) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.anio = anio;
        }

        @Override
        public String toString() {
            return "Asignatura{" +
                    "nombre='" + nombre + '\'' +
                    ", codigo='" + codigo + '\'' +
                    ", anio=" + anio +
                    '}';
        }
    }
}

/**
 * ¿Que hace el método toString?
 * a. Muestra todos los atributos de la instancia como esta definido en la clase Asignatura. ✅
 *
 */