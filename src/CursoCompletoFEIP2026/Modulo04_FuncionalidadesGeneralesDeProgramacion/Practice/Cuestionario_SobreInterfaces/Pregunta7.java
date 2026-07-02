package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta7 {
    public static void main(String[] args) {
        Interface01 objeto = new Clase1();
        System.out.println(objeto);

        Interface02 objeto2 = new Clase1();
        System.out.println(objeto2);


    }
    // ¿Puede una clase en Java implementar múltiples interfaces?
    // Sí, siempre.

    // En Java una clase puede implementar múltiples interfaces usando coma:
    static class Clase1 implements Interface01, Interface02 {
        // Métodos obligatorios de Interface1 y Interface2
        @Override
        public void metodo1() {
            System.out.println("Método 1 de Interface1 y Interface2");

        }

        @Override
        public void metodo2() {
            System.out.println("Método 2 de Interface1 y Interface2");

        }
    }
}
