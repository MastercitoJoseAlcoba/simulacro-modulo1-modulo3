package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio15 {
    public static void main(String[] args) {
        Ejercicio15 ejercicio15 = new Ejercicio15();
        Test test = new Test();
        test.play(1);
        test.play("Hola");

        // Los métodos play están sobrecargados correctamente.

    }
    public static class Test{
        public void play(int numeroCancion){ // Llamaría al método con int.
            System.out.println(numeroCancion);
        }
        public void play(String nombreCancion){ // Llamaría al método con String.
            System.out.println(nombreCancion);
        }
    }
}
