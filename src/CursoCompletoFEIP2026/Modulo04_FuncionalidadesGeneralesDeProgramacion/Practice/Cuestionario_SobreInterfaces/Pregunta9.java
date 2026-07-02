package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta9 {
    /*
     * ¿Cómo se indica que una clase implementa una interfaz en Java?
     * C. Con la palabra "implements".
     */

    interface Animal {
        void hacerSonido();
    }
    class Perro implements Animal { // La parte clave es "implements"
        @Override
        public void hacerSonido() {
            System.out.println("Guau");
        }
    }
}
