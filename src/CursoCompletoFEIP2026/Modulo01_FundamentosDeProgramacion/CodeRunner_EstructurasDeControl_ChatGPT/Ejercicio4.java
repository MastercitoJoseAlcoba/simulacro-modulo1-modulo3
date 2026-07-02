package CursoCompletoFEIP2026.Modulo01_FundamentosDeProgramacion.CodeRunner_EstructurasDeControl_ChatGPT;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Ejercicio: 4 operaciones con tres tipos de variables
         *
         * Enunciado:
         * En este ejercicio, trabajarás con variables de tipo int, double y String, realizando operaciones simples y
         * devolviendo un mensaje final.
         *
         * Instrucciones:
         * 1. Cree una variable dobleNumero que almacene numero + 10.
         * 2. Cree una variable mitadPrecio que almacene precio / 2.
         * 3. Cree una variable descripción que concatene producto con texto: "en oferta".
         * 4. Retorne un mensaje con el siguiente formato exacto:
         * Número más 10: [valor], Precio a la mitad: [valor], Producto: [valor]
         *
         */

        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println(ejercicio4.procesarDatos(10, 15.99, "Monitor", "en oferta", 8.99));

    }
    public String procesarDatos(int numero, double precio, String producto, String descripcion, double mitadPrecio){
        double dobleNumero = numero + 10;
        return "Número más 10: " + dobleNumero + ", Precio a la mitad: " +
                mitadPrecio + ", Producto: " + descripcion;
    }
}
