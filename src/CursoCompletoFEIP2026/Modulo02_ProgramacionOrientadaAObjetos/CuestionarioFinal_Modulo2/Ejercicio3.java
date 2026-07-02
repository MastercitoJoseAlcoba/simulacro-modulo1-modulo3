package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CuestionarioFinal_Modulo2;

public class Ejercicio3 {
    public static void main(String[] args) {

    }
    public static class Empleado{
        public Empleado(){
            System.out.println("Constructor predeterminado");
        }

        public Empleado(String nombre){
            System.out.println("Constructor con un parámetro: " + nombre); // b. Sí, es posible y el ejemplo dado ilustra la sobrecarga de constructores.
        }
    }
}
