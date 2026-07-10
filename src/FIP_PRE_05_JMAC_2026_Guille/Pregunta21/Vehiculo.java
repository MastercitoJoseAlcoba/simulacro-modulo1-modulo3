package FIP_PRE_05_JMAC_2026_Guille.Pregunta21;

public interface Vehiculo { // Solo esta parte da el CodeRunner
    void acelerar();
    void frenar();

    default void describir(){
        System.out.println("Yo soy un vehículo");
    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo() {
            @Override
            public void acelerar() {
                System.out.println("Acelerando");
            }

            @Override
            public void frenar() {

            }

            @Override
            public void describir() {
                Vehiculo.super.describir();
            }

        };
    }
}

/**
 * 1. Está interfaz está definida correctamente.
 * 2. Se puede crear una instancia de Vehiculo.
 * 3. No esta definida correctamente porque no puede tener un método implementado por defecto.
 * 4. Para implementarla desde una clase se usa extends.
 * 5. Si implementamos esta interfaz debemos implementar todos sus métodos abstractos.
 *
 * Explicación:
 *
 * La interfaz es válida y se implementa con implements.
 *
 * 1. Una interfaz puede declarar métodos abstractos.
 * 2. También puede tener métodos default con implementación.
 * 3. No se puede instanciar directamente una interfaz con new.
 * 4. Una clase que implementa la interfaz debe implementar los métodos abstractos, salvo que sea abstracta.
 *
 * Respuesta correcta: d. 1, 4 y 6.
 *
 */