package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreClasesAbstractas;

public class ResumenClasesAbstractas {

    // Clase abstracta principal
    static abstract class DispositivoElectronico {

        // Variable de instancia
        String marca;

        // Constructor en clase abstracta
        public DispositivoElectronico(String marca) {
            this.marca = marca;
        }

        // Método abstracto: NO tiene cuerpo
        abstract void encender();

        // Otro método abstracto
        abstract void apagar();

        // Método concreto: SÍ tiene cuerpo
        void mostrarMarca() {
            System.out.println("Marca: " + marca);
        }

        // Método estático en clase abstracta
        static void mostrarTipoGeneral() {
            System.out.println("Todos son dispositivos electrónicos.");
        }
    }

    // Una clase abstracta puede heredar de otra clase abstracta
    static abstract class DispositivoPortatil extends DispositivoElectronico {

        int bateria;

        public DispositivoPortatil(String marca, int bateria) {
            super(marca);
            this.bateria = bateria;
        }

        // Método concreto propio
        void mostrarBateria() {
            System.out.println("Batería: " + bateria + "%");
        }

        // Método abstracto nuevo
        abstract void cargar();
    }

    // Clase concreta que hereda de una clase abstracta
    static class Laptop extends DispositivoPortatil {

        public Laptop(String marca, int bateria) {
            super(marca, bateria);
        }

        @Override
        void encender() {
            System.out.println("La laptop se enciende y está lista para su uso.");
        }

        @Override
        void apagar() {
            System.out.println("La laptop se apaga y se apagan todas las funciones.");
        }

        @Override
        void cargar() {
            System.out.println("La laptop se está cargando.");
        }
    }

    // Otra clase concreta
    static class Televisor extends DispositivoElectronico {

        public Televisor(String marca) {
            super(marca);
        }

        @Override
        void encender() {
            System.out.println("El televisor se enciende y muestra imágenes.");
        }

        @Override
        void apagar() {
            System.out.println("El televisor se apaga y la pantalla queda en negro.");
        }
    }

    public static void main(String[] args) {

        // No se puede instanciar una clase abstracta:
        // DispositivoElectronico dispositivo = new DispositivoElectronico("Genérica");

        DispositivoElectronico televisor = new Televisor("Samsung");

        televisor.mostrarMarca();
        televisor.encender();
        televisor.apagar();

        System.out.println("-------------");

        Laptop laptop = new Laptop("Lenovo", 85);

        laptop.mostrarMarca();
        laptop.mostrarBateria();
        laptop.encender();
        laptop.cargar();
        laptop.apagar();

        System.out.println("-------------");

        DispositivoElectronico.mostrarTipoGeneral();
    }
}