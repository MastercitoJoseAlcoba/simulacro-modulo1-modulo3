package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.CodeRunner_ClasesAbstractas;

public class Pregunta3 {
    public static void main(String[] args) {

    }
    abstract class DispositivoElectronico {

        public abstract void encender();

        public abstract void apagar();
    }

    class Televisor extends DispositivoElectronico {

        @Override
        public void encender() {
            System.out.println("El televisor se enciende y muestra imágenes.");
        }

        @Override
        public void apagar() {
            System.out.println("El televisor se apaga y la pantalla queda en negro.");
        }
    }

    class Laptop extends DispositivoElectronico {

        @Override
        public void encender() {
            System.out.println("La laptop se enciende y está lista para su uso.");
        }

        @Override
        public void apagar() {
            System.out.println("La laptop se apaga y se apagan todas las funciones.");
        }
    }
}
