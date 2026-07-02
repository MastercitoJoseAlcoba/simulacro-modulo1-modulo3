package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

abstract class Animal {
    abstract void hacerSonido();

    void respirar() {
        System.out.println("El animal respira");
    }
}

interface Mascota {
    void jugar();
}

class Perro extends Animal implements Mascota {

    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }

    @Override
    public void jugar() {
        System.out.println("El perro juega");
    }
}

public class Pregunta17 {
    public static void main(String[] args) {
        /*
         * ¿Cuál es la diferencia entre una clase abstracta y una interfaz en Java?
         * B. Las interfaces pueden contener solo métodos abstractos.
         *
         */
        Perro perro = new Perro();

        perro.respirar();
        perro.hacerSonido();
        perro.jugar();
    }
}