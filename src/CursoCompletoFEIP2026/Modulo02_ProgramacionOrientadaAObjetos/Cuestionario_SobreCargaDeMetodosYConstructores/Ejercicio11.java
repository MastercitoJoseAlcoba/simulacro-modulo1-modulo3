package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio11 {
    public static void main(String[] args) {
        Multiplicar m = new Multiplicar();
        m.multi(2); // El número 2 en Java es tratado como un int, pero no existe ese método.


    }
    public static class Multiplicar {
        public void multi(byte a, byte b){
            System.out.println("Entre al byte " + (a * a));
        }

        public void multi(short a){
            System.out.println("Entre al short " + (a * a));
        }

        public void multi(long a){ // Entonces Java elige convertir int a long, pero no elige byte ni short, porque eso sería una conversión más reducida.
            System.out.println("Entre al long " + (a * a)); // 2 * 2 = 4
        }
    }
}
