package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio3 {
    public static void main(String[] args) {
        Mostrar m1 = new Mostrar();
        m1.display("null");

    }
    public static class Mostrar {
        public void display(Object o) {
            System.out.println("Esto es un String");
        }

        public void display(String s) {
            System.out.println("Esto es un String");
        }

    }
}

// Al ejecutar este programa que se muestra por la consola:

// c. Esto es un String
