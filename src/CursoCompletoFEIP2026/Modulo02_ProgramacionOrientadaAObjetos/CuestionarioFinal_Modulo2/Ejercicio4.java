package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CuestionarioFinal_Modulo2;

public class Ejercicio4 {
    public static void main(String[] args) {

    }
    public class Multiplicar{
        public void multi(byte a) {
            System.out.println("Entre al byte " + (a * a));
        }

        public void multi(int a) {
            System.out.println("Entre al int " + (a * a)); // Entre al int 400, porque para entrar al byte tendira que haberlo casted a byte.
        }

        public void multi(long a) {
            System.out.println("Entre al long " + (a * a));
        }
    }
}
