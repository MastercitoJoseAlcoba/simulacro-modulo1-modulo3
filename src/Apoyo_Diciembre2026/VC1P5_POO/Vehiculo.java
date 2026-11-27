package Apoyo_Diciembre2026.VC1P5_POO;

public class Vehiculo {
    public static void main(String[] args) {

        Vehiculo1 v = new Vehiculo1("Honda");
        System.out.println(v.obtenerDatos());

        Automovil a = new Automovil("Chevrolet", 5);
        System.out.println(a.obtenerDatos());


        Automovil a2 = new Automovil("Fiat", 2);
        System.out.println(a2.obtenerDatos());

    }

    static class Vehiculo1 {
        protected String marca;

        public Vehiculo1(String marca) {
            this.marca = marca;
        }

        public String obtenerDatos() {
            return "Vehículo marca: " + marca;
        }
    }

    static class Automovil extends Vehiculo1 {
        private int cantidadPuertas;

        public Automovil(String marca, int cantidadPuertas) {
            super(marca);
            this.cantidadPuertas = cantidadPuertas;
        }

        @Override
        public String obtenerDatos() {
            return super.obtenerDatos() + " | Puertas: " + cantidadPuertas;
        }
    }
}
