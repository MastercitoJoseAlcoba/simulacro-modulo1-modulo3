package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_ClasesYObjetos;

public class Ejercicio20 {
    public static void main(String[] args) {
        Persona p1 = new Persona (1, "Luis", (byte) 30);
        System.out.println(p1.idPersona);

    }
    public static class Persona {
        private int idPersona;
        private String nombre;
        private byte edad;

        public Persona(int idPersona, String nombre, byte edad) {
            this.idPersona = idPersona;
            this.nombre = nombre;
            this.edad = edad;
        }
    }
}
/**
 * a. Las comillas del nombre deben ser comillas simples
 * b. Está mal el orden de los argumentos para utiizar el constructor
 * c. Hay que construir un constructor adecuado al tipo de dato, porque está faltando
 * d. Hay que castear la edad al tipo de dato byte, porque no entiende el tipo de dato ✅
 *
 *
 *
 *
 *
 *
 *
 */
