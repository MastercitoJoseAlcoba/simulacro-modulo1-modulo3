package Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta08;

public class Pregunta8 {
    public static void main(String[] args) {
        // No forma parte del ejercicio que pide el CodeRunner.
        calcularTotal(10, 122);
        calcularTotal(10, 122, 10);


    }
    // Observa los siguientes métodos:

    // Forma parte del ejercicio que pide el CodeRunner
    public static int calcularTotal(int cantidad, int precio) {
        return cantidad * precio;
    }
    // Forma parte del ejercicio que pide el CodeRunner
    // public int calcularTotal(int cantidad, int precio) {
    //     return cantidad + precio;


    // Forma correcta de hacerlo:
    public static int calcularTotal(int cantidad, int precio, int descuento) {
        return (cantidad * precio) - (cantidad * precio * descuento / 100);

        /**
         * El código anterior genera error porque ambos métodos tienen el mismo nombre y reciben los mismos parámetros.
         * Para que exista sobrecarga de métodos en Java, ¿qué se debe modificar?
         *
         * a. Cambiar solamente las instrucciones dentro del método, para que el código generado se diferencie con el
         * otro método.
         * b. Cambiar la cantidad de parámetros o el tipo de dato de algún parámetro.
         * c. Cambiar solamente el nombre de los parámetros.
         * d. Cambiar solamente el tipo de retorno del segundo método.
         *
         * Opción correcta: b.
         *
         * Idea conceptual: Para que haya sobrecarga de métodos, los métodos pueden tener el mismo nombre, pero deben
         * cambiar en la firma.
         *
         */

    }
}
