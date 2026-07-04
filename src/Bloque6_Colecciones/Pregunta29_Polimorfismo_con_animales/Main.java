package Bloque6_Colecciones.Pregunta29_Polimorfismo_con_animales;

public class Main {

    public static void main(String[] args) {

        // Creamos una variable de tipo Animal.
        //
        // Pero el objeto real es Perro.
        //
        // Tipo de referencia:
        // Animal
        //
        // Tipo real:
        // Perro
        //
        // Esto es polimorfismo.
        Animal miAnimal = new Perro();

        // Aunque la variable sea Animal,
        // el objeto real es Perro.
        //
        // Como hacerSonido() está sobrescrito,
        // Java ejecuta la versión de Perro.
        miAnimal.hacerSonido();

        // Ahora la misma variable apunta a un Loro.
        //
        // Tipo de referencia:
        // Animal
        //
        // Tipo real:
        // Loro
        miAnimal = new Loro();

        // Se ejecuta hacerSonido() de Loro.
        miAnimal.hacerSonido();

        // Ahora la misma variable apunta a un Gato.
        //
        // Tipo de referencia:
        // Animal
        //
        // Tipo real:
        // Gato
        miAnimal = new Gato();

        // Se ejecuta hacerSonido() de Gato.
        miAnimal.hacerSonido();

        // Ahora creamos un Animal real.
        //
        // Tipo de referencia:
        // Animal
        //
        // Tipo real:
        // Animal
        Animal otroAnimal = new Animal();

        // Como el objeto real es Animal,
        // se ejecuta hacerSonido() de Animal.
        otroAnimal.hacerSonido();
    }
}
