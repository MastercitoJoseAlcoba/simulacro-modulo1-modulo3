package PruebaDZA.Modulo2.sobreCargaDeMetodosYConstructores;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 10.0, 5);
        producto1.mostrarInformacionBasica();
        System.out.println("-".repeat(20));
        producto1.mostrarInformacionCompleta(true);
        System.out.println("-".repeat(20));
        producto1.mostrarInformacionConDescuento(true, 0.1);

    }
}
