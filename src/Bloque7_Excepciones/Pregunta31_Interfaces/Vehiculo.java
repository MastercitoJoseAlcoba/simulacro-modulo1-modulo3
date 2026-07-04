package Bloque7_Excepciones.Pregunta31_Interfaces;

// ================================
// PREGUNTA 31 — INTERFACES
// ================================
//
// Esto es una interfaz.
//
// Una interfaz funciona como un contrato.
//
// Es decir:
//
// Si una clase dice:
//
// implements Vehiculo
//
// entonces esa clase promete implementar
// los métodos abstractos de la interfaz.
//
// En este caso:
//
// acelerar()
// frenar()

public interface Vehiculo {

    void acelerar();

    // Este método no tiene cuerpo.
    //
    // No tiene llaves { }.
    //
    // En una interfaz, los métodos sin cuerpo
    // son abstractos por defecto.
    //
    // Eso significa que la interfaz solo dice:
    //
    // "Toda clase que me implemente debe tener este método".
    //
    // Pero no dice cómo se acelera.
    //
    // Eso lo decide cada clase.

    void frenar();

    // Este también es un método abstracto.
    //
    // Toda clase que implemente Vehiculo
    // está obligada a implementar frenar().
    //
    // Si no lo implementa, Java marca error,
    // salvo que esa clase sea abstracta.

    default void describir() {

        // Este es un método default.
        //
        // Un método default SÍ tiene cuerpo
        // dentro de una interfaz.
        //
        // Esto se permite en Java.
        //
        // Sirve para dar una implementación por defecto.
        //
        // Las clases que implementen la interfaz pueden:
        //
        // 1) Usarlo tal como está.
        // 2) Sobrescribirlo si quieren otro comportamiento.

        System.out.println("Yo soy un vehículo.");
    }
}