package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio20 {
    public static void main(String[] args) {
        Ambiguo a = new Ambiguo();
        a.proceso(35); // Se convierte automaticamente a double quedando 35.0


    }
    public static class Ambiguo{
        public void proceso(double a){ // recibe 1 argumento
            System.out.println("Entre a double " + a);
        }

        public void proceso(int a, int b){ // recibe 2 argumentos
            System.out.println("Entre a int " + (a+b));
        }
        // Java busca primero por cantidad de parámetros. Como se está enviando 1 solo valor, no puede usar proceso(int a, int b)
    }
}
