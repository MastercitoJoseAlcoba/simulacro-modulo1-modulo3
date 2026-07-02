package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;

public class Pregunta22 {
    public static void main(String[] args) {
        /**
         * ¿Qué se puede lograr mediante el uso de interfaces en Java?
         * B. Herencia múltiple.
         *
         * En Java, una clase no puede heredar de varias clases, pero sí puede implementar varias interfaces.
         *
         */

        Pato pato = new Pato();

        pato.volar();
        pato.nadar();
    }
}

interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }
}
