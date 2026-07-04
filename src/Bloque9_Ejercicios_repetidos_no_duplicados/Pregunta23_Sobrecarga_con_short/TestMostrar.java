package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta23_Sobrecarga_con_short;

public class TestMostrar {

    public static void main(String[] args) {

        Mostrar m = new Mostrar();

        // Llamamos con dos short.
        //
        // No existe:
        // mostrar(short, short)
        //
        // Entonces Java promociona short a int.
        m.mostrar((short) 5, (short) 7);
    }
}
