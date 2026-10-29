package PruebaDZA.Modulo4.Vuelo;

public abstract class Aerolinea implements Vuelo {
    private int numeroVuelo;
    private String origen;
    private String destino;

    public Aerolinea(int numeroVuelo, String origen, String destino) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public void mostrarDetallesVuelo() {
        System.out.println("Número de vuelo: " + numeroVuelo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
    }
}
