package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio12 {
    public static void main(String[] args) {
        Sumar s = new Sumar();
        s.mostrar(5); // Imprime por consola: 5 + 5 = 10

    }
    public static class Sumar{
        public void mostrar(int dato){ // Entro a int
            System.out.println("Entro a int " + (dato+dato));
        }

        public void mostrar(double dato){
            System.out.println("Entro a double " + (dato+dato));
        }
    }
}

