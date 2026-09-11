package Apoyo_Septiembre2026.coderunners_sep_2026;

public class ExcepcionesPrueba {
    public static void main(String[] args) {

    }
    public static void prueba(String dato, int[] vector) {

        // =====================================================
        // PRIMER TRY-CATCH
        // =====================================================
        // Intentamos acceder a una posición del vector.
        //
        // OJO con esta expresión:
        //
        // vector[vector[1]]
        //
        // Primero se obtiene el valor almacenado en vector[1].
        // Ese valor se utiliza después como índice del vector.

        try {

            System.out.println(vector[vector[1]]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Este catch se ejecuta cuando intentamos acceder
            // a una posición que no existe dentro del array.

            System.out.println("indice del array fuera de rango");
        }


        // =====================================================
        // SEGUNDO TRY-CATCH
        // =====================================================
        // Intentamos obtener la cantidad de caracteres
        // que tiene el String recibido.

        try {

            System.out.println(dato.length());

            // Esta línea solamente se ejecutará si dato.length()
            // pudo ejecutarse correctamente.

            System.out.println("Llegamos al final ok");

        } catch (NullPointerException e) {

            // Si dato es null, no podemos ejecutar length(),
            // porque no existe ningún objeto String sobre el cual
            // invocar el método.

            System.out.println("String null, no se puede saber su largo");
        }
    }
}
