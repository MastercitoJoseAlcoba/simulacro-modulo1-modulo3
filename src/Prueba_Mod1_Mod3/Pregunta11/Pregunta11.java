package Prueba_Mod1_Mod3.Pregunta11;

public class Pregunta11 {
    public static void main(String[] args) {
        /**
         * Acá se está usando polimorfismo: aunque el array es de tipo Persona[], cada posición puede guardar un objeto
         * hijo de Persona.
         *
         * Array:
         * persona[0] personas = new Persona(); // caminar() devuelve 2
         * persona[1] estudiante = new Estudiante(); // caminar() devuelve 4
         * persona[2] deportista = new Deportista(); // caminar() devuelve 8
         * persona[3] personaMayorDeEdad = new PersonaMayorDeEdad(); // caminar() devuelve 1
         *
         * ¿Qué se muestra en la consola al ejecutar este programa?
         *
         * a. 10
         * b. 15
         * c. 20
         * d. 25
         *
         * Java no usa el método según el tipo de array (Persona), sino según el objeto real que hay adentro.
         *
         */

        Persona[] personas = new Persona[4];

        int suma = 0;

        personas[0] = new Persona();            // caminar() devuelve 2
        personas[1] = new Estudiante();         // caminar() devuelve 4
        personas[2] = new Deportista();         // caminar() devuelve 8
        personas[3] = new PersonaMayorDeEdad(); // caminar() devuelve 1

        for (int i = 0; i < personas.length; i++) {
            suma += personas[i].caminar(); // Entonces suma = 2 + 4 + 8 + 1 = 15
        }

        System.out.println(suma); // Imprime: 15

    }

    public static class Persona {
        public int caminar() {
            return 2;
        }
    }

    public static class Estudiante extends Persona {
        @Override
        public int caminar() {
            return 4;
        }
    }

    public static class Deportista extends Persona {
        @Override
        public int caminar() {
            return 8;
        }
    }

    public static class PersonaMayorDeEdad extends Persona {
        @Override
        public int caminar() {
            return 1;
        }
    }
}
