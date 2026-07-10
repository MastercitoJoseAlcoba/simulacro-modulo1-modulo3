package FIP_PRE_05_JMAC_2026_Guille.Pregunta11;

public class Ejemplos {
    public static void main(String[] args) {
        // =====================================================
        // EJEMPLO DE INTERFAZ USADA CORRECTAMENTE
        // =====================================================

        Perro perro = new Perro();

        perro.comer();     // método abstracto implementado por la clase Perro
        perro.dormir();    // método default heredado desde la interfaz Animal
        perro.jugar();     // método abstracto de la interfaz Mascota

        System.out.println("Edad máxima: " + Animal.EDAD_MAXIMA);

        // =====================================================
        // EJEMPLOS INCORRECTOS
        // =====================================================

        // ERROR:
        // No se puede crear una instancia directa de una interfaz.
        //
        // Animal animal = new Animal();

        // ERROR:
        // EDAD_MAXIMA es public static final.
        // Es una constante, no se puede cambiar.
        //
        // Animal.EDAD_MAXIMA = 20;
    }
}

// =====================================================
// INTERFAZ PRINCIPAL
// =====================================================

interface Animal {

    // En una interfaz, este atributo automáticamente es:
    // public static final int EDAD_MAXIMA = 15;
    //
    // Por eso NO es un atributo de instancia.
    // Es una constante compartida.
    int EDAD_MAXIMA = 15;

    // Método abstracto.
    // No tiene cuerpo.
    // La clase que implemente Animal debe completarlo.
    void comer();

    // Método default.
    // Sí tiene cuerpo.
    // Esto demuestra que la afirmación 1 es verdadera
    // y que la afirmación 5 es falsa.
    default void dormir() {
        System.out.println("El animal está durmiendo");
    }
}

// =====================================================
// UNA INTERFAZ PUEDE EXTENDER DE OTRA INTERFAZ
// =====================================================

interface Mascota extends Animal {

    // Esto demuestra que la afirmación 3 es verdadera.
    void jugar();
}

// =====================================================
// CLASE QUE IMPLEMENTA LA INTERFAZ
// =====================================================

class Perro implements Mascota {

    // Como Mascota extends Animal,
    // Perro debe implementar:
    // comer()
    // jugar()

    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void jugar() {
        System.out.println("El perro está jugando");
    }
}
