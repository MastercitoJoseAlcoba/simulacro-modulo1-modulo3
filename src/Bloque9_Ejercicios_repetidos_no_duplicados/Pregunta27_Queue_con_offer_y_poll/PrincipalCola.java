package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta27_Queue_con_offer_y_poll;

import java.util.LinkedList;
import java.util.Queue;

public class PrincipalCola {

    public static void main(String[] args) {

        // Queue representa una cola.
        //
        // FIFO:
        // First In, First Out.
        //
        // Primero en entrar, primero en salir.
        Queue<String> nombres = new LinkedList<>();

        // offer agrega al final.
        nombres.offer("Antonio");
        nombres.offer("Carmen");
        nombres.offer("Mariana");
        nombres.offer("Dante");

        // Estado:
        // [Antonio, Carmen, Mariana, Dante]

        // poll elimina el primero.
        // Sale Antonio.
        nombres.poll();

        // Estado:
        // [Carmen, Mariana, Dante]

        // Sale Carmen.
        nombres.poll();

        // Estado:
        // [Mariana, Dante]

        // Agregamos Oscar al final.
        nombres.offer("Oscar");

        // Estado final:
        // [Mariana, Dante, Oscar]
        System.out.println(nombres);
    }
}

/*
SALIDA:
[Mariana, Dante, Oscar]

IDEA CLAVE:

offer():
agrega al final.

poll():
saca el primero.

Queue funciona como una fila.
*/