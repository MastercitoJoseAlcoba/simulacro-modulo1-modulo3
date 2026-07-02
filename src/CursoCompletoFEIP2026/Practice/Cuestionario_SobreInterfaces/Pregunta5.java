package CursoCompletoFEIP2026.Practice.Cuestionario_SobreInterfaces;

interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}

interface Interface3 extends Interface01, Interface02 {
    void metodo3();
}

class UsarInterfaz implements Interface03 {

    @Override
    public void metodo1() {
        System.out.println("soy el método 1");
    }

    @Override
    public void metodo2() {
        System.out.println("soy el método 2");
    }

    @Override
    public void metodo3() {
        System.out.println("soy el método 3");
    }
}

public class Pregunta5 {
    public static void main(String[] args) {
        // Una interfaz puede heredar de varias interfaces.

        UsarInterfaz1 objeto = new UsarInterfaz1();

        objeto.metodo1();
        objeto.metodo2();
        objeto.metodo3();
    }
}