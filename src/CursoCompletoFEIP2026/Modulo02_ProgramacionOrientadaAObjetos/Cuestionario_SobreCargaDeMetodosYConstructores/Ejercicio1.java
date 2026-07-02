package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio1 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Juan");

    }
    public static class Empleado{
        public Empleado(){
            System.out.println("Constructor predeterminado");
        }

        public Empleado(String nombre){
            System.out.println("Constructor con un parámetro: " + nombre);
        }
    }
}
/**
 * La respuesta correcta es:
 * d. Sí, es posible y el ejemplo dado ilustra la sobrecarga de constructores.
 *
 * Eso significa que una clase puede tener varios constructores con el mismo nombre, porque siempre se llama igual que
 * la clase, pero con diferente lista de parámetros.
 *
 */
