package CursoCompletoFEIP2026.Modulo04_FuncionalidadesGeneralesDeProgramacion.Practice.Cuestionario_SobreInterfaces;/*
========================================
CÓDIGO INCORRECTO
========================================

El error está en que una interfaz NO usa implements
para heredar de otra interfaz.

INCORRECTO:

public interface Interface1 {
    public void metodo1();
}

public interface Interface2 implements Interface1 {
    public void metodo2();
}

public interface Interface3 implements Interface2 {
    public void metodo3();
}

public class UsarInterfaz implements Interface3 {

    public void metodo1() {
        System.out.println("soy el metodo 1");
    }

    public void metodo2() {
        System.out.println("soy el metodo 2");
    }

    public void metodo3() {
        System.out.println("soy el metodo 3");
    }
}

ERROR:
interface Interface2 implements Interface1
interface Interface3 implements Interface2

Una interfaz hereda de otra interfaz con extends.
*/


// ========================================
// CÓDIGO CORRECTO
// ========================================

interface Interface01 {
    void metodo1();
}

interface Interface02 extends Interface01 {
    void metodo2();
}

interface Interface03 extends Interface02 {
    void metodo3();
}

class UsarInterfaz1 implements Interface03 {

    @Override
    public void metodo1() {
        System.out.println("soy el metodo 1");
    }

    @Override
    public void metodo2() {
        System.out.println("soy el metodo 2");
    }

    @Override
    public void metodo3() {
        System.out.println("soy el metodo 3");
    }
}

public class Pregunta19 {
    public static void main(String[] args) {

        UsarInterfaz1 objeto = new UsarInterfaz1();

        objeto.metodo1();
        objeto.metodo2();
        objeto.metodo3();

        // Viendo las 3 interfaces anteriores y la clase que las implementa, es correcta esta opción: Falso.
        // Una interfaz no implementa otra interfaz.
    }
}