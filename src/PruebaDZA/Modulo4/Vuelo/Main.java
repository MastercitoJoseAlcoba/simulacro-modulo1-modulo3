package PruebaDZA.Modulo4.Vuelo;

public class Main {

    public static void main(String[] args) {

        Aerolinea economica = new AerolineaEconomica(
                125, "Montevideo", "Madrid"
        );

        Aerolinea premium = new AerolineaPremium(
                250, "Montevideo", "París"
        );

        economica.revisarAsiento();
        economica.mostrarDetallesVuelo();

        System.out.println("----------------");

        premium.revisarAsiento();
        premium.mostrarDetallesVuelo();
    }
}