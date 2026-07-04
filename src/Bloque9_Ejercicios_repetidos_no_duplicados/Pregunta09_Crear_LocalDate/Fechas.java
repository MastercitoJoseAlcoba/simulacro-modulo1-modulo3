package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta09_Crear_LocalDate;

import java.time.LocalDate;

public class Fechas {

    public static void main(String[] args) {

        // Forma correcta de crear una fecha con LocalDate.
        //
        // LocalDate.of(año, mes, día)
        LocalDate fecha = LocalDate.of(2026, 4, 30);

        System.out.println(fecha);
    }
}

/*
SALIDA:
2026-04-30

IDEA CLAVE:

Para crear LocalDate:

LocalDate.of(anio, mes, dia)

No se usa:
new LocalDate()

No existe:
LocalDate.create()
*/