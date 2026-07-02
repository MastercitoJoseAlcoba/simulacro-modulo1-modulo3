package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CuestionarioFinal_Modulo2;

public class Ejercicio7 {
    public static void main(String[] args) {

    }
    public static class Persona{ // No tiene atributos primitivos.
        public String nombre;
        public String cedula;
        public String direccion;

        public Persona(String nombre, String cedula, String direccion){
            this.nombre = nombre;
            this.cedula = cedula;
            this.direccion = direccion;
        }

        public Persona(String nombre){
            this.nombre = nombre;
        }

        public Persona(){

        }
    }
}
