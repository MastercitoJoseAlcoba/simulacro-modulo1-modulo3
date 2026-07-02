package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio17 {
    public static void main(String[] args) {
        Multiplicar m = new Multiplicar();
        // Caste automatic, de byte a int se llama widening casting
        m.multi((byte)20); // Entre al byte 400 // (20 * 20 = 400).
    }
    public static class Multiplicar{
        public void multi(byte a){
            System.out.println("Entre al byte " + (a * a));
        }

        public void multi(int a){
            System.out.println("Entre al int " + (a * a));
        }

        public void multi(long a){
            System.out.println("Entre al long " + (a * a));
        }
    }
}

