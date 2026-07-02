package Apoyo_Julio2026.Prueba_Mod1_Mod3.Pregunta10;

public class Principal {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Genérica");

        Vehiculo a1 = new Auto("Toyota", 4);

        Vehiculo m1 = new Moto("Yamaha", 125);

        System.out.println(
                        (a1 instanceof Vehiculo) + "-" + // Da true porque Auto hereda de Vehículo.
                        (a1 instanceof Auto) + "-" + // Da true porque el objeto real es un Auto.
                        (a1 instanceof Moto) // Da false, porque el objeto real es una Moto.
        );
    }
}

/**
 * Salida final: true-true-false
 *
 * Idea conceptual: a1 es un Auto, y por herencia también cuenta como Vehículo, pero no como Moto.
 *
 */
