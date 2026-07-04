package Bloque9_Ejercicios_repetidos_no_duplicados.Pregunta21_Clase_abstracta_Auto_y_polimorfismo;

abstract class Figura {

    // Una clase abstracta puede tener atributos.
    private String nombre;

    // Puede tener constructor.
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Puede tener métodos normales.
    public String getNombre() {
        return nombre;
    }

    // Puede tener métodos abstractos.
    public abstract double calcularArea();
}

/*
IDEA CLAVE:

Una clase abstracta:

- no se puede instanciar directamente
- puede tener atributos
- puede tener constructores
- puede tener métodos normales
- puede tener métodos abstractos

Esto NO se puede:

Figura f = new Figura("algo");

Porque Figura es abstracta.
*/