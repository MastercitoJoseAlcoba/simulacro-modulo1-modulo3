package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_HerenciaYPolimorfismo;

public class Ejercicio12 {
    public static void main(String[] args) {
        /**
         * ¿Si quiero hacer una instancia de persona, que no tiene madre, que debo colocar en el tercer atributo del constructor?
         *
         * c. null
         *
         */

        Persona persona1 = new Persona ("Juan", 25, null);
    }
    public static class Persona {
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
