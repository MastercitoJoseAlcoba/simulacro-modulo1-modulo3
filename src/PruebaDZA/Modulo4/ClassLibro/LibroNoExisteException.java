package PruebaDZA.Modulo4.ClassLibro;

public class LibroNoExisteException extends Exception {
    public LibroNoExisteException(String mensaje) {
        super(mensaje);
    }
}
