package Apoyo_Septiembre2026.coderunners_sep_2026;

public class ProcesarTemperaturas {
    public static void main(String[] args) {

    }

    public int[] procesarTemperaturas(int[] temperaturas) {

        // Creamos un nuevo array llamado "resultado".
        //
        // Debe tener exactamente la misma cantidad de posiciones
        // que el array recibido como parámetro.
        //
        // Por ejemplo, si temperaturas tiene 5 elementos,
        // resultado también tendrá 5 elementos.
        int[] resultado = new int[temperaturas.length];


        // Recorremos todas las posiciones del array resultado.
        //
        // i comienza en 0 y llega hasta temperaturas.length - 1.
        for (int i = 0; i < temperaturas.length; i++) {


            // =====================================================
            // RECORRIDO INVERSO DEL ARRAY ORIGINAL
            // =====================================================
            //
            // Queremos tomar los valores de "temperaturas"
            // comenzando desde el último elemento.
            //
            // Para eso utilizamos:
            //
            // temperaturas.length - 1 - i
            //
            // El "-1" es necesario porque los índices de los arrays
            // comienzan en 0.
            //
            // Si el array tiene 4 posiciones:
            //
            // índices:  0   1   2   3
            //
            // cuando i = 0 -> accedemos a la posición 3
            // cuando i = 1 -> accedemos a la posición 2
            // cuando i = 2 -> accedemos a la posición 1
            // cuando i = 3 -> accedemos a la posición 0

            int temperatura = temperaturas[temperaturas.length - 1 - i];


            // =====================================================
            // CONVERSIÓN DE CELSIUS A FAHRENHEIT
            // =====================================================
            //
            // La fórmula es:
            //
            // F = C * 9 / 5 + 32
            //
            // Convertimos la temperatura obtenida y la guardamos
            // en la posición i del nuevo array.
            //
            // De esta manera, además de convertir las temperaturas,
            // estamos invirtiendo su orden.

            resultado[i] = temperatura * 9 / 5 + 32;
        }


        // Finalmente devolvemos el nuevo array.
        return resultado;
    }
}
