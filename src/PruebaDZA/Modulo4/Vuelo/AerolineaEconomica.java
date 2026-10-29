package PruebaDZA.Modulo4.Vuelo;

public class AerolineaEconomica extends Aerolinea {

    public AerolineaEconomica(int numeroVuelo, String origen, String destino) {
        super(numeroVuelo, origen, destino);
    }

    @Override
    public void revisarAsiento() {
        System.out.println("Revisando asiento de clase económica");
    }

    @Override
    public void mostrarDetallesVuelo() {
        super.mostrarDetallesVuelo();
        System.out.println("Tipo de vuelo: Económico");
    }
}
