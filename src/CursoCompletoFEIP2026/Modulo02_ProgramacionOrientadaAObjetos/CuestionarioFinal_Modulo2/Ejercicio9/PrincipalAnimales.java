package CursoCompletoFEIP2026.Modulo02_ProgramacionOrientadaAObjetos.CuestionarioFinal_Modulo2.Ejercicio9;

class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
}

class Oveja extends Animal {
    private String nombre;

    public Oveja(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Pajaro extends Animal {
    private String nombre;

    public Pajaro(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class PrincipalAnimales {
    public static void main(String[] args) {

        Animal a1 = new Animal("mamífero");                // clase padre

        Animal o1 = new Oveja("mamífero", "Doli"); // clase hija
        Animal p1 = new Pajaro("ave", "Piolín");   // clase hija

        System.out.println(p1 instanceof Animal); // objeto Animal
        System.out.println(p1 instanceof Oveja);  // objeto Oveja tratado como Animal
        System.out.println(o1 instanceof Pajaro); // objeto Pajaro tratado como Animal

        // Resultado: true, false, false

    }
}