package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_HerenciaYPolimorfismo;

public class Ejercicio16 {
    public static void main(String[] args) {
        ClaseB b = new ClaseC();
    }

    public static class ClaseA {
        public ClaseA() {
            System.out.println("A - ");
        }
    }

    public static class ClaseB extends ClaseA {
        public ClaseB() {
            System.out.println("B - ");
        }
    }

    public static class ClaseC extends ClaseB {
        public ClaseC() {
            System.out.println("C - ");
        }
    }
}

// Respuesta: A - B - C