package Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta10;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super();
        this.cilindrada = cilindrada;
    }

    public Moto() {

    }

    public void mostrar() {
        System.out.println("Moto de marca: " + marca + ", cilindrada: " + cilindrada);
    }
}

