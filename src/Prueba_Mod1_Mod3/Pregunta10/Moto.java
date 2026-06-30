package Prueba_Mod1_Mod3.Pregunta10;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super(marca);
        this.cilindrada = cilindrada;
    }

    public void mostrar() {
        System.out.println("Moto de marca: " + marca + ", cilindrada: " + cilindrada);
    }
}

