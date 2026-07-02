package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta6 {

        // ¿Cuál es la diferencia entre una interfaz funcional y una interfaz regular en Java?

        // Una interfaz funcional es una interfaz que tiene exactamente un método abstracto.

        // Ejemplo:
    @FunctionalInterface
    interface Operacion {
        int calcular(int a, int b); // Tiene un solo método abstracto.
    }

    // Una interfaz regular puede tener varios métodos abstractos:
    interface Animal {
        void comer();
        void dormir();
        void moverse();
    }

    // Respuesta final: Las interfaces funcionales tienen un solo método abstracto.


}

