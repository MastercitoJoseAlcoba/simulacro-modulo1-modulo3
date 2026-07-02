package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CodeRunner_HerenciaYPolimorfismo;

public class Ejercicio3 {

    public static class Vehiculo {
        private String marca;
        private String modelo;

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void arrancar() {
            System.out.println("El vehículo está arrancando.");
        }
    }

    public static class Automovil extends Vehiculo { // class Automovil extends Vehículo (CodeRunner)
        private int numeroDePuertas;

        public Automovil(String marca, String modelo, int numeroDePuertas) {
            super(marca, modelo);
            this.numeroDePuertas = numeroDePuertas;
        }

        public int getNumeroDePuertas() {
            return numeroDePuertas;
        }

        public void abrirPuertas() {
            System.out.println("Las puertas del automóvil se están abriendo.");
        }
    }

    public static class Motocicleta extends Vehiculo { // class Motocicleta extends Vehículo (CodeRunner)
        private int cilindrada;

        public Motocicleta(String marca, String modelo, int cilindrada) {
            super(marca, modelo);
            this.cilindrada = cilindrada;
        }

        public int getCilindrada() {
            return cilindrada;
        }

        public void acelerar() {
            System.out.println("La motocicleta está acelerando.");
        }
    }

    public static void main(String[] args) {
        Automovil automovil = new Automovil("Toyota", "Camry", 4);
        Motocicleta motocicleta = new Motocicleta("Honda", "CBR500R", 500);
        automovil.abrirPuertas();
        motocicleta.acelerar();

        // Polimorfismo: Almacenamos instancias en ambas clases en un arreglo de tipo Vehículo
        Vehiculo [] vehiculos = new Vehiculo[2];
        vehiculos [0] = automovil;
        vehiculos [1] = motocicleta;


        // Llamar a algunos métodos comunes usando polimorfismo
        // Opción: 1
        for (Vehiculo v : vehiculos) {
            v.arrancar();
            System.out.println("-".repeat(50));
        }
        // Opción: 2
        for (Vehiculo v : vehiculos) {
            if (v instanceof Automovil) {
                Automovil automovil1 = (Automovil) v;
                automovil1.abrirPuertas();
            }
        }
        // Opción: 3
        for (Vehiculo v : vehiculos) {
            if (v instanceof Motocicleta) {
                Motocicleta motocicleta1 = (Motocicleta) v;
                motocicleta1.acelerar();
            }
        }
        // Opción: 4
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }
    }
}