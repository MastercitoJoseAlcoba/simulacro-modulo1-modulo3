package PruebaDZA.Modulo4.Vuelo;

public class AerolineaPremium extends Aerolinea {

    public AerolineaPremium(int numeroVuelo, String origen, String destino) {
        super(numeroVuelo, origen, destino);
    }

    @Override
    public void revisarAsiento() {
        System.out.println("Revisando asiento de clase Premium");
    }
}