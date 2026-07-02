package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.Cuestionario_HerenciaYPolimorfismo.Ejercicio4;

class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void mostrar() {
        System.out.println("Animal de especie: " + especie);
    }
}

class Perro extends Animal {
    private String nombre;

    public Perro(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Perro - Especie: " + getEspecie() + ", Nombre: " + nombre);
    }

    public String getEspecie() {
        return "Perro";
    }
}

class Vaca extends Animal {
    private String nombre;

    public Vaca(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Vaca - Especie: " + getEspecie() + ", Nombre: " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {
    //  Tipo de referencia,   Objeto real, es lo que se crea con new
        Animal a1 = new Animal("mamífero"); // tiene como tipo de referencia Animal y también como objeto real un Animal.
        Animal p1 = new Perro("mamífero", "Tobi");
        Animal v1 = new Vaca("mamífero", "Lola");
    //  Creo un objeto real de tipo Animal y lo guardo en una variable de referencia tipo Animal.

        // Instanceof se usa para preguntar:
        // ¿Este objeto es de esta clase o de alguna clase hija relacionada?
        // objeto instanceof clase
        // instanceof es un operador de identidad, es decir, si un objeto es de una clase determinada, esa clase es igual a la clase del objeto.

        // Opciones:
        System.out.println(a1 instanceof Animal); // true, porque a1 es un objeto de la clase Animal.
        System.out.println(a1 instanceof Perro);  // false, porque a1 no fue creado como Perro.
        System.out.println(a1 instanceof Vaca);   // false, porque a1 no fue creado como Vaca.

        System.out.println(p1 instanceof Animal); // true, porque p1 es un objeto de la clase Animal.
        System.out.println(p1 instanceof Perro); // true, porque p1 es un objeto de la clase Perro.
        System.out.println(p1 instanceof Vaca); // false, porque p1 no fue creado como Vaca.

        System.out.println(v1 instanceof Animal); // true, porque v1 es un objeto de la clase Animal.
        System.out.println(v1 instanceof Perro); // false, porque v1 no fue creado como Perro.
        System.out.println(v1 instanceof Vaca); // true, porque v1 es un objeto de la clase Vaca.

        // Aunque Perro y Vaca hereden de Animal, un animal común no se convierte mágicamente en perro o vaca, Java no
        // hace zoología creativa.

        // Respuesta final: b. true, false, false
    }
}