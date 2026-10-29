package PruebaDZA.Modulo4.Juego;

import java.util.Scanner;

public class JuegoAdivinar implements Juego {

    private int numero;
    private Scanner teclado;
    private int intentos;

    // Constructor
    public JuegoAdivinar() {
        this.numero = (int) (Math.random() * 101);
        this.teclado = new Scanner(System.in);
        this.intentos = 0;
    }

    // Método para jugar
    public void jugar() {
        int numeroUsuario;

        do {
            System.out.println("Introduce un número entre 0 y 100:");
            numeroUsuario = teclado.nextInt();

            intentos++;

            if (numeroUsuario < numero) {
                System.out.println("El número secreto es mayor.");
            } else if (numeroUsuario > numero) {
                System.out.println("El número secreto es menor.");
            }

        } while (numeroUsuario != numero);

        System.out.println("Has acertado en " + intentos + " intentos.");
    }

    @Override
    public void iniciarJuego() {
        System.out.println("¡Bienvenido al juego de adivinar!");
        jugar();
    }

    @Override
    public void finalizarJuego() {
        System.out.println("¡Juego finalizado!");
    }
}