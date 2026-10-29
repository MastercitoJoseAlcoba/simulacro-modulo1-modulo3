package PruebaDZA.Modulo3.Arrays;

public class ArrayTridimensional {
    public static void main(String[] args) {
        // Crear e inicializar un array tridimensional para las salas de cine.
        // Cine [salas][filas][columnas]
        boolean [][][] cine = new boolean[2][3][4];

        // Supongamos que todos los asientos están disponibles al principio, los inicializamos a true
        for (int sala = 0; sala < cine.length; sala++) {
            for (int fila = 0; fila < cine[sala].length; fila++) {
                for (int asiento = 0; asiento < cine[sala][fila].length; asiento++) {
                    cine[sala][fila][asiento] = true;
                }
            }
        }
        // Ocupamos algunos asientos para el ejemplo
        // Ocupar el asiento en la primera fila, primera sala, primer asiento
        cine[0][0][0] = false;
        cine[0][0][1] = false;
        cine[0][1][2] = false;

        // Ocupar el asiento en la segunda sala, tercera fila, cuarto asiento
        cine[1][2][3] = false;

        // Mostrar el estado de los asientos en las salas
        for (int sala = 0; sala < cine.length; sala++) {
            for (int fila = 0; fila < cine[sala].length; fila++) {
                for (int asiento = 0; asiento < cine[sala][fila].length; asiento++) {
                    System.out.print("Sala " + sala + ", Fila " + fila + ", Asiento " + asiento + ": " + cine[sala][fila][asiento] + " ");
                }
                System.out.println("\n");
            }
            System.out.println();
        }
    }
}
