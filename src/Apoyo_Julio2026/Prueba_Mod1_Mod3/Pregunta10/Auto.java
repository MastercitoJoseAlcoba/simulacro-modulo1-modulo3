package Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta10;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, int cantidadPuertas) {
        super();
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto() {

    }

    public void mostrar() {
        System.out.println("Auto de marca: " + marca + ", puertas: " + cantidadPuertas);
    }
}
