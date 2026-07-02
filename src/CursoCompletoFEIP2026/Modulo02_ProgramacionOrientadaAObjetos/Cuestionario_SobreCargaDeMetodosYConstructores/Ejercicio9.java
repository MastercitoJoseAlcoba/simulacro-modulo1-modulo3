package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio9 {
    public static void main(String[] args) {
        Mensaje m = new Mensaje();

        m.mostrar("Hola");               // Usa mostra (String)
        m.mostrar(5);                  // Usa mostra (int)
        m.mostrar("Edad:", 20);  // Usa mostra (String, int)

        // Por eso se llama polimorfismo estático o polimorfismo en tiempo de compilación.
        // En Java, la sobrecarga ocurre cuando varios métodos tienen el mismo nombre, pero distintos parámetros.

    }
    public static class Mensaje {

        public void mostrar(String texto) {
            System.out.println("Texto: " + texto);
        }

        public void mostrar(int numero) {
            System.out.println("Número: " + numero);
        }

        public void mostrar(String texto, int numero) {
            System.out.println(texto + " " + numero);
        }
    }
}
