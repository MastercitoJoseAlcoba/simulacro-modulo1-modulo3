package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_HerenciaYPolimorfismo;

public class Ejercicio17 {
    public static void main(String[] args) {
        /**
         * De acuerdo a la relación existente, cuantas madres puede tener esta clase Persona.
         *
         * d. 1 ✅
         *
         */

    }
    public class Persona{
        private String nombre;
        private int edad;
        Persona madre;

        public Persona(String nombre, int edad, Persona madre) {
            this.nombre = nombre;
            this.edad = edad;
            this.madre = madre;
        }
    }
}
