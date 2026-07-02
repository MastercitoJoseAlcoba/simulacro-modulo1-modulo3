package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio13 {
    public static void main(String[] args) {
        Ambiguo a = new Ambiguo();
//        a.proceso(12, 10, 15); // c. Da un error de compilación al tratar de ejecutar

    }
    public static class Ambiguo{
        public void proceso(double a){ // recibe 1 argumento
            System.out.println("Entre a double " + a);
        }

        public void proceso(int a, int b){ // recibe 2 argumentos
            System.out.println("Entre a int " + (a+b));
        }

        // "Necesito un método llamado proceso que reciba 3 parámetros".
        // Pero no existe, por eso da error de compilación
        // No llega a imprimir nada. Tampoco lanza una excepción, porque el programa ni siquiera puede ejecutarse.

        // Proceso que recibe 3 argumentos
        public void proceso(int a, int b, int c){
            System.out.println("Entre a int " + (a+b+c));
            // Entre a int 37
        }
    }
}
