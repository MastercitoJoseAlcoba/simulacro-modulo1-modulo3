package PruebaDZA.Modulo1.DoWhile;

public class Practice {
    public static void main(String[] args) {
        int indice = 1;
        int suma = 0;
        // La suma de los números impares del 1 al 100
        do {
            if (indice % 2 != 0)
                suma += indice;
                indice++;
        } while (indice <= 100);
        System.out.println("La suma es: " + suma);
    }
}
