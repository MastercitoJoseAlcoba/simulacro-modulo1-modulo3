package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio8 {
    public static void main(String[] args) {
        Mensaje m = new Mensaje();
        m.mostrar("Hola");
        m.mostrar("Hola", 3);
        m.mostrar(10);

    }
    public static class Mensaje{
        public void mostrar(String mensaje){
            System.out.println(mensaje);
        }
        public void mostrar(String texto, int veces){
            for (int i = 0; i < veces; i++) {
                System.out.println(texto);
                /**
                 * Desarrollo del bucle for:
                 * empieza i en 0
                 * mientras i sea menor que veces
                 * aumenta i en 1 en 1
                 * imprime texto
                 */
            }
        }
        public void mostrar(int numero){
            System.out.println(numero);
        }
    }

}

/**
 *
 * ¿Cuáles son los criterios que Java utiliza para diferenciar métodos sobrecargados?
 * d. Nombre del método, número de parámetros y tipo de parámetros.
 *
 */