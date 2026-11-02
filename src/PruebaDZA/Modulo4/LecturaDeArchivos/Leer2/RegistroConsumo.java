package PruebaDZA.Modulo4.LecturaDeArchivos.Leer2;

public class RegistroConsumo implements ConsumoAgua {

    private String nombre;
    private int lecturaAnterior;
    private int lecturaActual;

    public RegistroConsumo(String nombre, int lecturaAnterior, int lecturaActual) {
        this.nombre = nombre;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
    }

    @Override
    public double calcularConsumoAgua(int consumo) {
        return consumo;
    }

    @Override
    public String toString() {
        return nombre + " | Anterior: " + lecturaAnterior
                + " | Actual: " + lecturaActual;
    }
}