package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_SobreCargaDeMetodosYConstructores;

public class Ejercicio7 {
    public static void main(String[] args) {
        Sumar s = new Sumar();
        s.mostrar(3.2); // Imprime por consola: Entro a double 6.4

    }
    public static class Sumar {
        public void mostrar(int dato){
            System.out.println("Entro a int " + dato);
        }
        public void mostrar(double dato){
            System.out.println("Entro a double " + (dato+dato));
        }
    }
}


